package com.yh.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String pwd = request.getParameter("pwd");
		if("yh".equals(username)&&"123".equals(pwd)){
			Logger logger = Logger.getLogger(LoginServlet.class);
			logger.info(username+"��¼====");
			System.out.println("��¼�ɹ�");
		}else{
			Logger logger = Logger.getLogger(LoginServlet.class);
			logger.info(username+"��¼ʧ��");
			System.out.println("��¼ʧ��");
		}
		
	}
}
