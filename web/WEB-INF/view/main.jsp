<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>


<t:template>
	<jsp:body>
	
	
	<div class="container">
   		<div class="row">
			<div class="col-md-2"> 
			
			</div>
			
	        <div class="col-md-8"> 
	        <table class="tablejogador">
            <tr>
              <td>
              <h2 align= "center">APOSTE AQUI!</h2>
			  </td>
            </tr>
	            <tr>
	              <td>
		              <form method="post" action="u/resultMega">
		                <p>Digite os numeros que você gostaria de apostar. <bR>
		                Por favor digite seis números diferentes de 1 a 60.. </p>
		                
		                <p align="center">
						  <input name="n1" type="text" id="n1" size="3" maxlength="2" required="required"> 
						  <input name="n2" type="text" id="n2" size="3" maxlength="2" required="required"> 
						  <input name="n3" type="text" id="n3" size="3" maxlength="2" required="required"> 
						  <input name="n4" type="text" id="n4" size="3" maxlength="2" required="required"> 
						  <input name="n5" type="text" id="n5" size="3" maxlength="2" required="required"> 
						  <input name="n6" type="text" id="n6" size="3" maxlength="2" required="required">
						 </p>                <br>
						 <p align="center">
						  <button type="submit">Gerar Aposta</button>
						 </p>
						 
		              </form>
	              </td>
	            </tr>
          	</table>
	        </div>
	        
	        <div class="col-md-2"> 
	
			</div>
	        
    	</div>
	</div>
	
	</jsp:body>
</t:template>