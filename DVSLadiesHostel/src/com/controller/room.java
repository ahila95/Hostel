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
 * Servlet implementation class room
 */
@WebServlet("/room")
public class room extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public room() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String share=request.getParameter("share");
		String number=request.getParameter("number");
		String vacancy=request.getParameter("vacancy");
		String upper=request.getParameter("upper");
		String lower=request.getParameter("lower");
		
		
		System.out.println(number);
		
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dvs","root","");
		PreparedStatement ps=con.prepareStatement("insert into room (rnum,vac,upper,lower,share) values(?,?,?,?,?) ");
		ps.setString(1, number);
		ps.setString(2, vacancy);
		ps.setString(3, upper);
		ps.setString(4, lower);
		ps.setString(5, share);
		ps.executeUpdate();
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			response.sendRedirect("room.jsp");
		}
	}

}
