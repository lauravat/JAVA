<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulario de registro</title>
    <link rel="stylesheet" href="./webapp/css/form.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <header></header>
        <nav></nav>
        <section>
            <form action="" method="post">
      <h1>FORMULARIO DE REGISTRO</h1>
        <div class="input-group">
            <label for="firstName" class="typeLetter">Ingrese sus nombres: </label>
            <input type="text" id="firstName" name="firstName" placeholder="Nombres" class="form-control" required autofocus pattern="[A-Za-z] {2, 40}">
          </div>
          <br>
          <div class="input-group">
            <label for="lastName" class="typeLetter">Ingrese sus apellidos: </label>
            <input type="text" id="lastName" name="lastName" placeholder="Apellidos" class="form-control" required pattern="[A-Za-z] {2, 40}">
          </div>
          <br>
          <div class="input-group mb-3">
            <label for="email" class="typeLetter">Ingrese su correo electronico: </label>
            <input type="email" class="form-control" id="email" name="email" placeholder="Correo electronico" aria-label="Recipient's username" aria-describedby="basic-addon2" required pattern="{,60}">
            <span class="input-group-text" id="basic-addon2">@example.com</span>
          </div>
          <br>
          <div class="input-group mb-3">
            <label for="password" class="typeLetter">Ingrese su contraseña: </label>
            <input type="password" id="password" name="password" class="form-control" aria-label="Amount (to the nearest dollar)" placeholder="Contraseña" required pattern="">
          </div>
          <input class="btn btn-second" type="submit" value="Ingresar">
          <input class="btn btn-primary" type="submit" value="Enviar">
    </form>
        </section>
        <footer></footer>
        
    </div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>
