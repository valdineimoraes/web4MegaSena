<%@tag description="Template principal" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="title"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<title>${title}</title>
<base href="${pageContext.request.contextPath}/">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="icon" type="image/png" href="megasena.png" />

<title>MegaSena Loteriks</title>

<!-- Bootstrap core CSS-->
<link href="resources/css/sticky-footer-navbar.css" rel="stylesheet"> 
<link href="resources/css/formlogin.css" rel="stylesheet"> 

<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.min.css">


</head>

<body>
	<header>
		<!-- Fixed navbar -->
		<nav class="navbar navbar-default navbar-fixed-top">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#navbar" aria-expanded="false"
						aria-controls="navbar">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#"> Mega Sena Loteriks</a>
				</div>
				<div id="navbar" class="collapse navbar-collapse">
					<ul class="nav navbar-nav">
						<li class="active"><a href="index.jsp">Home</a></li>
							
							<c:choose>
								
							<c:when test="${not empty pageContext.request.userPrincipal}">					 
							<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" role="button" aria-haspopup="true"
							aria-expanded="false">Bem Vindo, ${username} <span class="caret"></span></a>
								<ul class="dropdown-menu">
									<li><a href="logout">Logout</a></li>
								</ul>
							</li>
							</c:when>
							
							<c:otherwise>
								<li><a href="u/main">Logar</a></li>
							</c:otherwise>
							
							</c:choose>
					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
		</nav>
	</header>

<!----====================Contexto BODY================-->
	
	<main id="content" class="container"> <jsp:doBody /> </main>
	
<!---------====================RODAPE================-->

	<footer class="footer">
		<div class="footer-copyright">
			<div class="container">
				&#169; Copyright <span id="year"></span> - Todos os direitos
				reservados - Moraes Ltda.
			</div>
		</div>
	</footer>


	<!-- Bootstrap core JavaScript
    ================================================== -->
	
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>	
	<script src="resources/js/bootstrap.js"></script>	
	
	
	
</body>
</html>