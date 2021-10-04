<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    
    import="com.sharyar.jewelrysystem.db.product.dto.ProductDTO"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<style>
  .jumbotron {
    background-color: #f4511e;
    color: #fff;
    padding: 70px 25px;
  }
  .container-fluid {
    padding: 60px 50px;
  }
  .bg-grey {
    background-color: #f6f6f6;
  }
  .logo-small {
    color: #f4511e;
    font-size: 50px;
  }
  .logo {
    color: #f4511e;
    font-size: 200px;
  }
  .thumbnail {
    padding: 0 0 15px 0;
    border: none;
    border-radius: 0;
  }
  .thumbnail img {
    width: 100%;
    height: 100%;
    margin-bottom: 10px;
  }
  .carousel-control.right, .carousel-control.left {
    background-image: none;
    color: #f4511e;
  }
  .carousel-indicators li {
    border-color: #f4511e;
  }
  .carousel-indicators li.active {
    background-color: #f4511e;
  }
  .item h4 {
    font-size: 19px;
    line-height: 1.375em;
    font-weight: 400;
    font-style: italic;
    margin: 70px 0;
  }
  .item span {
    font-style: normal;
  }
  .panel {
    border: 1px solid #f4511e; 
    border-radius:0 !important;
    transition: box-shadow 0.5s;
  }
  .panel:hover {
    box-shadow: 5px 0px 40px rgba(0,0,0, .2);
  }
  .panel-footer .btn:hover {
    border: 1px solid #f4511e;
    background-color: #fff !important;
    color: #f4511e;
  }
  .panel-heading {
    color: #fff !important;
    background-color: #f4511e !important;
    padding: 25px;
    border-bottom: 1px solid transparent;
    border-top-left-radius: 0px;
    border-top-right-radius: 0px;
    border-bottom-left-radius: 0px;
    border-bottom-right-radius: 0px;
  }
  .panel-footer {
    background-color: white !important;
  }
  .panel-footer h3 {
    font-size: 32px;
  }
  .panel-footer h4 {
    color: #aaa;
    font-size: 14px;
  }
  .panel-footer .btn {
    margin: 15px 0;
    background-color: #f4511e;
    color: #fff;
  }
  .navbar {
    margin-bottom: 0;
    background-color: #f4511e;
    z-index: 9999;
    border: 0;
    font-size: 12px !important;
    line-height: 1.42857143 !important;
    letter-spacing: 4px;
    border-radius: 0;
  }
  .navbar li a, .navbar .navbar-brand {
    color: #fff !important;
  }
  .navbar-nav li a:hover, .navbar-nav li.active a {
    color: #f4511e !important;
    background-color: #fff !important;
  }
  .navbar-default .navbar-toggle {
    border-color: transparent;
    color: #fff !important;
  }
 
  footer {
    background-color: #2d2d30;
    color: #f5f5f5;
    padding: 32px;
  }
  footer a {
    color: #f5f5f5;
  }
  footer a:hover {
    color: #777;
    text-decoration: none;
  }  
  h1 {
	text-align: center;
}
  .center {
  margin-left: auto;
  margin-right: auto;
}
td{
font-size:20px;
padding: 10px 20px
}
  </style>

</head>
<body>
<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>

    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
      <li><a href = "/JewelrySystem/Home.jsp">HOME</a></li>
        <li><a href = "/JewelrySystem/ShowProducts">DISPLAY PRODUCTS</a></li>
         <li><a href = "/JewelrySystem/AddProduct.jsp">ADD PRODUCTS</a></li>
      
      </ul>
    </div>
  </div>
</nav>

<div class="jumbotron text-center">
  <h1>Jewelry Store</h1> 
  
 
</div>

			<%ProductDTO product = (ProductDTO)request.getAttribute("details");
			
			%>
			
			<h1 style = "color:brown">Product Details</h1>
			<br><br><br>
			<table class="center">
			<tr>
			
				<td style="font-size:22px">
				<b>ID :</b> 
				</td>
				<td style="font-size:16px"><%out.println(product.getId()); %></td>
			</tr>
			<tr>
				<td style="font-size:22px">
				<b>Name :</b>
				</td>
				<td style="font-size:16px"><%out.println(product.getName()); %></td>
			</tr>
			<tr>
				<td style="font-size:22px">
				<b>Price :</b>
				</td>
				<td style="font-size:16px"><%out.println(product.getPrice()); %></td>
			</tr>
			<tr>
				<td style="font-size:22px">
				<b>Category :</b>
				</td>
				<td style="font-size:16px"><%out.println(product.getCategory().toString()); %></td>
			</tr>
			<tr>
				<td style="font-size:22px">
				<b>Status :</b>
				</td>
				<td style="font-size:16px"><%out.println(product.getStatus().toString()); %></td>
			</tr>
			<tr>
				<td style="font-size:22px">
				<b>Description :</b>
				</td>
				<td style="font-size:16px"><%out.println(product.getDescription()); %></td>
			</tr>
			
			
			
					
			</table>
			
			<table class = "center">
			<td >
				
				<button type = "button" id = "<% out.println(product.getId());%>" onClick = "delete_product(this.id)" class="btn btn-default">Delete</button>
				



			</td>
			<td>
				
				<button type = "button" onClick = "reply_click()" class="btn btn-default">Edit</button>
				



			</td>
</table>
<script type="text/javascript">

function delete_product(id)
	{
	window.location = '/JewelrySystem/RemoveProduct?id='+id;
	}
	
function reply_click(){
	
	window.location = '/JewelrySystem/ProductDetails?id='+<%out.println(product.getId());%> + '&edit=true';


}
</script>


</body>


</html>