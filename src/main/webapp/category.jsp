<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="author" content="Laura Aguilar">
    <meta name="description" content="Esta debe ser la información que aparece en el parrafo que acompaña los resultados de una busqueda en Internet">
    <meta name="keywords" content="registro de usuario, formulario de registro, crear cuenta, registro en linea">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CATEGORIA</title>
    <link rel="icon" type="image/x-icon" href="">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <link rel="stylesheet" href="">
    <link rel="stylesheet" href="./css/estilos.css">
</head>
<body>
    <div class="container">
        <header></header>
        <nav></nav>
        <section>
            <form action="./register-category" method="post">
                <h1>REGISTRO CATEGORIA</h1>
                <h5>Ingrese los siguientes datos para completar el registro de una categoria</h5>
                <div class="mb-3">
                    <label for="name_category" class="form-label">Nombre de categoria</label>
                    <input type="text" class="form-control" id="name_category" name="name_category" placeholder="nombre categoria" required pattern="[A-Za-z] {2, 40}">
                </div>
                <br>
                    <input class="btn btn-primary" type="submit" value="Enviar">
            </form>
        </section>
    </div>
</body>
</html>