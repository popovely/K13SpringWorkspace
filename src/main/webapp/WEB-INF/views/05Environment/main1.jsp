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
	<h2>Environment 객체를 이용한 외부파일 사용하기</h2>
	<h3>EnvAdmin.properties 파일에서 읽어온 Oracle의 kosmo계정 정보</h3>
	<ul>
		<li>아이디 : ${ adminID }</li>
		<li>패스워드 : ${ adminPW }</li>
	</ul>
</div>
</body>
</html>