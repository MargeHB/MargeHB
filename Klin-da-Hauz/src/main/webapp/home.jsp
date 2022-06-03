<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Klin-da-Hauz</title>
	<style> 
		body {
		font-family: sans-serif;
		background-image: img=<"klinBG.jpg">;
		background-color:lightsteelblue;
		}
		h1{color: blue; 
		}
		p{font-weight:lighter;
		font-size: medium;
		}
		</style>
</head>

<body>
<h1> Klin da Hauz</h1>
<p>Bienvenido(a)... tu casa limpia a un click </p>

<a href= "listarProductos"> Listar Productos</a>
<a href= "agregarProducto"> Agregar Producto</a>
</body>
</html>