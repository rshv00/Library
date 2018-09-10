<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
    <head>
        <title>Registration</title>
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
                            Registration
                        </span>
                    </div>


                    <form class="login100-form validate-form" action="/register">
                        <div class="wrap-input100 validate-input m-b-26" data-validate="First and Last names are required">
                            <span class="label-input100"><b>Name</b></span>
                            <input class="input100" type="text" name="userName" placeholder="First and Last name">
                            <span class="focus-input100"></span>
                        </div>


                        <div class="wrap-input100 validate-input m-b-26" data-validate="Username is required">
                            <span class="label-input100"><b>Username</b></span>
                            <input class="input100" type="text" name="userLogin" placeholder="Enter username">
                            <span class="focus-input100"></span>
                        </div>


                        <div class="wrap-input100 validate-input m-b-18" data-validate = "Password is required">
                            <span class="label-input100"><b>Password</b></span>
                            <input class="input100" type="password" name="userPassword" placeholder="Enter password">
                            <span class="focus-input100"></span>
                        </div>

                        <%--<div class="wrap-input100 validate-input m-b-18" data-validate = "Confirm is required">--%>
                            <%--<span class="label-input100"></span>--%>
                            <%--<input class="input100" type="password" placeholder="Confirm password">--%>
                            <%--<span class="focus-input100"></span>--%>
                        <%--</div>--%>

                        <div class="wrap-input100 validate-input m-b-18" data-validate = "Phone is required">
                            <span class="label-input100"><b>Phone</b></span>
                            <input class="input100" type="number" name="userPhone" placeholder="Enter phone">
                            <span class="focus-input100"></span>
                        </div>

                        <div class="wrap-input100 validate-input m-b-18" data-validate = "Birth date is required">
                            <span class="label-input100"><b>Birth date</b></span>
                            <input class="input100" type="date" name="birthDate">
                            <span class="focus-input100"></span>
                        </div>

                        <div class="flex-sb-m w-full p-b-30">
                            <div class="contact100-form-checkbox">
                            </div>

                            <div>
                                <a href="login" class="txt1">
                                    <b>Already have an account?</b>
                                </a>
                            </div>
                        </div>

                        <div class="container-login100-form-btn">
                            <button class="login100-form-btn">
                                Register
                            </button>
                        </div>

                    </form>
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

    </body>
</html>
