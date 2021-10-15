<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script src="resources/cadastro/js/cadastro.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<meta charset="utf-8">
<title>Cadastro</title>
<link rel="stylesheet" type="text/css"
	href="resources/cadastro/css/cadastro.css">
</head>
<body>
	<form>
		<h2>Cadastro</h2>
		<input id="email" type="text" name="nome" placeholder="Email">
		<input id="nome" type="text" name="nome" placeholder="Nome">
		<input id="sobrenome" type="text" name="nome" placeholder="sobrenome">
		<input id="senha" type="text" name="nome" placeholder="Senha">
		<input id="cpf" type="text" name="nome" placeholder="CPF">
		<input id="telefone" type="text" name="nome" placeholder="telefone">
		<input id="nascimento" type="date" name="nome" placeholder="nascimento">

	</form>
	<button onclick="registrar()">Cadastrar</button>


</body>
</html>