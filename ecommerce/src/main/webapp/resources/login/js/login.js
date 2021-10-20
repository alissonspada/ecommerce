function logar() {
	
	var cliente = {

		email: $("#email").val(),
        senha: $("#senha").val(),
    }

 $.ajax(
    {
        
    url: "/logar",
    type: "POST",
    contentType: 'application/json;  charset=utf-8',
       dataType: 'json',
 	data: JSON.stringify(cliente),
    success: function(result){
	
    },
    error: function(){
        console.log("deu ruim")
    }

    });
  }
