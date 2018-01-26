package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class movement
 */
@WebServlet("/movement")
public class movement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public movement() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rnum=request.getParameter("rnum");
		String name=request.getParameter("name");
		String movement=request.getParameter("movement");
		
		
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dvs","root","");
		PreparedStatement ps=con.prepareStatement("insert into movement (rnum,name,movement) values(?,?,?) ");
		ps.setString(1, rnum);
		ps.setString(2, name);
		ps.setString(3, movement);
		ps.executeUpdate();
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			response.sendRedirect("movement.jsp");
		}
	}

}
