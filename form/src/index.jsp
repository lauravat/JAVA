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
      <h4>Ingrese sus nombres</h4>
        <div class="input-group">
            <label for="firstName">Ingrese sus nombres:</label>
            <input type="text" id="firstName" name="firstName" placeholder="Primer nombre" class="form-control" required autofocus pattern="[A-Za-z] {2, 40}">
            <input type="text" id="secondName" name="secondName" placeholder="Segundo nombre" class="form-control" required >
          </div>
          <br>
          <h4>Ingrese sus apellidos</h4>
          <div class="input-group">
            <input type="text" id="" name="" placeholder="Primer apellido" class="form-control" required >
            <input type="text" id="" name="" placeholder="Segundo apellido" class="form-control" required >
          </div>
          <br>
          <h4>Digite su correo electronico</h4>
          <div class="input-group mb-3">
            <input type="text" class="form-control" id="" name="" placeholder="Correo electronico" aria-label="Recipient's username" aria-describedby="basic-addon2" required >
            <span class="input-group-text" id="basic-addon2">@example.com</span>
          </div>
          <br>
          <h4>Digite su contraseña</h4>
          <div class="input-group mb-3">
            <input type="password" id="" name="" class="form-control" aria-label="Amount (to the nearest dollar)" placeholder="Contraseña" required >
          </div>
          <input class="btn btn-primary" type="submit" value="Submit">
    </form>
        </section>
        <footer></footer>
    </div>
    
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>
