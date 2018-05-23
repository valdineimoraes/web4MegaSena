<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:template title="Error!!">
	<jsp:body>
		<h2>Ooops!! Alguma coisa muito errada aconteceu!</h2>
		<p>Pedimos desculpas! A culpa não é sua, é nossa!</p>
		<p>A falha é nossa e em breve iremos corrigi-la!</p>		
		<div class="row">
			<div class="col s12 center">
				<img class="img-responsive" src="resources/img/error.png" height="500px">
			</div>		
		</div>
		<p align="center">
			<a class="btn btn-primary" href="#" role="button">Voltar</a>
		</p>		  
	</jsp:body>
</t:template>