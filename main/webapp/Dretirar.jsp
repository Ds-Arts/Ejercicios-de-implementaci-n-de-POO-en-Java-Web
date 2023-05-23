<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/vista7.css"/>
    <title>Retirar</title>
</head>
<body style="background-image: url(img/a.jpg)">
    <section class="form-login">
        <h5>Retirar saldo</h5>
        <form action="bolsillo" method="post">
            <input type="text" name="retira" placeholder="saldo a Retirar">    
            <input class="buttons" type="submit" name="accion" value="retirar">
            </form>
    </section>
</body>
</html>