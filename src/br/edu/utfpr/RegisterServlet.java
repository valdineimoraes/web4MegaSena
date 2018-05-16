package br.edu.utfpr;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.edu.utfpr.model.UserBean;
import br.edu.utfpr.util.Sha;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet({ "/register" })
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String address = "/WEB-INF/view/register.jsp";
		request.getRequestDispatcher(address).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String login = request.getParameter("login");
		String pwd = request.getParameter("pwd");
		try {
			pwd = Sha.hash256(pwd);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		try {
			UserBean user = new UserBean(name, login, pwd);
			user.save();
		
			response.sendRedirect(request.getContextPath() + "/u/main");
		} catch (Exception e) {
			response.sendRedirect(request.getContextPath() + "/errorbanco.jsp");
		}
		
		/**UserBean user = new UserBean(name, login, pwd);
		
		
		user.save();
		
		response.sendRedirect(request.getContextPath() + "/login.jsp");*/
	}


}
