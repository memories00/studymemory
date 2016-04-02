package test.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.mvc.SuperAction;

public class TestAction implements SuperAction {
	public String excuteAction(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		
		String view = "";
		
		try
		{
			view = "/test/test.jsp";
		}
		catch(Exception e) {}
		
		return view;
	}

}
