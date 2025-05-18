package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import database.DetailOrderDAO;
import database.OrderDAO;
import model.Brand;
import model.DetailOrder;
import model.Order;

/**
 * Servlet implementation class orderController
 */
@WebServlet("/quanly-donhang")
public class orderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public orderController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		/*
		 * // Bỏ dòng này đi OrderDAO orderDao = new OrderDAO(); ArrayList<Order>
		 * listOrder = orderDao.selectAll();
		 * 
		 * DetailOrderDAO orderDetailDao = new DetailOrderDAO();
		 * 
		 * // Với mỗi đơn hàng, lấy chi tiết sản phẩm và gán vào order for (Order order
		 * : listOrder) { ArrayList<DetailOrder> listOrderDetail =
		 * orderDetailDao.getOrderDetailsByOrderId(order.getOrderId());
		 * 
		 * order.setOrderDetails(listOrderDetail); }
		 * 
		 * // 1. Gửi request lên server: request.setAttribute("listOrder", listOrder);
		 * 
		 * // 2. Chuyển dữ liệu từ server lên trang giao diện brand.jsp:
		 * RequestDispatcher dispatcher =
		 * request.getRequestDispatcher("/dashboard/order.jsp");
		 * dispatcher.forward(request, response);
		 */
		
		 String action = request.getParameter("action");

		    if ("getOrderDetails".equals(action)) {
		        String orderId = request.getParameter("orderId");
		        DetailOrderDAO detailDao = new DetailOrderDAO();
		        ArrayList<DetailOrder> details = detailDao.getOrderDetailsByOrderId(orderId);

		        // Trả về HTML table rows
		        PrintWriter out = response.getWriter();
		        for (DetailOrder d : details) {
		            out.println("<tr>");
		            out.println("<td>" + d.getProduct().getProductId() + "</td>");
		            out.println("<td>" + d.getProduct().getProductName() + "</td>");
		            out.println("<td>" + d.getQuantityOrder() + "</td>");
		            out.println("<td>" + d.getProduct().getProductCost() + "₫</td>");
		            out.println("<td>" + d.getTotalPrice() + "₫</td>");
		            out.println("</tr>");
		        }
		        return;
		    }

		    // Mặc định: Hiển thị danh sách đơn hàng
		    OrderDAO orderDao = new OrderDAO();
		    ArrayList<Order> listOrder = orderDao.selectAll();

		    DetailOrderDAO orderDetailDao = new DetailOrderDAO();
		    for (Order order : listOrder) {
		        ArrayList<DetailOrder> listOrderDetail = orderDetailDao.getOrderDetailsByOrderId(order.getOrderId());
		        order.setOrderDetails(listOrderDetail);
		    }

		    request.setAttribute("listOrder", listOrder);
		    RequestDispatcher dispatcher = request.getRequestDispatcher("/dashboard/order.jsp");
		    dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
