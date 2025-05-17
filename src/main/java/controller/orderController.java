package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.OrderDAO;
import model.Brand;
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
		
		// Bỏ dòng này đi
		OrderDAO orderDao = new OrderDAO();
		ArrayList<Order> listOrder = orderDao.selectAll();
		
		// 1. Gửi request lên server:
		request.setAttribute("listOrder", listOrder);
		
		// 2. Chuyển dữ liệu từ server lên trang giao diện brand.jsp:
		RequestDispatcher dispatcher = request.getRequestDispatcher("/dashboard/order.jsp");
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
