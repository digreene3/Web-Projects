<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="../css/addCard.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="logo">
		<img id="logopic" src="../img/flashCardsLogo.png">
	</div>
	<form method="POST" action="Servlet">
		
		<div class = "cards">
		<#list cards as card>
			<div class = "card">
				<input 
			</div>
		</#list>
			<div class = "newInfo">
				<input type="text" name = "term" placeholder = "term" id ="term"><br>
				<input type = "text" name = "definition" placeholder = "definition" id = "def"><br>
				<input type = "submit" name = "button" id = "new" value = "+">
			</div>
		</div>
	</form>
</body>
</html>