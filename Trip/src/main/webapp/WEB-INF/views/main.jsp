<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@include file="./includes/header.jsp" %>
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
			<c:forEach items="${topTrips}" var="tv">
				<div class="card">
					<span class="rank-badge"><c:if test="${!index }"><i class="bi bi-hand-thumbs-up"></i><string><c:out value="${index + 1}" ></c:out></string></c:if>위</span>
				</div>
				
				<a href="#" class="imgspace">
					<c:choose>
					<c:when test="${trip.main}">
						<img src="../resources/uploads/${trip.main}" alt="Image">
					</c:when>
					<c:otherwise>
						<img src="../resources/uploads/goodsempty.jpg" alt="Default Image">
					</c:otherwise>
					</c:choose>
					
					<%-- <img src="${tv.main != null && !tv.main.isEmpty() ? '../resources/uplads/' + tv.main : '../resources/uploads/goodsempty.jpg'}"> --%>
				</a>
				<div class="card-body">
					<a href="#" class="travelTitle">
						<h5 class="card-title"><c:out value="${trip.tit}" /><p class="card-text"><c:out value="[${trip.local}]"/></p></h5>
						
					</a>
					<a href="#" class="travelContent">
						<p class="card-text truncate"><c:out value="${trip.content}" /></p>
					</a>
				</div>
			</c:forEach>
		</form>
		
		<!-- 축제 BEST -->
		<h2 class="trip_title">축제 BEST</h2>
		<form action="/trip" method="get">
			<c:forEach items="${fes}" var="fs">
				<div class="card">
					<span class="rank-badge"><c:if test="${!index }"><i class="bi bi-hand-thumbs-up"></i><string><c:out value="${index + 1}" ></c:out></string></c:if>위</span>
				</div>
				
				<a href="#" class="imgspace">
					<c:choose>
					<c:when test="${fs.main}">
						<img src="../resources/uploads/${fs.main}" alt="Image">
					</c:when>
					<c:otherwise>
						<img src="../resources/uploads/goodsempty.jpg" alt="Default Image">
					</c:otherwise>
					</c:choose>
					
					
				</a>
				<div class="card-body">
					<a href="#" class="travelTitle">
						<h5 class="card-title"><c:out value="${fs.tit}" /><p class="card-text"><c:out value="[${fs.local}]"/></p></h5>
						
					</a>
					<a href="#" class="travelContent">
						<p class="card-text truncate"><c:out value="${fs.content}" /></p>
					</a>
				</div>
			</c:forEach>
		</form>
	</div>
</div>



<style>
.travelContent .truncate {
	display:-webkit-box;
	-webkit-line-clamp: 3;
	-webkit-box-orient: verical;
	overflow: hidden;
	text-overflow: ellipsis;
	line-height: 1.5rem;
	max-height: 4.5rem;
}
</style>


<%@include file="./includes/footer.jsp" %>