<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello Spring</title>
<!-- 부트스트랩 코어 : static별칭 사용 -->
<link rel="stylesheet" href="/springlegacy/static/bootstrap5.1.3/css/bootstrap.css" />
<!-- jquery 코어 : resources별칭 사용 -->
<script src="/springlegacy/resources/jquery/jquery-3.6.0.js"></script>
</head>
<body>
<div class="container">

	<h2>Hello Spring</h2>
	<h3>첫번째 컨트롤러 만들기</h3>
	<h4>컨트롤러에서 뷰로 전달한 값 : ${ firstMessage }</h4>
	
	<script>
		$(function(){
			alert("jQuery 실행 잘되냐?");
		});
	</script>
</div>
</body>
</html>