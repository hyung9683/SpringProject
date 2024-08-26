<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@include file="../includes/header.jsp" %>
<div>
	<div id="carouselExampleIndicators" class="carousel slide">
	<!-- 아래 짤막한 버튼으로 현재 보고있는 순서를 알려줌 -->
		<div class="carousel-indicators">
			<button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
			<button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
			<button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
		</div>
		
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img class="slider-image" src="../../resources/uploads/asset/banner1.png">
				<div class="carousel-caption d-none d-md-block">
					<h5>여행지1</h5>
					<p>즐거운 여행지</p>
				</div>
			</div>
			<div class="carousel-item">
				<img class="slider-image" src="../../resources/uploads/asset/banner2.png">
				<div class="carousel-caption d-none d-md-block">
					<h5>여행지2</h5>
					<p>즐거운 여행지</p>
				</div>
			</div>
			<div class="carousel-item">
				<img class="slider-image" src="../../resources/uploads/asset/banner3.png">
				<div class="carousel-caption d-none d-md-block">
					<h5>여행지3</h5>
					<p>즐거운 여행지</p>
				</div>
			</div>
		</div>
	</div>
	
	<!-- 여행지 BEST -->
	<div class="content">
		<h2 class="trip_title">여행지 BEST</h2>
		<form action="/trip" method="get">
			<c:forEach 
			<div class="card">
				
			</div>
		</form>
	</div>
</div>


<%@include file="../includes/footer.jsp" %>