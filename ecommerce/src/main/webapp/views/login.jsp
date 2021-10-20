<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<script src="resources/login/js/login.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<meta charset="utf-8">
	<title>Login</title>
	<link rel="stylesheet" type="text/css" href="resources/login/css/login.css">
</head>
<body>
	<form>
		<h2>Login.</h2>
		<input id="email" type="text" name="nome" placeholder="Email">
		<input id="senha" type="password" name="senha" placeholder="Senha">
	</form>
	
	<button onclick="logar()" >Entrar</button>
	

</body>
</html>