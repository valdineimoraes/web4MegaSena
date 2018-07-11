package br.edu.utfpr.filter;

import java.io.IOException;
import java.security.Principal;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class CookieFilter
 */
@WebFilter(dispatcherTypes = {DispatcherType.REQUEST }
					, servletNames = { "MainServlet" })
public class CookieFilter implements Filter {

    /**
     * Default constructor. 
     */
    public CookieFilter() {
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
		
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
			
		
		Principal principal = req.getUserPrincipal();
		
		if(principal != null) {
			boolean createNewCookie = true;
			Cookie[] cookies = req.getCookies();
			for(Cookie c : cookies) {
				if(c.getName().equals("username")) {
					createNewCookie = false;					
				}
			}
			
			if(createNewCookie) {		
				
				Cookie cookie = new Cookie("username", principal.getName());
				res.addCookie(cookie);
			}
			
			HttpSession session = req.getSession(false);
			if(session != null) {
				session.setAttribute("username", principal.getName());  
			}
			
			 
		}
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
	
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
