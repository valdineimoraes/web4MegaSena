package br.edu.utfpr.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet Filter implementation class CounterFilter
 */
@WebFilter(filterName = "DateBetFilter", dispatcherTypes = {
				DispatcherType.REQUEST 				
		}
					, servletNames = { "ResultServlet" })
public class DateBetFilter implements Filter {

    /**
     * Default constructor. 
     */
    public DateBetFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		class MyWrapper extends HttpServletRequestWrapper{
			
			public MyWrapper(HttpServletRequest req) {
				super(req);
			}
			
			@Override
			public String getParameter(String name) {
				if(name.equals("dateBet")) {
					Date now = new Date();
					String formatted = new SimpleDateFormat("dd/MM/yy hh:mm:ss").format(now);
					return formatted;
				}
				else {
					return super.getParameter(name);
				}
								
			}
		}
		
		System.out.println("*****************************************jshjdshfkjdsfhkjdsfhkjds");
		// pass the request along the filter chain
		chain.doFilter(new MyWrapper((HttpServletRequest)request), response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
