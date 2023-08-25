<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Editar</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">

</head>
<body>
<h1>Editar</h1>
<form name="formulario" action="agregar" method="get" class="form">
    <div class="form-group">
        <label for="formId">ID</label>
        <input type="text" class="form-control" id="formId" name="formId" value="${persona.id}" readonly>
    </div>

    <div class="form-group">
        <label for="formNombres">Nombre</label>
        <input type="text" class="form-control" id="formNombres" name="formNombres" value="${persona.nombres}">
    </div>

    <div class="form-group">
        <label for="formApellidos">Apellidos</label>
        <input type="text" class="form-control" id="formApellidos" name="formApellidos" value="${persona.apellidos}">
    </div>

    <div class="form-group">
        <label for="formRut">RUT</label>
        <input type="text" class="form-control" id="formRut" name="formRut" value="${persona.rut}">
    </div>

    <div class="form-group">
        <label for="formDireccion">Direccion</label>
        <input type="text" class="form-control" id="formDireccion" name="formDireccion" value="${persona.direccion}">
    </div>

    <div class="form-group">
        <label for="formCiudad">Ciudad</label>
        <input type="text" class="form-control" id="formCiudad" name="formCiudad" value="${persona.ciudad}">
    </div>

    <button type="submit" class="btn btn-primary">Enviar</button>
</form>

</body>
</html>
