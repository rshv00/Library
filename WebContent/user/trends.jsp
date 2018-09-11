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
                        <li><a><form:form action="${pageContext.request.contextPath}/logout" method="POST"><input type="submit" class="a" value="Logout"/></form:form></a></li>
                    </ul>
                </nav>
            </header>
            <div class="main">
                <p class="title">Top 10 most popular books by all time</p>
                <form action="trends" id="dropdown" name="dropDown" method="get">
                    <label class="label_stats" for="drdown">Change:</label>
                    <select name = "dropDown" class="drdown" id="drdown"
                            onchange="document.location=this.options[this.selectedIndex].value">
                        <option value="trends?dropDown=0">All time</option>
                        <option value="trends?dropDown=30">30 days</option>
                        <option value="trends?dropDown=183">6 months</option>
                        <option value="trends?dropDown=365">12 months</option>
                    </select>
                </form>

                <table id="myTable" class="stats">
                    <tr class="header">
                        <th></th>
                        <th>Book</th>
                        <th>Author</th>
                        <th>Coauthor</th>
                        <th>Edition Year</th>
                    </tr>
                    <c:forEach var="book" items="${listOfPopular}">
                        <tr>
                            <td><c:out value="${book.getBookName()}"/></td>
                            <td><c:out value="${book.author.getName()}"/></td>
                            <td><c:out value="${book.author.getCoauthorName}"/></td>
                            <td><c:out value="${book.bookInstance.getEditionYear()}"/></td>
                        </tr>
                    </c:forEach>
                </table>

                <p class="title">Top 10 most unpopular books*</p>
                <table id="myTable" class="stats">
                    <tr class="header">

                    <c:forEach var="bookUn" items="${listOfUnpopular}">
                        <tr>
                            <td><c:out value="${bookUn.bookName}"/></td>
                            <td><c:out value="${bookUn.authorName}"/></td>
                            <td><c:out value="${bookUn.coauthorName}"/></td>
                            <td><c:out value="${bookUn.editionYear}"/></td>
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