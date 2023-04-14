<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:template title="Tela Inicial">
  <jsp:body>
    <div class="card-title row justify-content-end">
      <h1 class="col-12 text-center">
        Controle de Ordens de Serviço
      </h1>
    <c:if test="${alert}">
      <div class="col-12 alert alert-success text-center">Ordem de Serviço: #${os.id_service_order} Inserida com Sucesso</div>
    </c:if>

    <div class="row justify-content-center">
      <a class="col-6 btn btn-secondary" href="adicionar-os">Adicionar Ordem de Serviço</a>
    </div>

    <c:if test="${not empty oss}">
      <c:forEach var="os" items="${oss}">

        <div class="row justify-content-center">
          <div class="col-6 card-os row">
            <form action="" class="row justify-content-center card-list">
              <h2 class="col-6 text-left">#${os.id_service_order}</h2>
              <h2 class="col-6">
                <input type="date" value="${os.date_service}" class="form-control text-center" readonly>
              </h2>
              <h2 class="col-12 text-left">Cliente: ${os.id_client}</h2>
              <h2 class="col-12 text-left">Serviço Prestado: ${os.service}</h2>
              <h2 class="col-12 text-left">${os.description}</h2>
            </form>
          </div>
        </div>
      </c:forEach>
    </c:if>
  </jsp:body>
</t:template>