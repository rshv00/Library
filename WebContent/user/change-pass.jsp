<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Change password</title>
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
            <%@include file="../css/form.css"%>
            <%@include file="../css/search.css"%>
        </style>
        <link rel="stylesheet" href="../css/reset.css">
        <link rel="stylesheet" href="../css/text.css">
        <link rel="stylesheet" href="../css/960_24_col.css">
        <link rel="stylesheet" href="../css/header-footer.css">
        <link rel="stylesheet" href="../css/table.css">
        <link rel="stylesheet" href="../css/search.css">
        <link rel="stylesheet" href="../css/form.css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat:300,400" rel="stylesheet">
    </head>
    <body>
        <div class="container_24">
            <header class="header" id="myHeader">
                <h1 class="grid_7" id="logo"><a href="<c:url value="/main"/>">library</a></h1>
                <nav class="grid_17">
                    <ul>
                        <li><a href="me.jsp">Me</a></li>
                        <li><a href="history.jsp">History</a></li>
                        <li><a href="trends.jsp">Trends</a></li>
                        <li><a href="../WEB-INF/login.jsp">Logout</a></li>
                    </ul>
                </nav>
            </header>
            <div class="main">
                <p class="title">Change password</p> 
                <form action="" method="">
                    <fieldset>
                        <div class="group">
                            <label for="name">New password</label>
                            <input type="password" id="name">
                        </div>
                
                        <div class="buttons">
                            <button type="submit" class="button" title="Apply new data">Apply</button>

                        </div>
                    </fieldset>
                </form>  
            </div>
        </div>
        <footer>
            <p>2018</p>
        </footer>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="../js/scroll.js"></script>
        <script src="../js/showTable.js"></script>
        <script src="../js/searchTable.js"></script>
    </body>
</html>