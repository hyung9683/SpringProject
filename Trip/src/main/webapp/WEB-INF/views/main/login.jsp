<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@include file="../includes/header.jsp" %>
<div class="container trip-login">
	<h1>로그인 페이지</h1>
	<h2><c:out value="${error }" /></h2>
	<h2><c:out value="${logout }" /></h2>
	
	<form method='post' action="/user/login">
		<div>
			<input type='text' name='userid' value='admin'>
		</div>
		<div>
			<input type='password' name='password' value='admin'>
		</div>
		<div>
			<input type='submit'>
		</div>
		<input type="hidden" name="${_csrf.parameterName }" value="${_csrf.token }" />
		
	</form>
</div>
<%@include file="../includes/footer.jsp" %>
<script>
	
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

<style>
</style>