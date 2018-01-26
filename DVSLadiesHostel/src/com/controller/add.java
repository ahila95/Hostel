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
 * Servlet implementation class add
 */
@WebServlet("/add")
public class add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public add() {
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
		String name=request.getParameter("name");
		String id=request.getParameter("id");
		String design=request.getParameter("design");
		String addr=request.getParameter("addr");
		String mob=request.getParameter("mob");
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crystal","root","");
		PreparedStatement ps=con.prepareStatement("insert into emp (name,id,design,addr,mob) values(?,?,?,?,?) ");
		ps.setString(1, name);
		ps.setString(2, id);
		ps.setString(3, design);
		ps.setString(4, addr);
		ps.setString(5, mob);
		ps.executeUpdate();
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			response.sendRedirect("addEmp.jsp");
		}
	}

}
