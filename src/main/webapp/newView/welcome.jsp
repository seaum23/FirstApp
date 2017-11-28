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
	<title>310 Project</title>
	<script type="text/javascript" src="lib/jquery.js"></script>
	<link href="newView/cartPo.css" type="text/css" rel="stylesheet">
</head>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
 
 <!-- font awesome -->
 <link rel="stylesheet" href="newView/font-awesome.min.css">
 <!-- owl Css -->
 <link rel="stylesheet" type="text/css" href="newView/owl.carousel.min.css">

<!-- animate css -->
<link rel="stylesheet" href="newView/animate.css">
 <!-- Style Css -->
 <link rel="stylesheet" type="text/css" href="newView/style.css">

<body>

<div>
	<nav class="navbar navbar-default navbar-fixed-top navbar-inverse">
	  <div class="container">
	      <form class="form-container" method="get" action="LoginServlet">
	      <!-- <button class="btn btn-lg btn-warning" name="crate"><a href="\cart.jsp"><span class="glyphicon glyphicon-shopping-cart"></span></a></button> -->
	      <button name="cart" type="submit" value="cart" class="btn btn-success btn-lg"><span class="glyphicon glyphicon-shopping-cart"></span>  Go to cart</button>   
	      </form>>
	  </div><!-- /.container-fluid -->
	</nav>
</div> <!-- navbar ends -->

<div class="container ">
	<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
	  <!-- Indicators -->
	  <ol class="carousel-indicators">
	    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
	    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
	    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
	  </ol>

	  <!-- Wrapper for slides -->
	  <div class="carousel-inner" role="listbox">
	    <div class="item active">
	       <a><img src="newView/feluda.jpg" alt="" width="1200px" height="500px" ></a>
	       <div class="carousel-caption">
				<h3>${title0}</h3>
    			<p>${price0}</p>
  			</div> <!-- carousel ends -->
	    </div>
	    <div class="item">
	      <a><img src="newView/inferno.jpg" alt="placeholder_img2"></a>
	       <div class="carousel-caption">
				<h3>${title1}</h3>
    			<p>${price1}</p>
  			</div> <!-- carousel ends -->
	    </div>
	    <div class="item">
	      <a><img src="newView/gitanjali.jpg" alt="placeholder_img3"></a>
	      	<div class="carousel-caption">
				<h3>${title2}</h3>
    			<p>${price2}</p>
  			</div> <!-- carousel ends -->
	    </div>
	  </div>

	  <!-- Controls -->
	  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
	    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
	    <span class="sr-only">Previous</span>
	  </a>
	  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
	    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
	    <span class="sr-only">Next</span>
	  </a>
	</div>

</div> <!-- carousel ends -->

