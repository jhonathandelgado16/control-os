<%--
  Created by IntelliJ IDEA.
  User: Eze
  Date: 06/04/2023
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Erro</title>
</head>
<body>
  <img src="assets/resources/images/erro.png" alt="" width="600">
</body>
</html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:template title="Erro">
    <jsp:body>
        <div class="page-error row justify-content-center">
            <img src="assets/resources/images/erro.png" alt="" width="600">
        </div>
    </jsp:body>
</t:template>

