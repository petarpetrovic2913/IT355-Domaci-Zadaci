<%@ page language="java" pageEncoding="UTF-8"
         contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
    <head>
        <title>IT355</title>
        <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
        <link href="<c:url value="/resources/css/bootstrap.css" />"
              rel="stylesheet">
        <style type="text/css">
            body {
                padding-top: 20px;
                padding-bottom: 40px;
            }

            /* Custom container */
            .container-narrow {
                margin: 0 auto;
                max-width: 700px;
            }

            .container-narrow>hr {
                margin: 30px 0;
            }

            .create_btn {
                margin: 10px 0;
                text-align: center;
            }

            .create_btn .btn {
                font-size: 21px;
                padding: 14px 24px;
            }
        </style>
        <link href="<c:url value="/resources/css/bootstrap-responsive.css" />"
              rel="stylesheet">
    </head>
    <body>
        <div class="container-narrow">
            <div class="masthead">
                <ul class="nav nav-pills pull-right">
                    <li class="active"><a href="<c:url value="/" />">Home</a></li>
                    <li><a href="<c:url value="/about"/>">About</a></li>
                    <li><a href="<c:url value="/signout"/>">Sign out</a></li>
                </ul>
                <h3 class="muted"><a href="<c:url value="/" />">Mirai Blog</a></h3>
            </div>
            <hr>
            <div class="container" style="margin:auto; width: 40%">
                <div class="row">
                    <div class="col-lg-12 text-center">
                        <center><h1>Mirai</h1></center>
                        <img src="<c:url value="resources/img/image.png"/>"/>
                        <center><p class="lead">Kyoukai No Kanata</p>
                        <ul class="list-unstyled">
                            <li>Software Engineering</li>
                            <li>Metropolitan University</li>
                        </ul>
                        </center>
                    </div>
                </div>
            </div>
            
        </div>
    </body>
</html>
