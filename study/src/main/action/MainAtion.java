package main.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.mvc.SuperAction;

public class MainAtion implements SuperAction {

	public String excuteAction(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		String saw="";
		
		try
		{			
			saw = "/main/main.jsp";
		}
		catch(Exception e){}
		return saw;
	}

}