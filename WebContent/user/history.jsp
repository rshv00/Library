<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>My history</title>
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
                <p class="title">My history of records</p>
                <input type="text" id="myInput" onkeyup="search()" placeholder="Search" title="Type field">
                <table id="myTable">
                    <tr class="header">
                        <th>Record ID</th>
                        <th>Name</th>
                        <th>Taken</th>
                        <th>Returned</th>
                    </tr>
                   <c:forEach var="record" items="${myRecords}">
                       <tr>
                           <td><c:out value="${record.id}"></c:out></td>
                           <td><c:out value="${record.instance.book.name}"></c:out></td>
                           <td><c:out value="${record.taken}"></c:out></td>
                           <td><c:out value="${record.returned}"></c:out></td>
                       </tr>
                   </c:forEach>
                </table>
            </div>
        </div>
        <footer>
            <p>2018</p>
        </footer>

        <script src="../js/scroll.js"></script>
        <script src="../js/searchTable.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    </body>
</html>