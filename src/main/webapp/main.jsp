<%@ page import="main.entity.User" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Search book</title>
    <script type="text/javascript">
        <%@include file="js/scroll.js"%>
        <%@include file="js/searchTable.js"%>
        <%@include file="js/showTable.js"%>
    </script>
    <style>
        <%@include file="css/reset.css"%>
        <%@include file="css/960_24_col.css"%>
        <%@include file="css/header-footer.css"%>
        <%@include file="css/table.css"%>
        <%@include file="css/search.css"%>
        <%@include file="css/text.css"%>
    </style>
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/960_24_col.css">
    <link rel="stylesheet" href="css/text.css">
    <link rel="stylesheet" href="css/header-footer.css">
    <link rel="stylesheet" href="css/table.css">
    <link rel="stylesheet" href="css/search.css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:300,400" rel="stylesheet"/>
</head>
<body>
<div class="container_24">
    <% if (session.getAttribute("role").equals(User.ROLE.user)) { %>
    <header class="header" id="myHeader">
        <h1 class="grid_7" id="logo"><a href="/main">library</a></h1>
        <nav class="grid_17">
            <ul>
                <%--<c:url value="/user/me.jsp" var="inputURL" >--%>
                <%--</c:url>--%>

                <li><a href="/me">Me</a></li>
                <li><a href="/history">History</a></li>
                <li><a href="/trends">Trends</a></li>
                <li><a href="/logout">Logout</a></li>

            </ul>
        </nav>
    </header>
    <% } else {%>
    <header class="header" id="myHeader">
        <h1 class="grid_7" id="logo"><a href="/main">l-admin</a></h1>
        <nav class="grid_17">
            <ul>
                <li><a href="/records">Records</a></li>
                <li><a href="/main/webapp/admin/add-book.jsp">Add book</a></li>
                <li><a href="/users-list">Users</a></li>
                <li><a href="/logout">Logout</a></li>
            </ul>
        </nav>
    </header>
    <% } %>

    <div class="main">
        <p class="title">Search available books</p>
        <input type="text" id="myInput" onkeyup="search()" placeholder="E.g Fairy Tales" onchange="showTable()"
               title="Type field">
        <table id="myTable">
            <% if (session.getAttribute("role").equals(User.ROLE.user)) { %>
            <tr class="header">
                <th>Book name</th>
                <th>Author</th>
                <th>Coauthor</th>
                <th>Year</th>
                <th></th>
            </tr>
            <c:forEach var="book" items="${listBook}">
                <tr>
                    <td><c:out value="${book.bookName}"/></td>
                    <td><c:out value="${book.authorName}"/></td>
                    <td><c:out value="${book.coauthorName}"/></td>
                    <td><c:out value="${book.editionYear}"/></td>
                    <td>
                        <a href="${pageContext.request.contextPath}/main/webapp/main.jsp?reserve=<c:out value='${book.id}'/>">Reserve</a>
                    </td>
                </tr>
            </c:forEach>
            <% } else {%>
            <tr class="header">
                <th>Book id</th>
                <th>Book name</th>
                <th>Author</th>
                <th>Coauthor</th>
                <th>Edition year</th>
                <th></th>
            </tr>
            <c:forEach var="book" items="${listBook}">
                <tr>
                    <td><c:out value="${book.id}"/></td>
                    <td><c:out value="${book.bookName}"/></td>
                    <td><c:out value="${book.authorName}"/></td>
                    <td><c:out value="${book.coauthorName}"/></td>
                    <td><c:out value="${book.editionYear}"/></td>
                    <td>
                        <a href="/edit?id=<c:out value='${book.id}' />">Edit</a>
                    </td>
                </tr>
            </c:forEach>
            <% } %>
        </table>
    </div>
</div>
<footer>
    <p>2018</p>
</footer>
<script src="js/scroll.js"></script>
<script src="js/showTable.js"></script>
<script src="js/searchTable.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</body>
</html>