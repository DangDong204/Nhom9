package ads.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class View
 */
@WebServlet("/View")
public class View extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public View() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=UTF-8");
	    PrintWriter out = response.getWriter();
		out.append("<!DOCTYPE html>");
		out.append("<html lang=\"en\">");

		out.append("<head>");
		out.append("  <meta charset=\"utf-8\">");
		out.append("  <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">");
		out.append("  <title>Pages / Login - NiceAdmin Bootstrap Template</title>");
		out.append("  <meta content=\"\" name=\"description\">");
		out.append("  <meta content=\"\" name=\"keywords\">");

		out.append("  <link href=\"adimgs/favicon.png\" rel=\"icon\">");
		out.append("  <link href=\"assets/logo/apple-touch-icon.png\" rel=\"apple-touch-icon\">");
		out.append("  <link href=\"https://fonts.gstatic.com\" rel=\"preconnect\">");
		out.append("  <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i\" rel=\"stylesheet\">");

		out.append("  <link href=\"adcss/bootstrap.min.css\" rel=\"stylesheet\">");
		out.append("  <link href=\"assets/vendor/bootstrap-icons/bootstrap-icons.css\" rel=\"stylesheet\">");
		out.append("  <link href=\"assets/vendor/boxicons/css/boxicons.min.css\" rel=\"stylesheet\">");
		out.append("  <link href=\"assets/vendor/quill/quill.snow.css\" rel=\"stylesheet\">");
		out.append("  <link href=\"assets/vendor/quill/quill.bubble.css\" rel=\"stylesheet\">");
		out.append("  <link href=\"assets/vendor/remixicon/remixicon.css\" rel=\"stylesheet\">");
		out.append("  <link href=\"assets/vendor/simple-datatables/style.css\" rel=\"stylesheet\">");
		out.append("  <link href=\"adcss/style.css\" rel=\"stylesheet\">");

		out.append("</head>");

		out.append("<body>");
		out.append("<main>");
		out.append("  <div class=\"container\">");
		out.append("    <section class=\"section register min-vh-100 d-flex flex-column align-items-center justify-content-center py-4\">");
		out.append("      <div class=\"container\">");
		out.append("        <div class=\"row justify-content-center\">");
		out.append("          <div class=\"col-lg-4 col-md-6 d-flex flex-column align-items-center justify-content-center\">");

		out.append("            <div class=\"d-flex justify-content-center py-4\">");
		out.append("              <a href=\"index.html\" class=\"logo d-flex align-items-center w-auto\">");
		out.append("                <img src=\"adimgs/logo.png\" alt=\"\">");
		out.append("                <span class=\"d-none d-lg-block\">NiceAdmin</span>");
		out.append("              </a>");
		out.append("            </div>");

		out.append("            <div class=\"card mb-3\">");
		out.append("              <div class=\"card-body\">");
		out.append("                <div class=\"pt-4 pb-2\">");
		out.append("                  <h5 class=\"card-title text-center pb-0 fs-4\">Login to Your Account</h5>");
		out.append("                  <p class=\"text-center small\">Enter your username & password to login</p>");
		out.append("                </div>");

		out.append("                <form class=\"row g-3 needs-validation\" novalidate>");
		out.append("                  <div class=\"col-12\">");
		out.append("                    <label for=\"yourUsername\" class=\"form-label\">Username</label>");
		out.append("                    <div class=\"input-group has-validation\">");
		out.append("                      <span class=\"input-group-text\" id=\"inputGroupPrepend\">@</span>");
		out.append("                      <input type=\"text\" name=\"username\" class=\"form-control\" id=\"yourUsername\" required>");
		out.append("                      <div class=\"invalid-feedback\">Please enter your username.</div>");
		out.append("                    </div>");
		out.append("                  </div>");

		out.append("                  <div class=\"col-12\">");
		out.append("                    <label for=\"yourPassword\" class=\"form-label\">Password</label>");
		out.append("                    <input type=\"password\" name=\"password\" class=\"form-control\" id=\"yourPassword\" required>");
		out.append("                    <div class=\"invalid-feedback\">Please enter your password!</div>");
		out.append("                  </div>");

		out.append("                  <div class=\"col-12\">");
		out.append("                    <div class=\"form-check\">");
		out.append("                      <input class=\"form-check-input\" type=\"checkbox\" name=\"remember\" value=\"true\" id=\"rememberMe\">");
		out.append("                      <label class=\"form-check-label\" for=\"rememberMe\">Remember me</label>");
		out.append("                    </div>");
		out.append("                  </div>");

		out.append("                  <div class=\"col-12\">");
		out.append("                    <button class=\"btn btn-primary w-100\" type=\"submit\">Login</button>");
		out.append("                  </div>");

		out.append("                  <div class=\"col-12\">");
		out.append("                    <p class=\"small mb-0\">Don't have account? <a href=\"pages-register.html\">Create an account</a></p>");
		out.append("                  </div>");
		out.append("                </form>");

		out.append("              </div>");
		out.append("            </div>");

		out.append("            <div class=\"credits\">");
		out.append("              Designed by <a href=\"https://bootstrapmade.com/\">BootstrapMade</a>");
		out.append("            </div>");

		out.append("          </div>");
		out.append("        </div>");
		out.append("      </div>");
		out.append("    </section>");
		out.append("  </div>");
		out.append("</main>");

		out.append("<a href=\"#\" class=\"back-to-top d-flex align-items-center justify-content-center\"><i class=\"bi bi-arrow-up-short\"></i></a>");

		out.append("<script src=\"assets/vendor/apexcharts/apexcharts.min.js\"></script>");
		out.append("<script src=\"adjs/bootstrap.bundle.min.js\"></script>");
		out.append("<script src=\"assets/vendor/chart.js/chart.umd.js\"></script>");
		out.append("<script src=\"assets/vendor/echarts/echarts.min.js\"></script>");
		out.append("<script src=\"assets/vendor/quill/quill.js\"></script>");
		out.append("<script src=\"assets/vendor/simple-datatables/simple-datatables.js\"></script>");
		out.append("<script src=\"assets/vendor/tinymce/tinymce.min.js\"></script>");
		out.append("<script src=\"assets/vendor/php-email-form/validate.js\"></script>");
		out.append("<script src=\"adjs/main.js\"></script>");

		out.append("</body>");
		out.append("</html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
