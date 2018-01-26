package com.controller;

import java.io.IOException;
import java.sql.*;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class save
 */
@WebServlet("/save")
public class save extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public save() {
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
		
	
		
		String name=request.getParameter("name");
		String id=request.getParameter("id");
		String fname=request.getParameter("organization");
		String email=request.getParameter("E-mail");
		String fmob=request.getParameter("contact");
		String mob=request.getParameter("mobile");
		String femail=request.getParameter("fax");
		String addr=request.getParameter("addr 1");
		String mname=request.getParameter("addr 2");
		String country=request.getParameter("country");
		String mmob=request.getParameter("state");
		String city=request.getParameter("city");
		String memail=request.getParameter("pin");
		String workplace=request.getParameter("pin1");

		String cname=request.getParameter("pin2");
		String cnumber=request.getParameter("pin3");
		String rem=request.getParameter("rem");
		
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/DVS","root","");
		PreparedStatement ps=con.prepareStatement("insert into joinform (name, id, organization, Email, contact, mobile, fax, addr1, addr2, country, state, city, pin, pin1, pin2, pin3, rem) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		ps.setString(1,name);
		ps.setString(2,id);
		ps.setString(3,fname);
		ps.setString(4,email);
		ps.setString(5,fmob);
		ps.setString(6,mob);
		ps.setString(7,femail);
		ps.setString(8,addr);
		ps.setString(9,mname);
		ps.setString(10,country);
		ps.setString(11,mmob);
		ps.setString(12,city);
		ps.setString(13,memail);
		ps.setString(14,workplace);
		ps.setString(15,cname);
		ps.setString(16,cnumber);
		ps.setString(17,rem);
		ps.executeUpdate();
		
	}
	catch(Exception e) {
		
		System.out.println(e);
	}
	
	finally {
		response.sendRedirect("application.html");
	}
		
	}

}
