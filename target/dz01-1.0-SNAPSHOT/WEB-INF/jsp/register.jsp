

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
        <c:choose>
            <c:when test="${empty username}">
            </c:when>
            <c:otherwise>
                <h2>User ${username} <br/>you are not allowed to see this page.</h2>
                </c:otherwise>
            </c:choose>
        <div class="login-page">
            <div class="form">
                <form class="register-form" >
                    <form:label path="placeholders"><spring:message code="username" var="placeholder"/></form:label>
                    <input placeholder="Username" type="text" placeholder="${placeholder}" />
                    <form:label path="placeholders"><spring:message code="password" var="placeholder"/></form:label>
                    <input placeholder="Password" type="password" placeholder="${placeholder}"/>
                    <form:label path="placeholders"><spring:message code="confirmPassword" var="placeholder"/></form:label>
                    <input placeholder="Confirm password" type="password" placeholder="${placeholder}"/>
                    <form:label path="placeholders"><spring:message code="emailAdress" var="placeholder"/></form:label>
                    <input placeholder="Email address" type="text" placeholder="${placeholder}"/>
                    <form:label path="placeholders"><spring:message code="name" var="placeholder"/></form:label>
                    <input placeholder="Name" type="text" placeholder="${placeholder}"/>
                    <form:label path="placeholders"><spring:message code="surname" var="placeholder"/></form:label>
                    <input  placeholder="Surname" type="text" placeholder="${placeholder}"/>
                    <button>Create</button>
                    <p class="message">Already registered? <a href="#">Sign In</a></p>
                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                </form>
                <form class="login-form">
                    <form:label path="placeholders"><spring:message code="username" var="placeholder"/></form:label>
                    <input placeholder="Username" type="text" placeholder="${placeholder}"/>
                    <form:label path="placeholders"><spring:message code="password" var="placeholder"/></form:label>
                    <input placeholder="Password" type="password" placeholder="${placeholder}"/>
                    <button>Login</button>
                    <p class="message">Not registered? <a href="#">Create an account</a></p>
                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                </form>
            </div>
        </div>

        <script src="resources/js/jquery.js"></script>
        <script src="resources/js/bootstrap.min.js"></script>
        <script src="js/style.js"></script>
    </body>
</html>
