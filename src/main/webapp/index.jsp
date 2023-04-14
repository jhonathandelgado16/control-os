<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:template title="Tela Inicial">
    <jsp:body>
        <div class="card-title row justify-content-end">
            <h1 class="col-10">
                Controle de Ordens de Serviço
            </h1>

            <div class="col-1 text-center row justify-content-end">
                <div class="col-12">
                    <h3 class="text-center">${counterOS}</h3>
                    <h4 class="text-center">OS REALIZADAS</h4>
                </div>
            </div>
            <c:if test="${not empty counterOsSession}">
            <div class="col-1 text-center row justify-content-end">
                <div class="col-12">

                    <h3 class="text-center">${counterOsSession}</h3>
                    <h4 class="text-center">OS da Sessão</h4>

                </div>
            </div>
            </c:if>
        </div>

        <div class="row justify-content-center">
            <a class="col-6 btn btn-secondary" href="adicionar-os">Adicionar Ordem de Serviço</a>
        </div>

    </jsp:body>
</t:template>