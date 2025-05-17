package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.CustomerDAO;
import model.Customer;

/**
 * Servlet implementation class userController
 */
@WebServlet("/quanly-tk")
public class userController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public userController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerDAO customerDao = new CustomerDAO();
		ArrayList<Customer> listCustomer = customerDao.selectAll();
		
		// 1. Gửi request lên server:
		request.setAttribute("listCustomer", listCustomer);
		
		// 2. Chuyển dữ liệu từ server lên trang giao diện brand.jsp:
		RequestDispatcher dispatcher = request.getRequestDispatcher("/dashboard/account.jsp");
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
