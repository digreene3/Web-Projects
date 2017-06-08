<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel = "stylesheet" type = "text/css" href = "css/newSet.css">
<script>
function pickColor(color){
	
	document.getElementById("topic").style.backgroundColor = color;
	document.getElementById("colorTxt").value = color;
}

</script>
</head>
<body>
<div id = "colors">
<input type = "button" id = "color" class = "one" onclick = "pickColor('#f44b42')" >
<input type = "button" id = "color" class = "two" onclick = "pickColor('#f45c42')">
<input type = "button" id = "color" class = "three" onclick = "pickColor('#f4a142')">
<input type = "button" id = "color" class = "four" onclick = "pickColor('#fbec82')">
<input type = "button" id = "color" class = "five" onclick = "pickColor('#80ff00')">
<input type = "button" id = "color" class = "six" onclick = "pickColor('#2fb90d')">
<input type = "button" id = "color" class = "seven" onclick = "pickColor('#1b7bf1')">
<input type = "button" id = "color" class = "eight" onclick = "pickColor('#1a43b0')">
<input type = "button" id = "color" class = "nine" onclick = "pickColor('#c657ea')">
</div>
<form method = "POST" action = "Servlet">
<input type = "text" name = "topic" id = "topic" placeholder = "Enter Topic Name" value = "" /><br>
<input type = "text" name = "colorTxt" id = "colorTxt" hidden = "true" ><br>
 <input type = "text" name = "description" id = "descrip" placeholder = "Enter a short description of your set" value = "" /><br>

<input type = "submit" name = "button" id = "createSet" value ="Create Set">
</form>
</body>
</html>