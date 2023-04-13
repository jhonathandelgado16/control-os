<%--
    Document   : template
    Created on : Apr 5, 2017, 3:02:46 PM
    Author     : Roni
--%>

<%@tag description="Template principal" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="title"%>


<html>
<head>
    <title>${title}</title>
    <base href="${pageContext.request.contextPath}/">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="icon" type="image/png" href="favicon.png" />

    <!-- CSS -->

    <link rel="stylesheet" href="assets/libraries/bootstrap/css/bootstrap.css"></link>
    <link rel="stylesheet" href="assets/libraries/bootstrap/js/bootstrap.js"></link>
    <link rel="stylesheet" href="assets/resources/styles/main.css"></link>
    <link rel="stylesheet" href="assets/resources/styles/template.css"></link>
    <script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>

</head>
<body>
<header>
        <nav>
            <div class="navbar justify-content-center">
                <div class="col-10 row justify-content-center">
                    <a class="col-3" href="">
                        <img class="navbar-logo" src="assets/resources/images/logo.png">
                    </a>
                    <div class="col-9">
                        <div class="row justify-content-end">
                            <div class="col-2">
                                <a class="nav-link" href="">Home</a>
                            </div>
                            <div class="col-2">
                                <a class="nav-link" href="">Clientes</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </nav>
</header>
<main id="content" class="container">
    <jsp:doBody></jsp:doBody>
</main>
<!-- rodape-->
<footer class="footer">
    <div class="col-12 row justify-content-center">
        <div class="row col-10 justify-content-center">
                <a class="text-center" href="https://github.com/jhonathandelgado16" target="_blank">
                    <img
                            src="assets/resources/images/jd-logo.png"
                            class="img-responsive" height="50px" />
                </a>
        </div>
    </div>
    <div class="footer-copyright">
        <div class="container text-center">
            &#169; Copyright <span id="year"></span> - Todos os direitos
            reservados
        </div>
    </div>
</footer>
<script src="https://code.jquery.com/jquery-2.2.4.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.8/js/materialize.min.js"></script>
<script src="assets/resources/scripts/index.js"></script>
</body>
</html>