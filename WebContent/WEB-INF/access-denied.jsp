<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Access denied</title>
    <style>
        <%@include file="/css/reset.css"%>
        <%@include file="/css/text.css"%>
        <%@include file="/css/960_24_col.css"%>
        <%@include file="/css/header-footer.css"%>
        <%@include file="/css/landing.css"%>
    </style>
    <link rel="stylesheet" href="../css/reset.css">
    <link rel="stylesheet" href="../css/text.css">
    <link rel="stylesheet" href="../css/960_24_col.css">
    <link rel="stylesheet" href="../css/header-footer.css">
    <link rel="stylesheet" href="../css/landing.css">
</head>
<body>
<div class="container_24">
    <header class="header" id="myHeader" >
        <h1 class="grid_7" id="logo"><a href="/">Library</a></h1>

    </header>
    <div class="main">
        <p id="landing">You don`t have access to this page</p>
        <p><img src="https://cdn0.iconfinder.com/data/icons/kameleon-free-pack-rounded/110/Locked-Cloud-512.png" href="${pageContext.request.contextPath}/" /></p>
        <p><a href="${pageContext.request.contextPath}/" style="margin-top: 30px">Go to main page</a></p>

    </div>
    <footer style="margin-top: 300px;">
        <p>2018</p>
    </footer>
</div>

<script src="../js/scroll.js"></script>

</body>
</html>