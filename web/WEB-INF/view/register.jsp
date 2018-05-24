<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>


<t:template>
	<jsp:body>
	
		<div class="container">
			<div class="row main">
				<div class="panel-heading">
	               <div class="panel-title text-center">
	               		<h2 class="title">Faça seu cadastro para logar no sistema</h2>
	               		<hr />
	               	</div>
	            </div> 
				<div class="main-login main-center">
					<!-- Class FORM  com action register para o SERVLET RegisterServlet-->
					<form class="form-horizontal" method="post" action="register">
						
						<div class="form-group">
							<label for="name" class="cols-sm-2 control-label"> Nome</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="name" id="name"  placeholder="Digite seu nome" required="required"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="login" class="cols-sm-2 control-label">Usuario</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="login" id="login"  placeholder="Digite seu Usuario" required="required"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="pwd" class="cols-sm-2 control-label">Senha</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
									<input type="password" class="form-control" name="pwd" id="pwd"  placeholder="Digite sua senha" required="required"/>
								</div>
							</div>
						</div>
						
						<input type="hidden" name="role" id="role" value="user" />

						<div class="form-group ">
							<button type="submit" class="btn btn-primary btn-lg btn-block login-button">Register</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	
		
		
		
		
	</jsp:body>
</t:template>