<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
  <title> Responsive</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/table.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
 <link href="css/new.css" rel="stylesheet" type="text/css" media="all">
</head>
<body>




<h1>DVS Room Details</h1>
	<div class="w3-sidebar w3-bar-block w3-black w3-xxlarge" style="width:70px" title="add room details">

  <br><a href="movement1.jsp" class="w3-bar-item w3-button"><i class="fa fa-plus-square-o" title="Home"></i></a>
 <a href="application.html" class="w3-bar-item w3-button"><i class="fa fa-home" title="Application"></i></a> 
  <!--  <a href="#" class="w3-bar-item w3-button"><i class="fa fa-hotel" title="Room Availability"></i></a>
  <a href="#" class="w3-bar-item w3-button"><i class="fa fa-users" title="Overall Inmate"></i></a> 
  <a href="index.html" class="w3-bar-item w3-button"><i class="fa fa-power-off" title="Logout"></i></a> -->
  
</div>


<script>
function myFunction() {
  // Declare variables 
  var input, filter, table, tr, td, i;
  input = document.getElementById("myInput");
  filter = input.value.toUpperCase();
  table = document.getElementById("myTable");
  tr = table.getElementsByTagName("tr");

  // Loop through all table rows, and hide those who don't match the search query
  for (i = 0; i < tr.length; i++) {
    td = tr[i].getElementsByTagName("td")[1];
    if (td) {
      if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
        tr[i].style.display = "";
      } else {
        tr[i].style.display = "none";
      }
    } 
  }
}
</script>
<table class="container" id="myTable">
	<thead>
	
	<th><input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search"></th>
		<tr>
		
			
			<th><h1>Room Number</h1></th>
			<th><h1>Name</h1></th>
			<th><h1>Movement</h1></th>
			
			
			
		</tr>
	</thead> 
	<br><br><br><br>
	
	<tbody>
	
		<%
		
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dvs","root","");
			PreparedStatement ps=con.prepareStatement("select * from movement");
			ResultSet rs=ps.executeQuery();
			
			
			while(rs.next()){%>
				
				
				<tr>
			
			<td><%=rs.getString("rnum")%></td>
			<td><%=rs.getString("name")%></td>	
			<td><%=rs.getString("movement")%></td>
			
		</tr>	
			
			<%}
		}
		catch(Exception e){
			
		}
		
		%>
		
		
		
    
   
	</tbody>
</table>
</body>
</html>