<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Sales Inquiry Form Responsive Widget Template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Meta tag Keywords -->
<!-- css files -->
<link href="css/app.css" rel="stylesheet" type="text/css" media="all">
<!-- //css files -->
<!-- online-fonts -->
<link href="//fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i&subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese" rel="stylesheet">

</head>
<body>
<div class="agile-header">
		<h1>Room Details</h1>
	</div>
	<!--//header-->
	<!--main-->
	<div class="agileits-main">
		<div class="wrap">
		<form action="room" method="post">
			<ul>
				<li class="text">Sharing</li>
				<li><input name="share" type="text" required></li>
			</ul>
			<ul>
			<li class="text">Room number</li>
				<li><input name="number" type="text" required></li>
			</ul>
			<ul>
				<li class="text">Vacancy</li>
				<li><input name="vacancy" type="text" required></li>
			</ul>
			<ul>
				<li class="text">Upper Cot</li>
				<li><input name="upper" type="text" required></li>
			</ul>
			<ul>
				<li class="text">Lower Cot</li>
				<li><input name="lower" type="text" required></li>
			</ul>
			
			<div class="clear"></div>
			<div class="agile-submit">
				<input type="submit" value="submit">
				<input type="reset" value="reset">
			</div>
			</form>
		</div>	
	</div>
<!--//main-->
<!--footer-->

<!--//footer-->
</body>
</html>