<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@include file="./includes/header.jsp" %>
	<div class="subjecet">
		<span>회원가입</span>
	</div>
<form action="/join" id="join_form" method="post">
	<div class="id_wrap">
		<div class="id_name">아이디</div>
		<div class="id_input_box">
			<input type="text" class="form-control id_input" name="memberId">
		</div>
		<div class="nick">닉네임</div>
		<div class="nick_input_box">
			<input type="text" class="form-control nick_input" name="memberNick">
		</div>
		<div class="email">이메일</div>
		<div class="email_input_box">
			<input type="email" class="form-control email_input" name="memberEmail">
		</div>
		<div class="pw">비밀번호</div>
		<div class="pw_input_box">
			<input type="password" class="form-control pw_input" name="memberPw">
		</div>
		<div class="pw_ck">비밀번호 확인</div>
		<div class="ck_input_box">
			<input type="password" class="form-control pw_ck_input" name="memberCk">
		</div>
		<div class="phone">전화번호</div>
		<div class="phone_input_box">
			<input type="tel" class="form-control phone_input" name="memberPhone">
		</div>
		
		</br>
		
		
		<input type="text" id="postcode" placholder="우편번호">
		<button class="btn" type="button" name="addressFind" id="addressFind">우편번호 찾기</button>
		<input type="text" id="roadAddress" placeholder="도로명주소">
		<div class="detailAdr">상세주소 입력</div>
		<input type="text" id="user_adr2" name="detailAdr">
		
		</br>
		
		<!-- <button width="100px" class="btn" type="submit">가입</button> -->
		<a href="/login" class="btn btn-lg btn-success btn-block">가입</a>
	</div>
</form>
<img src="./resources/uploads/asset/kakaoLogin.png" class="btn_kakao" style="scale: 55%; margin-top:-40px; margin-left:-39px;">

<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
	$(domcument).ready(function() {
		
		
		
	})
	
	function addressPostCode() {
		
		new daum.PostCode({
			
			oncomplete: function(data) {
				//도로명 주소의 노출 규칙에 따라 주소를 표시
				// 내려오는 변수가 값이 없는 경우, 공백 값을 가지므로 이를 참고해서 분기
				//var roadAddr = data.roadAddress; // 도로명 주소 변수
				var addr = '';
				var extraRoadAddr = '';  //참고 항목 변수
				
				
				//사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다
				if (data.userSelectedType === 'R') { //사용자가 도로명 주소를 선택했을 겨우
					
					addr = data.roadAddress;
				} else { // 사용자가 지번 주소를 선택했을 경우
					
					addr = data.jibunAddress;
				}
				
				// 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
				if(data.userSelectedType === 'R') {
					
					// 법정동명이 있을 경우 추가
					// 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다
					if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)) {
						
						extraRoadAddr += data.bname;
					}
					
					// 건물명이 있고. 공동주택일 경우 추가한다.
					if(data.buildngName !== '' && data.apartment === 'Y') {
						
						extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildngName : data.buildingName); 
					
					}
					
					// 표시할 참고항목이 있을 경우 괄호까지 추가한 최종 문자열을 만든다
					if(extraRoadAddr !== '') {
						
						extraRoadAddr = '('+ extraRoadAddr +')';
						
					}
					
				}
				
				
				// 우편번호와 주소 정보를 해당 필드에 넣는다
				document.getElementById('postcode').value = data.zonecode;
				//document.getElementById('roadAddress').value = roadAddr;
				document.getElementById('roadAddress').value = addr;
				document.getElementById('user_adr2').value= extraRoadAddr;
				
				// === 아래까진 구현 안함 ====
				
				//참고항목 문자열이 있을 경우 해당 필드에 넣는다
			/* 	if(roadAddr !== '') {
					
					document.getElementById('sample4_extraAddress').value = extraRoadAddr;
				} else {
					
					document.getElementById('sample4_extraAddress').value = '';
					
					var guideTextBox = document.getElementById("guide");
					
					// 사용자가 '선택 안함'을 클릭한 경우 예상 주소라는 표시를 해준다.
					if(data.autoRoadAddress) {
						
						var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
						guideTextBox.innerHTML = '(예상 도로명 주소:'+ expRoadAddr +')';
						guideTextBox.style.display = 'block'
					} else {
						
						var expJibunAddr = data.autoJibunAddress;
						guideTextBox.innerHTML = '(예상 지번 주소:'+ expJinbuAddr +')';
					} else {
						guideTextBox.innerHTML = '';
						guideTextBox.style.display = 'none';
					}
				}
			} */
		}).open();
		
		// 가입 누를 시
		$(".btn-success").on("click", function(e) {
			
			e.preventDefault();
			$("form").submit();
			
		});
		
	}
</script>
<%@include file="./includes/footer.jsp" %>