<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.latam.booklet.modelo.Libro"%>
<%@page import="com.latam.booklet.vo.LibroVO"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="charset=UTF-8">
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet"
          href="/webjars/bootstrap/4.3.0/css/bootstrap.min.css" />
    <title>JSP CRUD</title>
</head>
<body>

<!-- Inicio Contenido -->
<div class="p-3">

    <h1>Agregar libro</h1>
    <c:if test="${mensaje != null ? true : false}">
        <div class="alert alert-secondary  alert-dismissible fade show"
             role="alert">${mensaje}
            <button type="button" class="close" data-dismiss="alert"
                    aria-label="Close">
                <span aria-hidden="true">&times;</span>
            </button>
        </div>
    </c:if>
    <form action="agregar" method="post">
        <table>
            <tr>
                <td class="p-2"><label for="anho">Año:</label></td>
                <td><input class="form-control" type="number" name="anho"
                           placeholder="Año"  /></td>
            </tr>
            <tr>
                <td class="p-2"><label for="titulo">Titulo:</label></td>
                <td><input class="form-control" type="text"
                           placeholder="Titulo" name="titulo" /></td>
            </tr>
            <tr>
                <td class="p-2"><label for="autor">Autor:</label></td>
                <td><input class="form-control" type="text"
                           placeholder="Autor" name="autor"/></td>
            </tr>

            <tr>
                <td class="p-2"><label for="imprenta">Imprenta:</label></td>
                <td><input class="form-control" type="text"
                           placeholder="Imprenta" name="imprenta" /></td>
            </tr>

            <tr>
                <td class="p-2"><label for="observaciones">Observaciones:</label></td>
                <td><input class="form-control" type="text"
                           placeholder="Observaciones" name="observaciones" /></td>
            </tr>
            
             <tr>
                <td class="p-2"><label for="clasificacion">Clasificación:</label>
                   	<select name="clasificacion">
                	 	<option value="1">Libro para Niños</option>
                		<option value="2">Libro para Adolescentes</option>
                		<option value="3">Libro para Adultos</option>
                		<option value="4">Otro/a</option>
                	</select>
                </td>
            </tr>
            
  
            <tr>
                <td class="p-2"></td>
                <td>

                    <input class="form-check-input" type="checkbox" value="true" id="disponibilidad" name="disponibilidad">
                    <label class="form-check-label" for="disponibilidad">
                        Disponible
                    </label>

                </td>
            </tr>

            <tr>
                <td colspan="2"><input type="submit"
                                       class="btn m-2 btn-success" value="Agregar" /></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>