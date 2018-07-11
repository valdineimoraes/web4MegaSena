package br.edu.utfpr;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.utfpr.dto.ResultDTO;

/**
 * Servlet implementation class ResultServlet
 */
@WebServlet("/u/resultList")
public class ResultListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ResultListServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HgerarSorteioMegaSenattpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String date = request.getParameter("dateBet");
		
		ResultDTO dto = (ResultDTO) request.getAttribute("resultado");
		String address = "/WEB-INF/view/result.jsp";
		request.setAttribute("resultado", dto);
		request.setAttribute("dateBet", date); 
		request.getRequestDispatcher(address).forward(request, response);
		
		//doGet(request, response);
	}

	
}
