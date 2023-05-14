<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="author" content="Laura Aguilar">
    <meta name="description" content="Esta debe ser la información que aparece en el parrafo que acompaña los resultados de una busqueda en Internet">
    <meta name="keywords" content="registro de usuario, formulario de registro, crear cuenta, registro en linea">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>REGISTRO</title>
    <link rel="icon" type="image/x-icon" href="../img/empresa.png">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <link rel="stylesheet" href="">
    <link rel="stylesheet" href="../css/estilos.css">
</head>
<body>
<div class="container">
    <header></header>
    <nav></nav>
    <section>
        <form action="" method="post" class="formRegister">
            <h1>REGISTRO</h1>
            <h5>Ingrese los siguientes datos para completar su registro</h5>
            <div class="mb-3">
                <label for="name" class="form-label">Nombre</label>
                <input type="text" class="form-control" id="name" name="name" placeholder="Nombre" required autofocus pattern="[A-Za-z] {2, 40}">
            </div>
            <div class="mb-3">
                <label for="lastName" class="form-label">Apellido</label>
                <input type="text" class="form-control" id="lastName" name="lastName" placeholder="Apellido" required pattern="[A-Za-z] {2, 40}">
            </div>
              <div class="mb-3">
                <label for="addres" class="form-label">Dirección</label>
                <input type="text" class="form-control" id="addres" name="addres" placeholder="Dirección" required pattern="[A-Za-z] {2, 40}">
            </div>
            <div class="mb-3">
                <label for="email" class="form-label">Correo electronico</label>
                <input type="email" class="form-control" id="email" name="email" placeholder="Correo electronico" required autofocus pattern="{,60}">
            </div>
            <div class="mb-3">
                <label for="password" class="form-label">Defina su contraseña</label>
                <input type="password" class="form-control" id="password" name="password" placeholder="Contraseña" required autofocus pattern="{,60}">
            </div>
            <br>
            <input class="btn btn-primary" type="submit" value="Enviar">
            <div>
                <p>¿Ya tiene una cuenta? <a href="./index.jsp"> Ingresar</a></p>
            </div>
        </form>
    </section>
    <footer>

    </footer>
</div>
</body>
</html>
