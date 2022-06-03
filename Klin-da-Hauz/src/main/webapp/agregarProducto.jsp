<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agregar Producto</title>
</head>
<body>
	<h1>Agregar Producto</h1>
	<form action="agregarProducto" method="POST">
		<label for="nombre">Nombre Producto</label>
		<input type= "text" name="nombre" id="nombre"/>
		
		<label for="precio">Precio Producto</label>
		<input type= "number" name="precio" id="precio"/>
		
		<label for="descripcion">Descripción Producto</label>
		<input type= "text" name="descripcion" id="descripcion"/>
		
		
		<label for="IDcategoria">Categoría Producto</label>
		
		<select name="categoria" id="categoria">
		<c:forEach items="${categorias}" var="categoria">
			<option value="${categoria.getIDcategoria()}">${categoria.getNombreCategoria()} </option>
		
		</c:forEach>
			
		</select>
		<button type="submit" onclick="return confirm ('Producto ha sido agregado exitósamente')">Enviar</button>
	
	</form>
	
	<a href="/Klin-da-Hauz"> Volver a Home </a>
		
</body>
</html>