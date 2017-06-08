<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/main.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="logo">
		<img id="logopic" src="img/flashCardsLogo.png">
	</div>
	<form method="POST" action="Servlet">
	
		<div class="cards">
		<#list decks as deck>
			<div class="newCard">
				<input type="submit" value="${deck.topic}" name="button" id="card" style = "background-color: ${deck.color}">
			</div>
		</#list>
			<div class="newCard">
				<input type="submit" value="+" name="button" id="newCard">
			</div>
		</div>
	</form>
</body>
</html>