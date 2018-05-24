<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:template title="Error 403!!">
	<jsp:body>
		<h2>O acesso a localhost foi negado</h2>
		<p>Você não tem autorização para ver esta página.</p>
		<p> HTTP ERROR 403 - <a href="#">tente novamente</a>!</p>
		<div class="row">
			<div class="col s12 center">
				<img class="img-responsive" src="resources/img/403.png">
			</div>		
		</div>		  
	</jsp:body>
</t:template>