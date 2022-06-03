<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Eliminar Producto</title>
</head>
<style>

h1 {color:green}
</style>
<body>
	<h1>Eliminar Producto</h1>
	<p>¿Estás seguro que quieres eliminar este producto? </p>
	<form action="eliminarProducto" method= "POST">
		<input type="hidden" value="${IDproducto}" name="IDproducto"/> 
		<button type="submit"onclick="return confirm ('Producto ha sido eliminado exitósamente')">Sí, eliminar</button>
		<input type="button" onclick="javascript:window.location= 'Klin-da-Hauz';" value= "Me arrepentí, NO eliminar"/>
	</form>
	<a href="Klin-da-Hauz"> Volver a Home</a>
</body>
</html>