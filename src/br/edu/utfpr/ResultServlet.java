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
import javax.servlet.jsp.jstl.core.Config;

import br.edu.utfpr.dto.ResultDTO;

/**
 * Servlet implementation class ResultServlet
 */
@WebServlet(urlPatterns = {"/u/resultMega"}, name = "ResultServlet")
public class ResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static List<Integer> apostaMega;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ResultServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		/**
		 * Chama o metodo para gerar sorteio da megasena
		 */
		List<Integer> sorteados = gerarSorteioMegaSena();		
		config.getServletContext().setAttribute("SORTEADOS", sorteados);
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String address = "/WEB-INF/view/main.jsp";
		request.getRequestDispatcher(address).forward(request, response); 
	}

	/**
	 * @see HttpServlet#doPost(HgerarSorteioMegaSenattpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//TODO ler os números apostados pelo usuário
		
		apostaMega = new ArrayList<>();
		
		
		apostaMega.add(Integer.parseInt(request.getParameter("n1").trim()));
		apostaMega.add(Integer.parseInt(request.getParameter("n2").trim()));
		apostaMega.add(Integer.parseInt(request.getParameter("n3").trim()));
		apostaMega.add(Integer.parseInt(request.getParameter("n4").trim()));
		apostaMega.add(Integer.parseInt(request.getParameter("n5").trim()));
		apostaMega.add(Integer.parseInt(request.getParameter("n6").trim()));
		Collections.sort(apostaMega);
		
		
		
		//TODO compara com os sorteados com o list que está no escopo de contexto
		List<Integer> cartaoGerado = (List<Integer>)request.getServletContext().getAttribute("SORTEADOS");
		int acertos = contaAcertos(apostaMega, cartaoGerado);
		
		//TODO mensagem com os acertos
		String frase = verificaPremio(acertos);
		
		//TODO envia para o jsp apresentar os resultados
		ResultDTO dto = new ResultDTO(acertos, frase, apostaMega, cartaoGerado);
		String address = "/u/resultList";
		request.setAttribute("resultado", dto);		
		request.getRequestDispatcher(address).forward(request, response);
		
	}
	
	public static List<Integer> gerarSorteioMegaSena() {

		List<Integer> numeros = new ArrayList<>();

		for (int i = 1; i <=60; i++) {
			numeros.add(i);
		}
		Collections.shuffle(numeros);
		List<Integer> cartaoGerado = numeros.subList(0, 6);
		Collections.sort(cartaoGerado);
		
		return cartaoGerado;

	}

	public static int contaAcertos(List<Integer> apostaMega, List<Integer> cartaoGerado) {
		
		int acertos = 0;
		for (int i = 0; i < cartaoGerado.size(); i++) {
			Integer nroAposta = apostaMega.get(i);

			if (existeNumero(cartaoGerado, nroAposta)) {
				acertos++;
			}
		}
		return acertos;
	}

	public static boolean existeNumero(List<Integer> numeros, Integer n) {
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) == n) {
				return true;
			}
		}
		return false;
	}
	
	 public static String verificaPremio(int contador) {
	        switch (contador){
	            case 6:
	                return("Parabens voce ganhou a Mega Sena, voce teve "+contador+" acertos!");	                
	            case 5:
	            	return("Parabens voce ganhou a Quina, voce teve "+contador+" acertos!");	                
	            case 4:
	            	return("Parabens voce ganhou a Quadra, voce teve "+contador+" acertos!");	                
	            default:
	                return("Infelizmente voce nao ganhou nada, tente novamente...., voce teve "+contador+" acerto!");

	        }
	    }


}
