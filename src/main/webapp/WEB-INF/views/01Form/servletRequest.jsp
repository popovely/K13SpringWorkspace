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
	<h2>HttpServletRequest로 폼값 받기(Get방식)</h2>
	
	<ul>
		<li>아이디 : ${ id }</li>
		<li>패스워드 : ${ pw }</li>
		<li>메세지 : ${ message }</li>
	</ul>
</div>
</body>
</html>