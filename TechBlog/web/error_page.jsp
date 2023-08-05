
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <!--css-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/mystyle.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <style>
            .jumbotron.Primary-background {
                background-color: #2196f3;
                clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 96%, 59% 85%, 29% 94%, 0 89%, 0 0);
            }
        </style>

        <title>Sorry! Something went wrong...</title>
    </head>
    <body>


        <div class="container text-center">
            <img src="img/warning.png" class="img-fluid">
            <<h1 class="display-3">Sorry! Something went wrong...</h1>
            <%= exception%>
            <a href="index.jsp" class="btn primary-background btn-lg text-white mt-3 ">Home</a>

        </div>
    </body>
</html>
