<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags/"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:template>
	<jsp:body>
	
	<div class="container">
		
   		<div class="row">
			<div class="col-md-2"> 
			
			</div>
			
	        <div class="col-md-8"> 
		
		<table class="tabMega">
      <tbody>
			<tr>
              <td style="background-color: #CCCCCC">
              <strong>Resultado da sua Aposta na Mega Sena</strong>
              </td>
            </tr>
            
            <tr>
              <td>
				
				<!--  Numeros Sorteados -->
				<table class="tabMegaResult">
                  <tbody>
					<tr>
						<p>Data: ${dateBet} </p>
						<p>Numeros Sorteados</p>
						
						<c:forEach var="resultMega" items="${resultado.cartaoSorteado}">
							<td width="45" height="45" style="background-image:url(resources/img/megaball.gif); 
		                    								  background-repeat:no-repeat">
			                    <div align="center" style="color:#FFFFFF; font-weight:bold; font-size:16px">
			                    	${resultMega}
			                    </div>
		                    </td>
						</c:forEach>
						
					</tr>
                </tbody>
				</table>
				
				
				<!--  Numeros Apostados -->
				<table class="tabMegaResult">
                  <tbody>
					<tr>
						<p>Numeros Apostados</p>
						<c:forEach var="result" items="${resultado.apostaMega}">
							<td width="45" height="45" style="background-image:url(resources/img/megaball.gif); 
		                    								  background-repeat:no-repeat">
			                    <div align="center" style="color:#FFFFFF; font-weight:bold; font-size:16px">
			                    	${result}
			                    </div>
		                    </td>
						</c:forEach>
					</tr>
                </tbody>
				</table>
				
				<!--  Quantidade de Acertos -->
				<table class="tabMegaResult">
                  <tbody>
					<tr>
						<p>Quantidade de Acertos</p>
							<td width="45" height="45" style="background-image:url(resources/img/megaball.gif); 
		                    								  background-repeat:no-repeat">
			                    <div align="center" style="color:#FFFFFF; font-weight:bold; font-size:16px">
			                    	${resultado.acertos}
			                    </div>
		                    </td>
					</tr>
                </tbody>
				</table>
				
		<!-- Verificação dos acertos e mandando msg conforme acertos -->
		<c:set var="acertos" value="${resultado.acertos}" />
		<c:choose>
			<c:when test="${acertos == '6'}">
				<div class="alert alert-success" role="alert">
					<p> 
					${resultado.frase}
					</p>
				</div>
			</c:when>
			
			<c:when test="${acertos == '5'}">
				<div class="alert alert-primary" role="alert">
					<p> 
					${resultado.frase}
					</p>
				</div>
			</c:when>
			
			<c:when test="${acertos == '4'}">
				<div class="alert alert-warning" role="alert">
					<p> 
					${resultado.frase}
					</p>
				</div>
			</c:when>
			
			<c:otherwise>
				<div class="alert alert-danger" role="alert">
					<p> 
					${resultado.frase}
					</p>
				</div>
			</c:otherwise>
		</c:choose>
		
		
		</td>
            </tr>
          </tbody>
		</table>
		
		<div> <Br>
		<a href="u/main" class="btn btn-primary">Apostar Novamente</a>
		</div>
		</div>
		
		<div class="col-md-2"> 
			
		</div>
		
	</jsp:body>
</t:template>