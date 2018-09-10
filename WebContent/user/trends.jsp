<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                <h1 class="grid_7" id="logo"><a href="<c:url value="/main"/>">library</a></h1>
                <nav class="grid_17">
                    <ul>
                        <li><a href="/me">Me</a></li>
                        <li><a href="/history">History</a></li>
                        <li><a href="/trends">Trends</a></li>
                        <li><a href="/logout">Logout</a></li>
                    </ul>
                </nav>
            </header>
            <div class="main">
                <p class="title">Top 10 most popular books by all time</p>
                <form action="trends" id="dropdown">
                    <label class="label_stats" for="drdown">Change:</label>
                    <select class="drdown" onchange="document.location=this.options[this.selectedIndex].value">
                        <option value="trends.html">All time</option>
                        <option value="trends.html?q=30">30 days</option>
                        <option value="trends.html?q=183">6 months</option>
                        <option value="trends.html?q=365">12 months</option>
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
                    <c:forEach var="book" items="${listBook}">
                        <tr>
                            <td><c:out value="${book.bookName}"/></td>
                            <td><c:out value="${book.authorName}"/></td>
                            <td><c:out value="${book.coauthorName}"/></td>
                            <td><c:out value="${book.editionYear}"/></td>
                        </tr>
                    </c:forEach>
                </table>

                <p class="title">Top 10 most unpopular books*</p>
                <table id="myTable" class="stats">
                    <tr class="header">
                        <th></th>
                        <th>Book</th>
                        <th>Author</th>
                    </tr>
                    <tr>
                        <td>1</td>
                        <td>Fairy Tales</td>
                        <td>Taras Shevchenko</td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>Not Fairy Tales</td>
                        <td>Lesia Ukrainka</td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td>Maybe Fairy Tales</td>
                        <td>Orest Patuk</td>
                    </tr>
                </table>
                <p class="t2">*Starting books were taken as minimum once by all time</p>

                <p class="t2" id="tip" >By the way, there are ... books written after Independency of Ukraine</p>        

            </div>
        </div>
        <footer>
            <p>2018</p>
        </footer>
        <script src="../js/scroll.js"></script>
    </body>
</html>