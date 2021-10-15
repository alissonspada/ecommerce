<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<script type="text/javascript">
	$(function()
			$("submit").click(function(){
					  $.ajax(
						{url: "/cadastro",
						method: "POST",
						data: {parametro: $("#email").val()},
						success: function(result){
					    $("body").html(result);
					  }});
					});
	</script>
	<meta charset="utf-8">
	<title>Cadastro</title>
	<link rel="stylesheet" type="text/css" href="resources/cadastro/css/cadastro.css">
</head>
<body>
	<form>
		<h2>Cadastro</h2>
		<input id="email" type="text" name="nome" placeholder="Email">
		<input id="senha" type="text" name="nome" placeholder="Senha">
		<input type="password" name="senha" placeholder="Confirme sua senha">
		<input id="cpf" type="text" name="nome" placeholder="CPF">
		<input id="cep" type="text" name="nome" placeholder="CEP">
		<input id="botao" type="submit" value="Cadastrar">
	</form>
	
	<button>Butao</button>

</body>
</html>