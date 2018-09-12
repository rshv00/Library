<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Trends</title>
        <script type="text/javascript">
            <%@include file="../js/scroll.js"%>
            <%@include file="../js/searchTable.js"%>
            <%@include file="../js/showTable.js"%>
        </script>
        <style>
            <%@include file="../css/reset.css"%>
            <%@include file="../css/text.css"%>
            <%@include file="../css/960_24_col.css"%>
            <%@include file="../css/header-footer.css"%>
            <%@include file="../css/table.css"%>
        </style>
        <link rel="stylesheet" href="../css/reset.css">
        <link rel="stylesheet" href="../css/text.css">
        <link rel="stylesheet" href="../css/960_24_col.css">
        <link rel="stylesheet" href="../css/header-footer.css">
        <link rel="stylesheet" href="../css/table.css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat:300,400" rel="stylesheet">
    </head>
    <body>
        <div class="container_24">
            <header class="header" id="myHeader">
                <h1 class="grid_7" id="logo"><a href="<c:url value="/"/>">library</a></h1>
                <nav class="grid_17">
                    <ul>
                        <li><a href="/user/me">Me</a></li>
                        <li><a href="/user/history">History</a></li>
                        <li><a href="/user/trends">Trends</a></li>
                        <li><a href="/logout">Logout</a></li>
                    </ul>
                </nav>
            </header>
            <div class="main">
                <p class="title">Top 10 most popular books</p>

                <table id="myTable" class="stats">
                    <tr class="header">
                        <th>Book</th>
                        <th>Authors</th>
                    </tr>
                    <c:forEach var="book" items="${listOfPopular}">
                        <tr>
                            <td><c:out value="${book.name}"></c:out></td>
                            <td><c:out value="${book.authors}"></c:out></td>
                        </tr>
                    </c:forEach>
                </table>

                <p class="title">Top 10 most unpopular books*</p>
                <table id="myTable" class="stats">
                    <tr class="header">

                    <c:forEach var="bookUn" items="${listOfUnpopular}">
                        <tr>
                            <td><c:out value="${bookUn.name}"/></td>
                            <td><c:out value="${bookUn.authors}"/></td>
                        </tr>
                    </c:forEach>
                    </tr>
                </table>
                <p class="t2">*Starting books were taken as minimum once by all time</p>

                <p class="t2" id="tip" >By the way, there are <c:out value="${numberDuringIndep}"></c:out> books written after Independency of Ukraine</p>

            </div>
        </div>
        <footer>
            <p>2018</p>
        </footer>
        <script src="../js/scroll.js"></script>
    </body>
</html>