<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trip</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resources/css/defaultMain.css">
<%@include file="./bootstrap.jsp" %>

</head>
<body>

	<div class="header_wrapper" id="wrapper" style="font-sze: 15px; position: fixed; top: 0; left: 0; z-index: 20; width: 100%; background: #ffffff; box-shadow: 0 4px 5px -4px rgb(219, 219, 219);">
		<nav class="navbar_top" style="display: flex; height:90px; justify-content:space-between; align-items: center; padding: 0; --bs-navbar-padding-x: 0;">
				<div class="navbar_logo" style="scale:50%; position: relative; left:-120px; top: 10px; padding: 0 0 0 16px;">
					<a class="navbar-brand title" href="home.jsp">
						<img src="../../../resources/uploads/logo.png">
					</a>
				</div>
					<form id="mainSearch" action="/" method="get" style="display:flex;">
						<select name='type' style="position: relative;" class="searchSelect">
							<option value="" <c:out value="${categoryMaker.cate.type == null ? 'selected' : '' }"/>>--</option>
							<option value="TRAVEL" <c:out value="${categoryMaker.cate.type eq 'TRAVEL' ? 'selected' : '' }"/>>여행지</option>
							<option value="FESTIVAL" <c:out value="${categoryMaker.cate.type eq 'FESTIVAL' ? 'selected' : '' }"/>>축제</option>
							<option value="BOARD" <c:out value="${categoryMaker.cate.type eq 'BOARD' ? 'selected' : '' }"/>>자유게시판</option>
						</select>
				<div class="navbar_search" id="search">
						<input type='text' name='keyword' value='<c:out value="${categoryMaker.cate.keyword }"/>'/>
						<button class="searchbtn" style="display:flex; border:0; height: 38px; width: 50px; position:relative; background: none; cursor: pointer;"><i class="bi bi-search" style="position:relative; top:5px; scale: 100%;"></i></button>
					</form>
				</div>
				
				
					<ul class="navbar_icon" style="display:flex; justify-content:space-between; align-items: center; scale: 80%; position: relative;">
						<li class="mypage" style="cursor:pointer; margin-top:16px; scale:130%; margin-left: 16px;">
							<a class="nav-link" href="mypage.jsp">마이페이지</a>
						</li>
						<transition-group name="fade" mode="out-in"></transition-group>
						<li class="qna" style="font-size:20px; cursor:pointer; scale: 95%; margin-left: 46px; margin-top: 15px;">
							<a class="nav-link" href="qna.jsp">고객센터</a>
						</li>
					</ul>
					
					<ul class="join" style="display: flex; justify-content: space-between; align-items: center;">
					<sec:authorize access="!isAuthenticated()">
						<li style="margin-left: 0px; width: 120px; height: 6px; line-height: 0px; text-align: center; padding: 8px 0; margin-top: 14px;">
							<a class="nav-link" href="/login">로그인</a>
						</li>
						<li style="margin-left: 30px; width: 120px; height: 6px; line-height: 0px; text-align: center; padding: 8px 0; margin-top: 14px;">
							<a class="nav-link" href="/join">회원가입</a>
						</li>
					</sec:authorize>
					<sec:authorize access="isAuthenticated()">
						<li style="margin-left: 30px; width: 120px; height: 6px; line-height: 0px; text-align: center; padding: 8px 0; margin-top: 14px;">
							<a class="nav-link" href="logout.jsp">로그아웃</a>
						</li>
					</sec:authorize>
					</ul>
			
			
		
		</nav>
		
		<nav class="navbar_bottom">
			<form action="/trip" method="get">
				<ul class="category" style="display:flex; position: relative; margin:auto;">
					<li style="font-size: 1rem; display:inline-block; margin-left: 30px; width: 8rem; height: 30px; margin-top: 16px; text-align: center;"><a class="nav-link" href="#">여행지</a></li>
					<li style="font-size: 1rem; display:inline-block; margin-left: 30px; width: 8rem; height: 30px; margin-top: 16px; text-align: center;"><a class="nav-link" href="#">축제</a></li>
					<li style="font-size: 1rem; display:inline-block; margin-left: 30px; width: 8rem; height: 30px; margin-top: 16px; text-align: center;"><a class="nav-link" href="#">자유게시판</a></li>
					<li style="font-size: 1rem; display:inline-block; margin-left: 30px; width: 8rem; height: 30px; margin-top: 16px; text-align: center;"><a class="nav-link" href="#">전체목록</a></li>
				</ul>
			</form>
		</nav>
	</div>
	
	<div id="page-wrapper">
	

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	document.addEvenListener("DOMContentLoaded", function() {
		
		function leftPosition() {
			
			var leftSearch = document.querySelector(".navbar_search");
			var select = document.querySelector(".searchSelect");
			
			var navbarSearchRight = leftSearch.getBoundingClientRect().right;
			
			select.style.right = (navbarSearchRight + 10) + "px";
		}
		
		leftPosition();
		
		window.addEventListener("resize", leftPosition);
	})
