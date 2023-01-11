<%--
  Created by IntelliJ IDEA.
  User: nasta
  Date: 1/10/2023
  Time: 4:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Document</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>"/>
</head>
<body>
<header class="header--form-page">
    <%@ include file="header.jsp" %>
    <div class="slogan container container--90">
        <h2>
            Dziękujemy za przesłanie formularza!
        </h2>
    </div>
</header>
<%@ include file="footer.jsp"%>

