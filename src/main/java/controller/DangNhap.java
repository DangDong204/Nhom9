package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DangNhap
 */
@WebServlet("/dang-nhap")
public class DangNhap extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DangNhap() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 doPost(request, response);
	     
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if ("dong".equalsIgnoreCase(username) && "123a".equals(password)) {
			// Lưu session nếu muốn
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            
            // Redirect về trang chính
            response.sendRedirect(request.getContextPath() + "/dashboard/index.jsp");

		} else {
            // Gửi lại thông báo lỗi về trang login
            request.setAttribute("thongbao", "Sai username hoặc password!");
            RequestDispatcher rd = request.getRequestDispatcher("/dashboard/login.jsp");
            rd.forward(request, response);
        }
	}

}
