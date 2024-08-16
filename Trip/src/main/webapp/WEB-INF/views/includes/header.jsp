<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<%@include file="./bootstrap.jsp" %>
<meta charset="UTF-8">
<title>Trip</title>

</head>
<body>

	<div class="header_wrapper col-md-3" id="wrapper">
		<nav class="navbar fixed-top">
			<div class="container">
					<a class="navbar-brand" href="home.jsp">
						<img src="../../../resources/uploads/logo.png">
					</a>
				<div class="col-md-4">
					<form id="mainSearch" action="/" method="get">
						<select name='type'>
							<option value="" <c:out value="${categoryMaker.cate.type == null ? 'selected' : '' }"/>>--</option>
							<option value="TRAVEL" <c:out value="${categoryMaker.cate.type eq 'TRAVEL' ? 'selected' : '' }"/>>여행지</option>
							<option value="FESTIVAL" <c:out value="${categoryMaker.cate.type eq 'FESTIVAL' ? 'selected' : '' }"/>>축제</option>
							<option value="BOARD" <c:out value="${categoryMaker.cate.type eq 'BOARD' ? 'selected' : '' }"/>>자유게시판</option>
						</select>
						<input type='text' name='keyword' value='<c:out value="${categoryMaker.cate.keyword }"/>' />
						<button class="btn btn-default"><i class="bi bi-search"></i></button>
					</form>
				</div>
				
				<div class="col-md-5">
					<ul class="navbar-nav col-md-5">
						<li class="nav-item">
							<a class="nav-link" href="mypage.jsp">마이페이지</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="qna.jsp">고객센터</a>
						</li>
					</ul>
					
					<ul class="navbar-nav col-md-7">
						<li class="nav-item">
							<a class="nav-link" href="login.jsp">로그인</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="join.jsp">회원가입</a>
						</li>
					</ul>
				</div>
			</div>
			
			
		
		</nav>
	
	<div id="page-wrapper">
	
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>