<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Add book</title>
        <script type="text/javascript">
            <%@include file="../js/scroll.js"%>
            <%@include file="../js/searchTable.js"%>
            <%@include file="../js/showTable.js"%>
        </script>
        <style type="text/css">
            <%@include file="../css/reset.css"%>
            <%@include file="../css/text.css"%>
            <%@include file="../css/960_24_col.css"%>
            <%@include file="../css/header-footer.css"%>
            <%@include file="../css/form.css"%>
        </style>

        <link href="https://fonts.googleapis.com/css?family=Montserrat:300,400" rel="stylesheet">

        <script type="text/javascript" src="<c:url value="../js/scroll.js"/>"></script>

    </head>
    <body>
        <div class="container_24">
            <header class="header" id="myHeader">
                <h1 class="grid_7" id="logo"><a href="<c:url value="/main"/>">l-admin</a></h1>
                <nav class="grid_17">
                    <ul>
                        <li><a href="/records">Records</a></li>
                        <li><a href="/admin/add-book">Add book</a></li>
                        <li><a href="/users-list">Users</a></li>
                        <li><a href="/logout">Logout</a></li>
                    </ul>
                </nav>
            </header>
            <div class="main">
                <p class="title">Add new instance</p>
                <form action="add" method="get">
                    <fieldset>
                        <div class="group">
                            <label for="name">Book name</label>
                            <input type="text" id="name" name="name">
                        </div>
                        <div class="group">
                            <label for="author">Author</label>
                            <input type="text" id="author" name="author">
                        </div>
                        <div class="group">
                            <label for="coauthor">Coauthor</label>
                            <input type="text" id="coauthor" name="coauthor">
                        </div>
                        <div class="group">
                            <label for="edition_year">Edition year</label>
                            <input type="number"id="edition_year" name="editionYear">
                        </div>
                        <div class="buttons">
                            <button type="submit" class="button" title="Send data">Add book</button>
                        </div>
                    </fieldset>
                </form>
            </div>
        </div>
        <footer>
            <p>2018</p>
        </footer>
        <script src="../js/scroll.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    </body>
</html>