<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>INDEX</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body>
<h1>Tabla</h1>
<table class="table table-striped">
    <thead>
    <tr>
        <th>ID</th>
        <th>Nombres</th>
        <th>Apellidos</th>
        <th>RUT</th>
        <th>Dirección</th>
        <th>Ciudad</th>
        <th>Eliminación</th>
        <th>Actualización</th>
    </tr>
    </thead>
    <tbody><c:forEach var="item" items="${items}">
        <tr>
            <td>${item.id}</td>
            <td>${item.nombres}</td>
            <td>${item.apellidos}</td>
            <td>${item.rut}</td>
            <td>${item.direccion}</td>
            <td>${item.ciudad}</td>
            <td>
                <button class="btn btn-danger" onclick="location.href='eliminar?id=${item.id}'" type="button">Eliminar</button>
            </td>
            <td>
                <button class="btn btn-primary" onclick="location.href='editar?id=${item.id}'" type="button">Actualizar</button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="agregar.jsp">Crear persona</a>
</body>
</html>
