<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:template title="Error 404!!">
	<jsp:body>
		<h2>Not-found 404!</h2>
		<p>Desculpa, mas a página requisitada não pode ser encontrada.</p>
		<p>Verifique o endereço e <a href="#">tente novamente</a>!</p>
		<div class="row">
			<div class="col s12 center">
				<img class="img-responsive" src="resources/img/404.png">
			</div>		
		</div>		  
	</jsp:body>
</t:template>