<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@include file="./includes/header.jsp" %>
<div class="main_display">
	<div id="carouselExampleIndicators" class="carousel slide main_slide" data-bs-ride="carousel">
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
					<p class="font-dark">즐거운 여행지</p>
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
	<div class="content cate-list">
		<h2 class="trip_title">여행지 BEST</h2>
		<form action="/trip" method="get">
			<c:forEach items="${topTrips}" var="tv">
				<div class="s1" style="height: 230px;">
					<div class="card" style="width:20rem; height: 370px; border: none; margin: 0 1%;">
						<span class="rank-badge"><c:if test="${!index }"><i class="bi bi-hand-thumbs-up"></i><string><c:out value="${index + 1}" ></c:out></string></c:if>위</span>
					
						<a href="#" class="imgspace">
							<c:choose>
							<c:when test="${trip.main}">
								<img src="../resources/uploads/${trip.main}" style="width: 230px;" alt="Image">
							</c:when>
							<c:otherwise>
								<img src="../resources/uploads/goodsempty.jpg" style="width: 230px;" alt="Default Image">
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
					
					</div>
				</div>
			</c:forEach>
		</form>
		
		<!-- 축제 BEST -->
		<h2 class="trip_title">축제 BEST</h2>
		<form action="/trip" method="get">
			<c:forEach items="${fes}" var="fs">
				<div class="s1" style="height:350px;">
					<div class="card" style="width:20rem; height: 370px; border: none; margin: 0 1%;">
						<span class="rank-badge"><c:if test="${!index }"><i class="bi bi-hand-thumbs-up"></i><string><c:out value="${index + 1}" ></c:out></string></c:if>위</span>
					
					
						<a href="#" class="imgspace">
							<c:choose>
							<c:when test="${fs.main}">
								<img src="../resources/uploads/${fs.main}" style="width: 230px;" alt="Image">
							</c:when>
							<c:otherwise>
								<img src="../resources/uploads/goodsempty.jpg" style="width: 230px;" alt="Default Image">
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
							<p class="card-text align-left" style="margin:0;">
								<span class="badge text-bg-light" style="font-size: 12px;">축제기간:<c:out value="${fs.start_date}" /> ~ <c:out value="${fs.end_date}" /></span>
							</p>
						</div>
					</div>
				</div>
			</c:forEach>
		</form>
	</div>
</div>
<script>
	// header보다 아래쪽 위치하게
	
	document.addEventListener("DOMContentLoaded", function() {
		
		function topPosition() {
			
			var height = document.getElementById("wrapper").offsetHeight;
			var main = document.querySelector(".main_display");
			
			main.style.top = height + "px";
		}
		
		topPosition();
		
		window.addEventListener("resize", topPosition);
	})
</script>


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

.slider-image {
	width: 100%;
	height: 300px;
	object-fit: cover;
}

.main_display {
	position: relative;
}

.cate-list {
	font-family: ONE-Mobile-Regular;
}

.imagespace {
	max-width: 230px;
	max-height: 230px;
	min-width: 100px;
	min-height: 100px;
	overflow: hidden;
	padding: auto;
	border-radius: 15%;
	bacaground-color: #eeeeee;
}

a img {
	margin: auto;
	width: 100%;
	height: 200px;
}

a:hover img {
	tranform: scale(1.12);
	transition: all 0.1s linear;
}


a:not(hover) img {
	transform: scale(1.0);
	transition: all 0.1s linear;
}

.card {
	flex-direction: column;
	flex-wrap: wrap;
	align-content: center;
}

/* .card-text {
	margin: 3px;
	margin-top: 5px;
}

.card-text .align-left {
	text-align: left;
} */

.trip_title {
	margin: 40px 0px 20px 0px;
	text-align: cener;
}

.bi-hand-thumbs-up {
	padding-right: 5px;
}

.s1 {
	position:relative;
	display: flex;
	margin-bottom: 150px;
	height: 230px;
}

</style>


<%@include file="./includes/footer.jsp" %>