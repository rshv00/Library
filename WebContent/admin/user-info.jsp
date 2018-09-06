<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Info</title>
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
                <h1 class="grid_7" id="logo"><a href="/main">l-admin</a></h1>
                <nav class="grid_17">
                    <ul>
                        <li><a href="records.jsp">Records</a></li>
                        <li><a href="add-book.jsp">Add book</a></li>
                        <li><a href="../admin/users-list">Users</a></li>
                        <li><a href="../entry/sign-in.jsp">Logout</a></li>
                    </ul>
                </nav>
            </header>
            <div class="main">

                <p class="title">Records by User ID#</p>
                <input type="text" id="myInput" onkeyup="search()" placeholder="Search" title="Type field">
                <table id="myTable">
                    <tr class="header">
                        <th >Instance ID</th>     
                        <th >Name</th>     
                        <th >Taken</th>     
                        <th >Returned</th>     
                    </tr>
                    <tr>
                       <td><a title="Edit or remove instance" href="edit-instance.jsp?instanceId=1">1</a></td>
                        <td><a title="Detail statistics" href="book-stats.jsp?bookName=Fairy+Tales">Fairy Tales</a></td>
                        <td>20-12-2017</td>
                        <td>30-12-2017</td>
                    </tr>
                    <tr>
                        <td><a title="Edit or remove instance" href="edit-instance.jsp?instanceId=2">2</a></td>
                        <td><a title="Detail statistics" href="book-stats.jsp?bookName=Some+Book">Some book</a></td>
                        <td>20-12-2017</td>
                        <td>30-12-2017</td>
                    </tr>
                </table>
                <p class="t2">User of the library for ... days</p>
                </div>
            </div>
            <footer>
                <p>by topteam</p>
            </footer>
        

        <script src="../js/scroll.js"></script>
        <script src="../js/searchTable.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    </body>
</html>