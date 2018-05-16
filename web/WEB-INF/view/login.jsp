<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<t:template>
	<jsp:body>
	
	<div id="main" class="container">
        <c:if test="${not empty success}">
            <div class="alert alert-success" role="alert">
                <button type="button" class="close" data-dismiss="alert"
						aria-label="Close">
                  <span aria-hidden="true">&times;</span>
                </button>
                ${success}
            </div>
        </c:if>
        <c:if test="${not empty error}">
            <div
					class="alert col-md-12 col-sm-12 alert-icon alert-danger alert-dismissible fade in"
					role="alert">
                <div class="col-md-2 col-sm-2 icon-wrapper text-center">
					<span class="fa fa-flash fa-2x"></span>
				</div>
				<div class="col-md-10 col-sm-10">
                <button type="button" class="close" data-dismiss="alert"
							aria-label="Close">
                  <span aria-hidden="true">&times;</span>
                  <strong>Erro !!! </strong>
                </button>
                ${error}
                </div>
            </div>
        </c:if>
	
	
    <div class="row">     
        <div class="col-sm-6 col-md-4 col-md-offset-4">
            <h2 class="text-center "> Para realizar sua aposta é necessário fazer seu login!</h2>
            <div class="account-wall">
                <img class="profile-img"
							src="https://www.revenueriver.co/hs-fs/hub/177047/file-2110622193-png/user_profile_img.png?t=1521835851784"
							alt="">
                <form action="j_security_check" class="form-signin">
                <input type="text" name="j_username"
								class="form-control" placeholder="Email" required autofocus>
                <input type="password" name="j_password"
								class="form-control" placeholder="Senha" required>
                <button class="btn btn-lg btn-primary btn-block"
								type="submit"> Login </button>
                
                <label class="checkbox pull-left">
                    <input type="checkbox" value="remember-me">
                    Lembrar-me
                </label>
                
                <a href="#" class="pull-right need-help">Ajuda? </a>
                <span class="clearfix"></span>
                
                </form>
            </div>
            <a href="register" class="text-center new-account">Criar uma conta </a>
        </div>
    </div>
</div>
		
		
		
		
	</jsp:body>
</t:template>