<%@ page import="main.entity.User" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
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
<br class="container_24">
<security:authorize access="hasRole('USER')">
    <header class="header" id="myHeader">
        <h1 class="grid_7" id="logo"><a href="/main">Library</a></h1>
        <nav class="grid_17">
            <ul>
                <%--<c:url value="/user/me.jsp" var="inputURL" >--%>
                <%--</c:url>--%>
                <li><a href="/user/me">Me</a></li>
                <li><a href="/user/history">History</a></li>
                <li><a href="/user/trends">Trends</a></li>
                <li><form:form action="${pageContext.request.contextPath}/logout" method="POST"><input type="submit" class="a" value="Logout"/></form:form></a></li>
            </ul>
        </nav>
    </header>
</security:authorize>
<security:authorize access="hasRole('ADMIN')">
    <header class="header" id="myHeader">
        <h1 class="grid_7" id="logo"><a href="/main">Library-admin</a></h1>
        <nav class="grid_17">
            <ul>
                <li><a href="/admin/records">Records</a></li>
                <li><a href="/admin/add-book">Add book</a></li>
                <li><a href="/admin/users-list">Users</a></li>
                <li><a><form:form action="${pageContext.request.contextPath}/logout" method="POST"><input type="submit" class="a" value="Logout"/></form:form></a></li>
            </ul>
        </nav>
    </header>
</security:authorize>
<security:authorize access="hasRole('GUEST')">
    <header class="header" id="myHeader">
        <h1 class="grid_7" id="logo"><a href="/main">Guest-page</a></h1>
        <nav class="grid_17">
            <ul>
                <li><a href="/login">Login</a></li>
                <li><form:form action="${pageContext.request.contextPath}/logout" method="POST" cssClass="a"><input type="submit" class="a" value="Logout"/></form:form></li>
            </ul>
        </nav>
    </header>
</security:authorize>
    <div class="main">
        <security:authorize access="hasRole('ADMIN')">
        <p class="title">Search available books</p>
        <input type="text" id="myInput" onkeyup="search()" placeholder="E.g Fairy Tales" onchange="showTable()"
               title="Type field">
        <table id="myTable">
            <tr class="header">
                <th>Book name</th>
                <th>Year</th>
                <th>Availability</th>
                <th>Action</th>
            </tr>
            <c:forEach var="bookInstance" items="${listBook}">
                <tr>
                    <td><c:out value="${bookInstance.book.name}"/></td>
                    <td><c:out value="${bookInstance.editionYear}"/></td>
                    <td><c:out value="${bookInstance.available}"/></td>
                    <%--<td><c:out value="${bookInstance.bookInstances.toArray()}"/></td>--%>
                    <td>
                        <a href="${pageContext.request.contextPath}/main.jsp?reserve=<c:out value='${book.id}'/>">Reserve</a>
                    </td>
                </tr>
            </c:forEach>
            </security:authorize>
            <security:authorize access="hasRole('USER')">
            <p class="title">Search available books</p>
            <input type="text" id="myInput" onkeyup="search()" placeholder="E.g Fairy Tales" onchange="showTable()"
                   title="Type field">
            <table id="myTable">
            <tr class="header">
                <th>Book id</th>
                <th>Book name</th>
                <th>Year</th>
                <th>Availability</th>
                <th>Action</th>
            </tr>
            <c:forEach var="bookInstance" items="${listBook}">
                <tr>
                    <td><c:out value="${bookInstance.id}"/></td>
                    <td><c:out value="${bookInstance.book.name}"/></td>
                    <td><c:out value="${bookInstance.editionYear}"/></td>
                    <td><c:out value="${bookInstance.available}"/></td>
                    <%--<td><c:out value="${book.editionYear}"/></td>--%>
                    <td>
                        <a href="/edit?id=<c:out value='${book.id}' />">Edit</a>
                    </td>
                </tr>
            </c:forEach>
                </security:authorize>
                <security:authorize access="hasRole('GUEST')">
            <div class="main">
                <p id="landing" class="title2" >Welcome, guest</p>
                <p class="title2"><a href="/WEB-INF/login.jspogin.jsp" class="title2">Sign in, pls</a></p>

            </div>
                </security:authorize>
        </table>
    </div>
<footer>
    <p>2018</p>
</footer>
</body>
</html>