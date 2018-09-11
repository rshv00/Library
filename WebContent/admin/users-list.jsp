<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Users</title>
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
            <%@include file="../css/table2.css"%>
        </style>
        <link rel="stylesheet" href="../css/reset.css">
        <link rel="stylesheet" href="../css/text.css">
        <link rel="stylesheet" href="../css/960_24_col.css">
        <link rel="stylesheet" href="../css/header-footer.css">
        <link rel="stylesheet" href="../css/table.css">
        <link rel="stylesheet" href="../css/table2.css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat:300,400" rel="stylesheet">

        <script type="text/javascript" src="../js/scroll.js"></script>

    </head>
    <body>
        <div class="container_24">
            <header class="header" id="myHeader">
                <h1 class="grid_7" id="logo"><a href="<c:url value="/"/>">l-admin</a></h1>
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
               <p class="title">Users</p>
               <p class="t2">All</p>
                <input type="text" id="myInput" onkeyup="search()" placeholder="Search">
                <table id="myTable" cellpadding="0" cellspacing="0" class="users_table">
                    <tr class="header">
                        <th>User Id</th>
                        <th>Name</th>
                        <th>Phone</th>
                        <th>Birth date</th>
                        <th>Registration date</th>
                    </tr>
                    <c:forEach var="users" items="${users}">
                        <tr>
                            <td><c:out value="${users.id}"></c:out></td>
                            <td><c:out value="${users.name}"></c:out></td>
                            <td><c:out value="${users.phone}"></c:out></td>
                            <td><c:out value="${users.birth_date}"></c:out></td>
                            <td><c:out value="${users.registration_date}"></c:out></td>
                        </tr> </c:forEach>

                </table>
                <p class="t2" id="debtors">Debtors*</p>
                   <input type="text" id="myInput2" onkeyup="search2()" placeholder="Search" title="Type field">
                <table id="myTable2" cellpadding="0" cellspacing="0" class="users_table">
                    <tr class="header">
                        <th>User Id</th>
                        <th>Name</th>
                        <th>Phone</th>
                        <th>Birth date</th>
                        <th>Registration date</th>
                    </tr>
                    <c:forEach var="debtors" items="${debtors}">
                        <tr>
                            <td><c:out value="${debtors.user.userId}"></c:out></td>
                            <td><c:out value="${debtors.user.userName}"></c:out></td>
                            <td><c:out value="${debtors.user.phone}"></c:out></td>
                            <td><c:out value="${debtors.user.birthDate}"></c:out></td>
                            <td><c:out value="${debtors.user.registrationDate}"></c:out></td>
                        </tr> </c:forEach>
                </table>
                <p class="t2">*Who has not been returning as minimum as 1 book for more than 30 days</p>
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