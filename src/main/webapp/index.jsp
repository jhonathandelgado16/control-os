<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:template title="Tela Inicial">
    <jsp:body>
        <h1>
            Controle de Ordens de Serviço
        </h1>

        <div class="row">
            <a href="adicionar-os">Adicionar Ordem de Serviço</a>
            <a href="clientes">Clientes</a>
        </div>
    </jsp:body>
</t:template>