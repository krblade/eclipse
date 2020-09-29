<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.css" />
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.2.1.js"></script>
<script type="text/javascript"
	src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

<script>
					$(document).ready(function(){
					$("#accordion").accordion();
	                
					$("#nome").on('click',function(){ //brincado clica no nome e apaga a saida
				    	$("#saida").html(" ");	
					});
					
	
			        $("#cep").on('blur',function(){
					    var vcep= $(this).val();
					    
					    $.getJSON('https://api.postmon.com.br/v1/cep/' +vcep,	
					    function(data){
					    	$("#logradouro").val(data.logradouro);
					    	$("#bairro").val(data.bairro);
					    	$("#cidade").val(data.cidade);
					    	$("#estado").val(data.estado);
					    	$("#saida").html("Cep Encontrado...");		
					    })
					    .fail(function(ex){
					    	
					    	//se não encontrar o Cep então zera as informações
					    	$("#logradouro").val("");
					    	$("#bairro").val("");
					    	$("#cidade").val("");
					    	$("#estado").val("");
					    	
					    	
					    	$("#saida").html("Cep Não Encontrado...")
					    });
					});
	
	              });
					
					
				</script>


</head>
<body>

	<div id="accordion">
		<h5>Cadastro de Cliente , Endereco</h5>
		<div>

			<form method="post" action="Controller">

				<br>Nome<br /> <input type="text" name="nome" id="nome"
					required="required" pattern="[a-zA-Z]{2,50}" /> <br>Email<br />
				<input type="email" name="email" id="email" required="required" />

				<br>Cep<br /> <input type="text" name="cep" id="cep"
					required="required" /> <br>Logradouro<br /> <input
					type="text" name="logradouro" id="logradouro" size="30" /> <br>Bairro<br />
				<input type="text" name="bairro" id="bairro" size="30" /> <br>Cidade<br />
				<input type="text" name="cidade" id="cidade" size="30" /> <br>Estado<br />
				<input type="text" name="estado" id="estado" size="5" /> <br />
				<div id="saida"></div>
				<br>
            <button type="submit">Enviar os dados</button>
			</form>
      <br/>
       ${msg} <!-- mensagem de retorno no servidor (Servlet), servlet3.jar mysql.jar, jstl.jar
       -->

		</div>

	</div>


</body>
</html>