<div class="table-responsive">
  <table id="table" class="table" >
	<!-- On cells (`td` or `th`) -->
	<tr>
	  <th width="300" class="active">Title</th>
	  <th width="300" class="success">Author</th>
	  <th width="100" class="warning">Price</th>
	</tr>
		<tr id="demo">
	  <td class="active">${title0}</td>
	  <td class="success">${author0}</td>
	  <td class="warning">${price0}</td>
	  <td width="100" class="warning">
	  <button id="addBtn" onClick="myFunction()" name="buy" value="submit" type="button" class="btn btn-primary btn-block">Buy</button>
	  </td>
	</tr>
	<tr>
	  <td class="active">${title1}</td>
	  <td class="success">${author1}</td>
	  <td class="warning">${price1}</td>
	  <td width="100" class="warning">
	  	<div>
	  	<button id="addBtn" onClick="myFunction()" name="buy" value="submit" type="button" class="btn btn-primary btn-block">Buy</button>
	  	</div>
	  </td>
	</tr>
		<tr>
	  <td class="active">${title2 }</td>
	  <td class="success">${author2}</td>
	  <td class="warning">${price2}</td>
	  <td width="100" class="warning">
	  	<div>
	  	<button id="addBtn" onClick="myFunction()" name="buy" value="submit" type="button" class="btn btn-primary btn-block">Buy</button>
	  	</div>
	  </td>
	</tr>
		<tr>
	  <td class="active">${title3}</td>
	  <td class="success">${author3}</td>
	  <td class="warning">${price3}</td>
	  <td width="100" class="warning">
	  	<div>
	  	<button id="addBtn" onClick="myFunction()" name="buy" value="submit" type="button" class="btn btn-primary btn-block">Buy</button>
	  	</div>
	  </td>
	</tr>
		<tr>
	  <td class="active">${title4}</td>
	  <td class="success">${author4}</td>
	  <td class="warning">${price4}</td>
	  <td width="100" class="warning">
	  	<div>
	  	<button id="addBtn" onClick="myFunction()" value="submit" type="button" class="btn btn-primary btn-block" >Buy</button>
	  	</div>
	  </td>
	</tr>
		<tr>
	  <td class="active">${title5}</td>
	  <td class="success">${author5}</td>
	  <td class="warning">${price5}</td>
	  <td width="100" class="warning">
	  	<div>
	  	<button id="addBtn" onClick="myFunction()" name="buy" value="submit" type="button" class="btn btn-primary btn-block">Buy</button>
	  	</div>
	  </td>
	</tr>
		<tr>
	  <td class="active">${title6}</td>
	  <td class="success">${author6}</td>
	  <td class="warning">${price6}</td>
	  <td width="100" class="warning">
	  	<div>
	  	<button id="addBtn" onClick="myFunction()" name="buy" value="submit" type="button" class="btn btn-primary btn-block">Buy</button>
	  	</div>
	  </td>
	</tr>
		<tr>
	  <td class="active">${title7}</td>
	  <td class="success">${author7}</td>
	  <td class="warning">${price7}</td>
	  <td width="100" class="warning">
	  	<div>
	  	<button id="addBtn" onClick="myFunction()" name="buy" value="submit" type="button" class="btn btn-primary btn-block">Buy</button>
	  	</div>
	  </td>
	</tr>
		<tr>
	  <td class="active">${title8}</td>
	  <td class="success">${author8}</td>
	  <td class="warning">${price8}</td>
	  <td width="100" class="warning">
	  	<div>
	  	<button id="addBtn" onClick="myFunction()" name="buy" value="submit" type="button" class="btn btn-primary btn-block">Buy</button>
	  	</div>
	  </td>
	</tr>
		<tr>
	  <td class="active">${title9}</td>
	  <td class="success">${author9}</td>
	  <td class="warning">${price9}</td>
	  <td width="100" class="warning">
	  	<div>
	  	<button id="addBtn" onClick="myFunction()" name="buy" value="submit" type="button" class="btn btn-primary btn-block">Buy</button>
	  	</div>
	  </td>
	</tr>
		<tr>
	  <td class="active">${title10}</td>
	  <td class="success">${author10}</td>
	  <td class="warning">${price10}</td>
	  <td width="100" class="warning">
	  	<div>
	  	<button id="addBtn" onClick="myFunction()" name="buy" value="submit" type="button" class="btn btn-primary btn-block">Buy</button>
	  	</div>
	  </td>
	</tr>
		<tr>
	  <td class="active">${title11}</td>
	  <td class="success">${author11}</td>
	  <td class="warning">${price11}</td>
	  <td width="100" class="warning">
	  	<div>
	  	<button id="addBtn" onClick="myFunction()" name="buy" value="submit" type="button" class="btn btn-primary btn-block">Buy</button>
	  	</div>
	  </td>
	</tr>
		<tr>
	  <td class="active">${title12}</td>
	  <td class="success">${author12}</td>
	  <td class="warning">${price12}</td>
	  <td width="100" class="warning">
	  	<div>
	  	<button id="addBtn" onClick="myFunction()" name="buy" value="submit" type="button" class="btn btn-primary btn-block">Buy</button>
	  	</div>
	  </td>
	</tr>
		<tr>
	  <td class="active">${title13}</td>
	  <td class="success">${author13}</td>
	  <td class="warning">${price13}</td>
	  <td width="100" class="warning">
	  	<div>
	  	<button id="addBtn" onClick="myFunction()" name="buy" value="submit" type="button" class="btn btn-primary btn-block">Buy</button>
	  	</div>
	  </td>
	</tr>
		<tr>
	  <td class="active">${title14}</td>
	  <td class="success">${author14}</td>
	  <td class="warning">${price14}</td>
	  <td width="100" class="warning">
	  	<div>
	  	<button id="addBtn" onClick="myFunction()" name="buy" value="submit" type="button" class="btn btn-primary btn-block">Buy</button>
	  	</div>
	  </td>
	</tr>
		<tr>
	  <td class="active">${title15}</td>
	  <td class="success">${author15}</td>
	  <td class="warning">${price15}</td>
	  <td width="100" class="warning">
	  	<div>
	  	<form>
	  	<button id="addBtn" onClick="myFunction()" name="buy" value="submit" type="button" class="btn btn-primary btn-block">Buy</button>
	  	</form>
	  	</div>
	  </td>
	</tr>
  </table>
</div>


<script>

function myFunction(){
	document.getElementById("addBtn").innerHTML="added";
}

var table = document.getElementById('table');


for(var i = 1; i < table.rows.length; i++)
{
    table.rows[i].onclick = function()
    {    
     	var var1= this.cells[0].innerHTML;
     	var var2 = this.cells[1].innerHTML;
     	var var3 = this.cells[2].innerHTML;
     	var var4 = this.cells[3].innerHTML;
     	$.ajax({
     	        type:"GET",//or POST
     	        url:"/LoginServlet",
     	        data:{data1:var1,data2:var2,data3:var3,data4:var4},
     	        //can send multipledata like {data1:var1,data2:var2,data3:var3
     	        //can use dataType:'text/html' or 'json' if response type expected 
     	        success:function(responsedata){
     	               // process on data
     	               alert("book has been added");

     	        }
     	     })
    };
}
</script>
					

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

<!-- owl js -->
<script type="text/javascript" src="js/owl.carousel.min.js"></script>

<!-- js -->
<script type="text/javascript" src="js/mobile.js"></script>
</body>
</html>