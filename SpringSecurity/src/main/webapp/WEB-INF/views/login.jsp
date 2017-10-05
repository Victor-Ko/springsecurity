<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>로그인</title>
</head>
<body>
<div>
	<form action="/loginAction" method="post">
		<input type="text" name="id" id="id"><br>
		<input type="password" name="pw" id="pw">
		<input type="submit" value="로그인">
	</form>
</div>
</body>
</html>