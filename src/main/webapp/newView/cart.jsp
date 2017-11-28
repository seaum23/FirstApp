<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
	<title>Cart</title>
	<script type="text/javascript" src="lib/jquery.js"></script>
</head>

<link href="newView/logoutPo.css" type="text/css" rel="stylesheet">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
 
 <!-- font awesome -->
 <link rel="stylesheet" href="css/font-awesome.min.css">
 <!-- owl Css -->
 <link rel="stylesheet" type="text/css" href="css/owl.carousel.min.css">

<!-- animate css -->
<link rel="stylesheet" href="css/animate.css">
 <!-- Style Css -->
 <link rel="stylesheet" type="text/css" href="css/style.css">

<body>

<form class="form-containerLogout" method="get" action="../LoginServlet">
	<button class="btn btn-info btn-lg"><span class="glyphicon glyphicon-log-out"></span> Log out</button>
</form>


<div class="container-fluid cart_body">


<div class="row">
  <div class="col-xs-12">
    <div class="page-header">
      <h1>${userMail} Shopping Cart</h1>
    </div>
  </div>
</div>



<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
int total = 0;
int totalItem = 0;

String id2 = (String) request.getAttribute("userMail");
String id = request.getParameter("userId");
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3311/";
String dbName = "online_bookstore";
String userId = "root";
String password = "root";
//String mail = request.getAttribute("userMail");

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<div class="table-responsive">
  <table id="table" class="table" >
<tr>

</tr>

	<tr>
	  <th width="300" class="active">Title</th>
	  <th width="300" class="success">Author</th>
	  <th width="100" class="warning">Price</th>
	</tr>
<%
try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
String sql ="select title, author, price from books join shoppincart on shopTitle = title where cusemail='"+id2+"';";

System.out.println(id2+" in jsp");

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
	int temp = Integer.parseInt(resultSet.getString("Price"));
	total+=temp;
	totalItem+=1;
%>


	<tr>
	  <td class="active"><%=resultSet.getString("Title") %></td>
	  <td class="success"><%=resultSet.getString("Author") %></td>
	  <td class="warning"><%=resultSet.getString("Price") %></td>
	  <td width="100" class="warning">
	  	<button id="remove" onClick="myFunction()" name="buy" value="submit" type="button" class="btn btn-primary btn-block">Remove</button>
	  </td>
	</tr>

<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
</div>

<div class="col-xs-12 col-sm-2">
  <h3 class="h3-price">
   	Total Price Is <%= total %>
  </h3>
  <small>item total <%= totalItem %></small>
</div>

<script>
function myFunction(){
	document.getElementById("remove").innerHTML="removed";
}
var table = document.getElementById('table');


for(var i = 1; i < table.rows.length; i++)
{
    table.rows[i].onclick = function()
    {    
     	var var5= this.cells[0].innerHTML;
     	var var6 = this.cells[1].innerHTML;
     	var var7 = this.cells[2].innerHTML;
     	var var8 = this.cells[3].innerHTML;
     	$.ajax({
     	        type:"GET",//or POST
     	        url:"/LoginServlet",
     	        data:{data5:var5,data6:var6,data7:var7,data8:var8},
     	        //can send multipledata like {data1:var1,data2:var2,data3:var3
     	        //can use dataType:'text/html' or 'json' if response type expected 
     	        success:function(responsedata){
     	               // process on data
     	               alert("book has been removed");

     	        }
     	     })
    };
}
</script>


</div>


<!-- jquery cdn -->

<script
  src="https://code.jquery .com/jquery-3.2.1.min.js"
  integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
  crossorigin="anonymous"></script>



<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

<!-- owl js -->
<script type="text/javascript" src="js/owl.carousel.min.js"></script>

<!-- js -->
<script type="text/javascript" src="js/mobile.js"></script>
</body>
</html>