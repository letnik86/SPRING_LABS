<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Преподаватель</title>
<style>
	form fieldset {
		width : 40%;
	} 
	form fieldset label {
		display : block;
		/*width : 50%;
		float :left;*/
	}
	form fieldset input, form fieldset textarea {
		width : 100%;
	}
</style>
</head>
<body>
	<h1>Преподаватель</h1>
	<form method="POST">
		<fieldset>
			<div>
				<label>Имя: </label>
				<input  type="text" name="name" value="${teacher.name}">
			</div>
			<div>
				<label>Адрес: </label>
				<input  type="text" name="addr" value="${teacher.addr}">
			</div>
			<div>
				<label>Телефон: </label>
				<input  type="text" name="phone" value="${teacher.phone}">
			</div>
			<div>
				<input type="submit" value="Сохранить">
			</div>
		</fieldset>
	
	</form>

</body>
</html>