</script>

<style>

.title {
	cursor: pointer;
}

* {
	margin: 0;
	padding: 0;
}

ul, li {
	list-style: none;
}

a {
	text-decoration: none;
}

@font-face {
	font-family: 'GmarketSansMedium';
	src: url('http://cdn.jsdelivr/net/gh/projectnoonnu/noonfonts_2001@1.1/GmarketSansMedium.woff') format('woff');
	font-weight: normal;
	font-style: normal;
}

.header_wrapper {
	font-family: 'GmarketSansMedium';
	font-size: 15px;
	position: fixed;
	top: 0;
	left: 0;
	z-index: 20;
	width: 100%;
	background: #ffffff;
	box-shadow: 0 4px 5px -4px rgb(219, 219, 219);
}

.navbar_top {
	display: flex;
	height: 90px;
	justify-content: space-between;
	align-items: center;
	padding: 0;
	--bs-navbar-padding-x: 0;
}

.navbar_logo {
	scale: 50%;
	position: relative;
	left: -120px;
	top: 31px;
	padding: 0 0 0 16px;
}

.navbar_search {
	display:flex;
	justify-content: space-between;
	width: 30rem;
	max-width: 100%;
	border-radius: 200px;
	outline: rgb(134, 134, 134) solid 2px;
	background-color: rgb(251, 251, 251);
	position: relative;
	right: 6%;
	padding-left: 20px;
}

.navbar_search input[type='text'] {
	width: 100%;
	font-size: 1rem;
	outline: none;
	background-color: rgb(251, 251, 251);
	border: none;
	margin-right: 8px;
}

.navbar_search input[type='text']:focus {
	caret-color: rgb(0, 0, 0);
}

/* .btn {
	display: flex;
	border: 0;
	height: 38px;
	width: 50px;
	position: relative;
	background: none;
	cursor: pointer;
}

.btn i {
	position: relative;
	top: -3px;
	scale: 70%;
}  */

.navbar_icon {
	display: flex;
	justify-content: space-between;
	align-items: center;
	scale: 80%;
	position: relative;
}

.mypage {
	cursor: pointer;
	margin-top: 16px;
	scale: 130%;
	margin-left: 16px;
}

.qna {
	font-size: 20px;
	cursor: pointer;
	scale: 95%;
	margin-left: 46px;
	margin-top: 15px;
	
}

.mypage:hover {
	filter: opacity(0.2) drop-shadow(0 0 0 #df7a00);
}

.qna:hover {
	filter: opacity(0.2) drop-shadow(0 0 0 #df7a00);
}

.navbar_bottom {
	justify-content: space-between;
	align-items: center;
	display: flex;
	height: 60px;
	max-width: 100%;
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

.join {
	display:flex;
	justify-content: space-between;
	align-items: center;
}

.join li {
	margin-left: 30px;
	width: 120px;
	height: 6px;
	line-height: 0px;
	text-align: center;
	padding: 8px 0;
	margin-top: 14px;
}

.join li:nth-child(1) {
	margin-left: 0px;
}

.join li:hover {
	color: #ee8700;
	cursor: pointer;
}
</style>