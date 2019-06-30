

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
        
        <title>IT355-DZ01</title>

        <link href="resources/css/bootstrap.min.css" rel="stylesheet">

        <style>
        body {
            padding-top: 70px;
        }
        </style>
    </head>
    <body>
        <%@include file="header.jsp" %>

        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h1>Mirai</h1>
                    <spring:url value="/resources/images" var="images" />
                    <img src="images/image.png"/>
                    <p class="lead">Kyoukai No Kanata</p>
                    <ul class="list-unstyled">
                        <li>Software Engineering</li>
                        <li>Metropolitan University</li>
                    </ul>
                </div>
            </div>
        </div>

        <script src="resources/js/jquery.js"></script>
        <script src="resources/js/bootstrap.min.js"></script>

    </body>
</html>
