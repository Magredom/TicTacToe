<jsp:useBean id="gameBean" scope="session" class="game.GameBean" />

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Tic Tac Toe JUEGO</title>
</head>
<body>
	<h1>Tic Tac Toe</h1>
	<form action="entryServlet" method="post">
		<input type="submit" name="User" value="Tú Comienzas"><br /> <input
			type="submit" name="Computer" value="El computador comienza">
	</form>
</body>
</html>
