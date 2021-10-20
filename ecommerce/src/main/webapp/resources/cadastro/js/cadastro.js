function registrar() {
    

var cliente = {

		email: $("#email").val(),
        nome: $("#nome").val(),
        sobrenome: $("#sobrenome").val(),
        cpf: $("#cpf").val(),
        senha: $("#senha").val(),
        nascimento: $("#nascimento").val(),
        telefone: $("#telefone").val(),


    };
    

 $.ajax(
    {
        
    url: "/cadastrar",
    type: "POST",
    contentType: 'application/json;  charset=utf-8',
       dataType: 'json',
    data: JSON.stringify(cliente),
    success: function(result){

 	$("body").html(result);
    },
    error: function(){
        console.log("deu ruim")
    }

    });
  }