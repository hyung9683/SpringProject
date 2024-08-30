<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@include file="../includes/header.jsp" %>
<div class="content">
	<main class="mt-5 trip-login">
		<div class="login-form">
			<div class="logo">
				<img src="./resources/uploads/asset/logo.png">
			</div>
			<form action="/login" method="post" role="form">
				<div>
					<input type="text" name="username" class="form-control" placeholder="아이디">
					<label for="floatingInput"></label>
				</div>
				<div>
					<input type="password" name="password" class="form-control" placeholder="비밀번호">
					<label for="floatingPassword"></label>
				</div>
				
				<div class="checkbox">
					<label>
						<input name="remember-me" type="checkbox">로그인 유지
					</label>
				</div>
				
				<div>
					<button type="button" class="btn loginBtn">로그인</button>
					<img src="./resources/uplods/asset/kakaoLogin.png" class="btn_kakao">
				</div>
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
				
				<div class="find">아이디 / 비밀번호 찾기</div>
				<div class="find" style="margin-top: -48px; margin-left: 270px;">| 회원가입</div>
			
			</form>
		</div>
		
	</main>
	<%-- <div class="container trip-login">
		<h1>로그인 페이지</h1>
		<h2><c:out value="${error }" /></h2>
		<h2><c:out value="${logout }" /></h2>
		
		<form method='post' action="/login">
			<div>
				<input type='text' name='username' value='admin'>
			</div>
			<div>
				<input type='password' name='password' value='admin'>
			</div>
			
			<div>
				<input type='checkbox' name='remember-me'> Remember Me
			</div>
			
			<div>
				<input type='submit'>
			</div>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			
		</form>
	</div> --%>

</div>

<div class="footer">
<%@include file="../includes/footer.jsp" %>
</div>
<script>

	$(document).ready(function() {
		
		$(".loginBtn").on("click", function() {
			e.preventDefault();
			$("form").submit();
			
		});
		
	})
	
	// 위치 값
	document.addEventListener("DOMContentLoaded", function() {
		
		function topPosition() {
			
			var height = document.getElementById("wrapper").offsetHeight;
			var login = document.querySelector(".trip-login");
			login.style.top = height + "px";
		}
		
		topPosition();
		
		window.addEventListener("resize", topPosition);
		
	})
	
	
	
	
</script>

<c:if test="${param.logout != null}">
	<script>
		$(document).ready(function() {
			
			alert("로그아웃하였습니다.");
		})
	</script>
</c:if>

<style>
.trip-login {
	position: relative;
}
</style>