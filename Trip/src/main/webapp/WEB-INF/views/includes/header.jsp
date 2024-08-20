<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<%@include file="./bootstrap.jsp" %>
<meta charset="UTF-8">
<title>Trip</title>

</head>
<body>

	<div class="header_wrapper col-md-3" id="wrapper">
		<nav class="navbar navbar-top">
			<div class="container">
					<a class="navbar-brand logo" href="home.jsp">
						<img src="../../../resources/uploads/logo.png">
					</a>
				<div class="col-md-4 navbar-search">
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
				
				<div class="col-md-5 navbar_icon">
					<ul class="navbar-nav col-md-5">
						<li class="nav-item">
							<a class="nav-link mypage" href="mypage.jsp">마이페이지</a>
						</li>
						<li class="nav-item">
							<a class="nav-link qna" href="qna.jsp">고객센터</a>
						</li>
					</ul>
					
					<ul class="navbar-nav col-md-7">
					<sec:authorize access="!isAuthenticated()">
						<li class="nav-item">
							<a class="nav-link join" href="login.jsp">로그인</a>
						</li>
						<li class="nav-item">
							<a class="nav-link join" href="join.jsp">회원가입</a>
						</li>
					</sec:authorize>
					<sec:authorize access="isAuthenticated()">
						<li class="nav-item">
							<a class="nav-link join" href="logout.jsp">로그아웃</a>
						</li>
					</sec:authorize>
					</ul>
				</div>
			</div>
			
			
		
		</nav>
		
		<nav class="navbar navbar_bottom">
			<form action="/trip">
				<ul class="category">
					<li><a href="#">여행지</a></li>
					<li><a href="#">축제</a></li>
					<li><a href="#">자유게시판</a></li>
					<li><a href="#">전체목록</a></li>
				</ul>
			</form>
		</nav>
	</div>
	
	<div id="page-wrapper">
	


<style>

.header_wrapper {
	font-size: 15px;
	position: fixed;
	top: 0;
	left: 0;
	z-index: 20;
	width: 100%;
	background: #ffffff;
	box-shadow: 0 4px 5px -4px rgb(219, 219, 219);
}

.navbar-top {
	display: flex;
	height: 90px;
	justify-content: space-between;
	align-items: center;
	padding: 0;
	--bs-navbar-padding-x: 0;
}

.logo {
	scale: 50%;
	position: relative;
	left: -120px;
	top: 31px;
	padding: 0 0 0 16px;
}

.navbar_search {
	display:flex;
	width: 30rem;
	max-width: 100%;
	border-radius: 200px;
	outline: rgb(134, 134, 134) solid 2px;
	background-color: rgb(251, 251, 251);
	position: relative;
	right: 6%;
	padding-left: 20px;
}

input[type='text'] {
	width: 100%;
	font-size: 1rem;
	outline: none;
	background-color: rgb(251, 251, 251);
	border: none;
	margin-right: 8px;
}

input[type='text']:focus {
	caret-color: rgb(0, 0, 0);
}

.bi-search {
	display: flex;
	border: 0;
	height: 38px;
	width: 50px;
	position: relative;
	background: none;
	cursor: pointer;
}

.navbar_icon {
	display: flex;
	justify-content: space-between;
	align-items: center;
	scale: 80%;
	position: relative;
}

.navbar_bottom {
	justify-contetn: space-between;
	align-items: center;
	display: flex;
	height: 60px;
}

.category {
	display: flex;
	position: relative;
	margin: auto;
}

.category li {
	font-size: 1rem;
	display: inline-block;
	margin-left: 30px;
	width: 8rem;
	height: 30px;
	margin-top: 16px;
	text-align: center;
	
}

.category li:nth-last-child(4) {
	margin-left: 0px;
}

.category li:hover {
	cursor: pointer;
}

.category li:after {
	display: block;
	width: 4rem;
	content: '';
	border-bottom: solid 2px #fff;
	transform: scaleX(0);
	transition: transform 250ms ease-in-out;
	border: 1.5px solid #FFAF7D;
	margin: auto;
	margin-top: 6px;
	border-radius: 30px;
	
}

.category li:hover:after {
	transform: scaleX(1);
}
</style>