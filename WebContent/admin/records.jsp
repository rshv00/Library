<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Records</title>
        <script type="text/javascript">
            <%@include file="../js/scroll.js"%>
            <%@include file="../js/searchTable.js"%>
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
                <h1 class="grid_7" id="logo"><a href="/admin/main">l-admin</a></h1>
                <nav class="grid_17">
                    <ul>
                        <li><a href="/admin/records">Records</a></li>
                        <li><a href="/admin/add-book">Add book</a></li>
                        <li><a href="/admin/users-list">Users</a></li>
                        <li><a><form:form action="${pageContext.request.contextPath}/logout" method="POST"><input type="submit" class="a" value="Logout"/></form:form></a></li>
                    </ul>
                </nav>
            </header>
            <div class="main">
                <p class="title">History of records</p>
                <input type="text" id="myInput" onkeyup="search()" placeholder="Search" title="Type field">
                <table id="myTable">
                    <tr class="header">
                        <th>Instance ID</th>  
                        <th>User ID</th>   
                        <th>Book</th>     
                        <th>Taken</th>     
                        <th>Returned</th>     
                    </tr>

                        <c:forEach var="records" items="${records}">
                    <tr>
                        <td><c:out value="${records.instanceId}"></c:out></td>
                        <td><c:out value="${records.user.getUserId()}"></c:out></td>
                        <td><c:out value="${records.book.getBookName()}"></c:out></td>
                        <td><c:out value="${records.bookTaken}"></c:out></td>
                        <td><c:out value="${records.bookReturned}"></c:out></td>
                    </tr> </c:forEach>

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