<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags/"%>

<t:template>
	<jsp:body>
		<h2>Erro ao conectar com Banco de Dados</h2>
		<p>Falha ao tentar conectar com o banco!</p>
		<p> HTTP ERROR 400 - <a href="#">tente novamente</a>!</p>
		<div class="row">
			<div class="col s12 center">
				<img class="img-responsive" src="resources/img/error400.jpg">
			</div>		
		</div>				
	</jsp:body>
</t:template>