<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<title>관리자 메인페이지</title>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Required meta tags -->
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">

<!-- 부트스트랩 아이콘 -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.1/font/bootstrap-icons.css">

<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
	integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
	crossorigin="anonymous"></script>

<title>GREEN BIZ</title>

<style type="text/css">
body {
	margin: 0 auto;
	max-width: 90%;
	min-width: 40%;
}

.logo {
	text-align: center;
	display: inline-block;
	width: 100%;
	height: 50px;
	left: 10px;
	padding-top:10px;
}

.member_info {
	text-align: center;
}

#hambuger { 
 	padding-top: 7px; 
 } 

#hambuger > a{
/* 	display: inline; */
	vertical-align: center;
	color : #3F4B3B;
	font-size: 40px;
}

#hambuger >  a:hover {
	text-decoration: none;
}

#memberBar {
	margin: 0 auto;

}
#mainSideBar {
	margin: 0 auto;
}

#member_img{
	padding-top : 10px;
	font-size: 60px;
	color : gray;
	text-align: center;
}


ul>li {
	margin: 0 auto;
	font-size: 20px;
}

.logout a{
	color : gray;
}

.logout > a:hover{
	color : #gray;
}

</style>

</head>
<body>


<div class="container-fluid">
	<div class="row">
		<div class="col-md-3">
			<div class="row">
				<div class="col-md-7">
				
				<!-- 로고 이미지 삽입 -->
				<div class="logo">
					<a href="/"><img alt="LOGO" src="https://ifh.cc/g/Glr864.png" class="img-fluid" style="" /></a>
				</div>
				</div>
				
				<div class="col-md-5">
				<!-- 로고 옆  햄버거 메뉴 -->
				<div id="hambuger">
					<a href="/">
					<i class="bi bi-list"></i></a>
					</div>
				</div>
				</div>
			
			<div id="memberBar">
					<div id="member_img">
					<i class="bi bi-person-circle"></i>
					</div>
			
					<div class="member_info">
					<h3>[DB-사원이름]</h3>
					<p>[DB-부서] / [DB-직함]</p>
				
					<div class="logout">
					<a href="/login/login"><p>로그아웃</p></a>
					</div>
				</div>
			</div>
			
			<div id = mainSideBar>
				<ul style="list-style: none;"><br>
				<li class="list-item"><i class="bi bi-chat" /></i> 메신저</li><br>
				<li class="list-item"><i class="bi bi-calendar-event"></i> 일정관리</li><br>
				<li class="list-item"><i class="bi bi-person"></i> 사원관리</li><br>
				<li class="list-item"><i class="bi bi-search"></i> 사원조회</li><br>
				<li class="list-item"><i class="bi bi-buildings"></i> 부서정보</li><br>
				<li class="list-item"><i class="bi bi-view-list"></i> 게시글관리</li>
				</ul>
			</div>
			</div>
			
			
		<div class="col-md-9">
			<div class="row">
				<div class="col-md-12" style="height : 65px; background-color : #cff09e;">
				</div>
			</div>
			<div class="row">
				<div class="col-md-6">
					

				</div>
			</div>
		</div>
	</div>
</div>



</body>
</html>