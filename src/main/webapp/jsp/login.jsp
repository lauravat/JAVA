<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="author" content="Laura Aguilar">
    <meta name="description" content="Esta debe ser la información que aparece en el parrafo que acompaña los resultados de una busqueda en Internet">
    <meta name="keywords" content="registro de usuario, formulario de registro, crear cuenta, registro en linea">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>LOGIN</title>
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
        <form action="" method="post" class="formLogin">
            <img src="../img/empresa.png" alt="image" width="100">
            <h1>INGRESA</h1>
            <div class="mb-3">
                <label for="user" class="form-label">Usuario</label>
                <input type="text" class="form-control" id="user" name="user" placeholder="Usuario" required autofocus pattern="[A-Za-z] {2, 40}" > 
            </div>
            <div class="mb-3">
                <label for="password" class="form-label">Contraseña</label>
                <input type="password" class="form-control" id="password" name="password" placeholder="Contraseña" required pattern="">
            </div>
            <input class="btn btn-primary" type="submit" value="Ingresar">
            <br>
            <div>
                <p>¿No tiene una cuenta? <a href="register.jsp"> Registrese</a></p>
            </div>
        </form>
    </section>
    <footer>

    </footer>
</div>
</body>
</html>