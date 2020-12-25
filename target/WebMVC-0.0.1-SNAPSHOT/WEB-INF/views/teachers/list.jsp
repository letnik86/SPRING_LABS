<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Преподаваели</title>
</head>
<body>
	<h1><spring:message code="header_teachers"/></h1>
	<div id="userinfo">
		<s:authorize access="isAuthenticated()">Привет, 
			<s:authentication property="principal.username" />!
			<br/>
			<a href="../j_spring_security_logout">Выход</a>
		</s:authorize>
	</div>
	<s:authorize access="isAnonymous()">
		<form id="login" name="loginForm" action="../j_spring_security_check"
			method="POST">
			<label>Логин: </label>&nbsp;
			<input type="text" name="j_username">
			<label>Пароль: </label>&nbsp;
			<input type="password" name="j_password">
			<input type="submit" name="submit" value="Войти">
		</form>
	</s:authorize>
	<c:if test="${not empty teachers}">
		<table border="1">
			<tr>
				<td>Имя</td>
				<td>Адрес</td>
				<td>Телефона</td>
				<s:authorize access="hasRole('ROLE_ADMIN')">
					<td></td>
					<td></td>
				</s:authorize>
			</tr>
			<c:forEach items="${teachers}" var="teacher">
				<tr>
					<td>${teacher.name}</td>
					<td>${teacher.addr}</td>
					<td>${teacher.phone}</td>
					<s:authorize access="hasRole('ROLE_ADMIN')">
						<td><a href="update/${teacher.id}">Изменить</a></td>
						<td><a href="delete/${teacher.id}">Удалить</a></td>
					</s:authorize>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	<s:authorize access="hasRole('ROLE_ADMIN')">
		<a href="update/0">Добавить...</a>
	</s:authorize>
</body>
</html>