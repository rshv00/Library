<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Book statistics</title>
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
            <%@include file="../css/form.css"%>
        </style>
        <link rel="stylesheet" href="../css/reset.css">
        <link rel="stylesheet" href="../css/text.css">
        <link rel="stylesheet" href="../css/960_24_col.css">
        <link rel="stylesheet" href="../css/header-footer.css">
        <link rel="stylesheet" href="../css/form.css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat:300,400" rel="stylesheet">
    </head>
    <body>
        <div class="container_24">
            <header class="header" id="myHeader">
                <h1 class="grid_7" id="logo"><a href="<c:url value="/main"/>">l-admin</a></h1>
                <nav class="grid_17">
                    <ul>
                        <li><a href="records">Records</a></li>
                        <li><a href="add-book">Add book</a></li>
                        <li><a href="../admin/users-list">Users</a></li>
                        <li><a href="../WEB-INF/login">Logout</a></li>
                    </ul>
                </nav>
            </header>
            <div class="main"> <p class="title">Statistics of Book Name</p>

                <table id="myTable">
                    <tr class="header">
                        <th>Taken times</th>     
                        <th>Average reading time</th>
                        <th>Average age of users</th>
                    </tr>
                    <tr>
                        <td>17</td>
                        <td>11 days</td>
                        <td>25 years</td>
                    </tr>
                </table>

                <p class="t2" id="by_inst">By instances</p>

                <table id="myTable">
                    <tr class="header">
                        <th>Instance Id</th>     
                        <th>Taken times</th>
                    </tr>
                    <tr class>
                        <td><a title="Edit or remove instance" href="edit-instance.jsp?instanceId=3">3</a></td>
                        <td>8</td>
                    </tr>
                    <tr>
                        <td><a title="Edit or remove instance" href="edit-instance.jsp?instanceId=5">5</a></td>
                        <td>2</td>
                    </tr> 
                    <tr>
                        <td><a title="Edit or remove instance" href="edit-instance.jsp?instanceId=7">7</a></td>
                        <td>11</td>
                    </tr>
                </table>
            </div>
        </div>
        <footer>
            <p>2018</p>
        </footer>
        <script src="../js/scroll.js"></script>
        <script src="../js/searchTable.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>к
    </body>
</html>