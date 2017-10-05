<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>로그인 성공</title>
</head>
<body>
아이디 : ${member.id }<br>
비밀번호 : ${member.pw }<br>
<a href="/logout">로그아웃</a>
</body>
</html>