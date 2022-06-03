<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listar Productos</title>
</head>
<body>
<h1> Listar Productos - Klin-da-Hauz </h1>
	<table>
		<tr>
			<th> IDproducto </th>
			<th> Nombre </th>
			<th> Precio </th>
			<th> Descripción </th>&nbsp;
			 <th> Categoría </th>&nbsp;
			<th> ¿En qué te podemos ayudar hoy? </th>
		</tr>
		<c:forEach items="${productos}" var="producto">
			<tr>
				<td>${producto.getProducto().getIDproducto()}   </td>
				<td>${producto.getProducto().getNombreProducto()}   </td>
				<td>${producto.getProducto().getPrecio()}   </td>
				<td>${producto.getProducto().getDescripcion()}   </td>&nbsp;
				<td>${producto.getCategoria().getNombreCategoria()}   </td>
				
				
				<td> 
					<a href="modificarProducto?IDproducto=${producto.getProducto().getIDproducto()}"> Modificar Producto  </a>&nbsp;
					<a href="eliminarProducto?IDproducto=${producto.getProducto().getIDproducto()}"> Eliminar Producto  </a>
				</td>
			</tr>
		 </c:forEach>
	</table>
	
	<a href="/Klin-da-Hauz"> Volver a Home</a>
	
	
</body>
</html>