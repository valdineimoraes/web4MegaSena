<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags/"%>

<t:template>
	<jsp:body>
			
		<div>
		<p>Numeros Sorteados:
		${resultado.cartaoSorteado}</p>
		</div>
		
		<div>
		<p>Numeros Apostados:
		${resultado.apostaMega}</p>
		</div>
		
		<div>
		<p>Numeros de acertos:
		${resultado.acertos}</p>
		</div>
				
		<div>
		<p>Resultado:
		${resultado.frase}</p>
		</div>
		
	</jsp:body>
</t:template>