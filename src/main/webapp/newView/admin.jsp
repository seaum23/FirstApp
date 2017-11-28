<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Admin Page</title>
	<script type="text/javascript" src="lib/jquery.js"></script>
</head>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<link href="newView/logoutPo.css" type="text/css" rel="stylesheet"> 


<body>

<form class="form-containerLogout" method="get" action="../LoginServlet">
	<button class="btn btn-info btn-lg"><span class="glyphicon glyphicon-log-out"></span> Log out</button>
</form>


<div class="row">
  <div class="col-xs-12">
    <div class="page-header">
      <h1>Welcome ADMIN</h1>
    </div>
  </div>
</div>


<div class="row">
  <div class="col-xs-12">
    <div class="page-header">
		<form class="form-inline" action="LoginServlet" method="get">
		  <div class="form-group">
		    <label>Title</label>
		    <input type="text" class="form-control" name="bookA">
		  </div>
		    <div class="form-group">
		    <label>Price</label>
		    <input type="text" class="form-control" name="priceA">
		  </div>
		    <div class="form-group">
		    <label>year</label>
		    <input type="text" class="form-control" name="yearA">
		  </div>
		    <div class="form-group">
		    <label>Publisher</label>
		    <input type="text" class="form-control" name="publisherA">
		  </div>
		    <div class="form-group">
		    <label>Author</label>
		    <input type="text" class="form-control" name="authorA">
		  </div>
		  <button type="submit" class="btn btn-default" name="buttonA" value="button">Add</button>
		</form>
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
  <table id="tableAdmin" class="table" >
<tr>

</tr>

	<tr>
	  <th width="300" class="active">Title</th>
	  <th width="100" class="warning">Price</th>
	  <th width="300" class="warning">year</th>
	  <th width="300" class="warning">Publisher</th>
	  <th width="300" class="success">Author</th>
	  
	</tr>
<%
try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
String sql ="select * from books;";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>


	<tr>
	  <td class="active"><%=resultSet.getString("Title") %></td>
	  <td class="warning"><%=resultSet.getString("Price") %></td>
	  <td class="warning"><%=resultSet.getString("year") %></td>
	  <td class="warning"><%=resultSet.getString("publisher") %></td>
	  <td class="success"><%=resultSet.getString("Author") %></td>
	  
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


<script>
function myFunction(){
	document.getElementById("remove").innerHTML="removed";
}
var table = document.getElementById('tableAdmin');

 
for(var i = 1; i < table.rows.length; i++)
{
    table.rows[i].onclick = function()
    {    
     	var var9= this.cells[0].innerHTML;
     	var var10= this.cells[5].innerHTML;
     	$.ajax({
     	        type:"GET",//or POST
     	        url:"/LoginServlet",
     	        data:{data9:var9,data10:var10},
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






</body>
</html>