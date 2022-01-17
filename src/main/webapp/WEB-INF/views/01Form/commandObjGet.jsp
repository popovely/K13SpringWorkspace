<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>♥손준영 바보♥</title>
<!-- 부트스트랩 코어 : static별칭 사용 -->
<link rel="stylesheet" href="/springlegacy/static/bootstrap5.1.3/css/bootstrap.css" />
<!-- jquery 코어 : resources별칭 사용 -->
<script src="/springlegacy/resources/jquery/jquery-3.6.0.js"></script>
</head>
<body>
<div class="container">
	<h2>Form값 받기</h2>
	
	<h3>커맨드객체를 이용하여 폼값 한번에 받기</h3>
	
	<ul>
		<li>이름 : ${ memberDTO.name }</li>
		<li>아이디 : ${ memberDTO.id }</li>
		<li>패스워드 : ${ memberDTO.pw }</li>
		<li>이메일 : ${ memberDTO.email }</li>
	</ul>
</div>
</body>
</html>