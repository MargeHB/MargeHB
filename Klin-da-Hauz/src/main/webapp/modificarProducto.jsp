<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modificar Producto</title>
</head>
<body>
	<h1>Modificar Producto</h1>
	<form action="modificarProducto" method="POST">
	<input type="hidden" value="${producto.getIDproducto()}" name="IDproducto"/>
	
	
		<label for="nombre">Nombre Producto</label>
		<input type= "text" name="nombre" id="nombre" value="${producto.getNombreProducto()}"/>
		
		<label for="precio">Precio Producto</label>
		<input type= "number" name="precio" id="precio" value="${producto.getPrecio()}"/>
		
		<label for="descripcion">Descripción Producto</label>
		<input type= "text" name="descripcion" id="descripcion" value="${producto.getDescripcion()}"/>
		
		
		<label for="categoria">Categoría Producto</label>
		<select name="categoria" id="categoria">
		<c:forEach items="${categorias}" var="categoria">
		<option value="${categoria.getIDcategoria()}"
		${categoria.getIDcategoria() == producto.getIDcategoria() ? ' selected' : ' '}> ${categoria.getNombreCategoria()} </option> 
		</c:forEach>		

		
		</select>
		<button type="submit" onclick="return confirm ('Producto ha sido modificado exitósamente')">Enviar</button>
	</form>
	<a href="/Klin-da-Hauz"> Volver a Home</a>

</body>
</html>