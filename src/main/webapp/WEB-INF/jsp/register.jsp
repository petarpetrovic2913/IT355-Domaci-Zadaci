

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" type="text/css"/>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <title>IT355</title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        
        <title>Register</title>

        <link href="resources/css/bootstrap.min.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
        <style>
            body {
                padding-top: 70px;
            }
        </style>
    </head>
    <body>
        <%@include file="header.jsp" %>

        <div class="login-page">
            <div class="form">
                <form class="register-form">
                    <input type="text" placeholder="Name"/>
                    <input type="password" placeholder="Password"/>
                    <input type="password" placeholder="Confirm password"/>
                    <input type="text" placeholder="Email address"/>
                    <input type="text" placeholder="Name"/>
                    <input type="text" placeholder="Surname"/>
                    <button>Create</button>
                    <p class="message">Already registered? <a href="#">Sign In</a></p>
                </form>
                <form class="login-form">
                    <input type="text" placeholder="Username"/>
                    <input type="password" placeholder="Password"/>
                    <button>Login</button>
                    <p class="message">Not registered? <a href="#">Create an account</a></p>
                </form>
            </div>
        </div>

        <script src="resources/js/jquery.js"></script>
        <script src="resources/js/bootstrap.min.js"></script>
        <script src="js/style.js"></script>
    </body>
</html>
