package br.edu.utfpr;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet(urlPatterns = {"/u/main"}, name = "MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String address = "/WEB-INF/view/main.jsp";
		request.getRequestDispatcher(address).forward(request, response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		List<Integer> apostaMega = new ArrayList<>();
       /**
        * adicionar em uma lista os numeros escolhidos pelos usuarios
        * e mandar para o result para verificação do resultado.
        
		
        
		Integer n1 = request.getParameter("n1");
		apostaMega.add(n1);
		
		*/
		
		String login = request.getParameter("login");
		String pwd = request.getParameter("pwd");
		
		Collections.sort(apostaMega);
		doGet(request, response);
	}
	
	
	
	
	

}
