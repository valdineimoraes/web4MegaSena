<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:template title="Error 400!!">
	<jsp:body>
		<h2>Opsss!!! Não há nada aqui!</h2>
		<p>Desculpa, mas a página requisitada não pode ser encontrada.</p>
		<p>Verifique o endereço e <a href="#">tente novamente</a>!</p>
		<div class="row">
			<div class="col s12 center">
				<img class="img-responsive" src="resources/img/error400.jpg">
			</div>		
		</div>		  
	</jsp:body>
</t:template>