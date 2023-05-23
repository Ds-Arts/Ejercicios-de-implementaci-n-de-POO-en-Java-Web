<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/vista7.css"/>
    <title>onsultar</title>
</head>

<body style="background-image: url(img/a.jpg)">
    <section class="form-login">
        <h5>consultar saldo</h5>
        
        <form action="bolsillo" method="post">
            <label for="consultar"><h5>su saldo es</h5></label>
        <p>  <%=request.getAttribute("saldoTotal")%> </p>
        
        </form>
        <a href="bolsillo?accion=dashboardD"><input class="buttons" type="submit" name="" value="Volver a menu principal"></a>
        
    </section>
</body>
</html>