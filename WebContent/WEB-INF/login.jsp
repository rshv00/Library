<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <title>Sign in</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        <%@include file='../vendor/bootstrap/css/bootstrap.min.css' %>
        <%@include file='../vendor/animate/animate.css' %>
        <%@include file='../vendor/css-hamburgers/hamburgers.min.css' %>
        <%@include file='../vendor/animsition/css/animsition.min.css' %>
        <%@include file='../vendor/select2/select2.min.css'%>
        <%@include file='../vendor/daterangepicker/daterangepicker.css'%>
        <%@include file='../css/entry_util.css'%>
        <%@include file='../css/entry_main.css'%>
        <%@include file='../img/icons/favicon.ico' %>
    </style>
    <!--===============================================================================================-->
    <link rel="icon" type="image/png" href="../img/icons/favicon.ico"/>
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="../vendor/bootstrap/css/bootstrap.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="../vendor/animate/animate.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="../vendor/css-hamburgers/hamburgers.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="../vendor/animsition/css/animsition.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="../vendor/select2/select2.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="../vendor/daterangepicker/daterangepicker.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="../css/entry_util.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="../css/entry_main.css">
    <!--===============================================================================================-->
    <link href="https://fonts.googleapis.com/css?family=Montserrat:300,400" rel="stylesheet">
</head>
<body>
<div class="limiter">
    <div class="container-login100">
        <div class="wrap-login100">
            <div class="login100-form-title">
                        <span class="login100-form-title-1">
                            Sign In
                        </span>
            </div>
            <form:form class="login100-form validate-form"
                       action="${pageContext.request.contextPath}/authenticateTheUser" method="POST">
                <%--<c:if test="${param.error !=null}">--%>
                <%--</c:if>--%>
                <%--<c:if test="${param.logout !=null}">--%>
                <%--<i>You have been logged out</i>--%>
                <%--</c:if>--%>
                <div class="wrap-input100 validate-input m-b-26" data-validate="Username is required">
                    <span class="label-input100"><b>Username</b></span>
                    <input class="input100" type="text" id="username" name="username" placeholder="Enter username">
                    <span class="focus-input100"></span>
                </div>

                <div class="wrap-input100 validate-input m-b-18" data-validate="Password is required">
                    <span class="label-input100"><b>Password</b></span>
                    <input class="input100" type="password" id="password" name="password" placeholder="Enter password">
                    <span class="focus-input100"></span>
                </div>

                <div class="flex-sb-m w-full p-b-30">
                    <div class="contact100-form-checkbox">
                        <input class="input-checkbox100" id="ckb1" type="checkbox" name="remember-me">
                        <label class="label-checkbox100" for="ckb1">
                            <b>Remember me</b>
                        </label>
                    </div>

                    <div>
                        <a href="../entry/register.jsp" class="txt1">
                            <b>New user?</b>
                        </a>
                    </div>
                </div>

                <div class="container-login100-form-btn">
                    <button class="login100-form-btn">
                        <input type="submit" value="Login" class="login100-form-btn"/>
                    </button>

                </div>
            </form:form>
        </div>
    </div>
</div>

<!--===============================================================================================-->
<script src="../vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
<script src="../vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
<script src="../vendor/bootstrap/js/popper.js"></script>
<script src="../vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
<script src="../vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
<script src="../vendor/daterangepicker/moment.min.js"></script>
<script src="../vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
<script src="../vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
<script src="../js/entry.js"></script>
<script src="../main.jsp"></script>
</body>
</html>
