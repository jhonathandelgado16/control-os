<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:template title="Adicionar OS">
    <jsp:body>
        <h1 class="text-center">Adicionar ordens de serviço</h1>

        <form action="adicionar-os" class="justify-content-center row" method="post">
            <div class="col-8 row justify-content-center card-os">

                <div class="col-4">
                    <strong>Data do Serviço</strong>
                    <input type="date" name="date_service" class="form-control" REQUIRED>
                </div>
                <div class="col-4">
                    <strong>Dias de Garantia</strong>
                    <input type="text" id="input-guarantee" name="days_guarantee" class="form-control" REQUIRED>
                </div>

                <div class="col-6">
                    <strong>Serviço Prestado</strong>
                    <input type="text" name="service" class="form-control" REQUIRED>
                </div>
                <div class="col-6">
                    <strong>Cliente</strong>
                    <select name="id_client" id="select-client" class="form-select" REQUIRED>

                        <option value="">Selecione o Cliente</option>
                        <c:if test="${not empty clients}">
                        <c:forEach var="client" items="${clients}">
                            <option value="${client.id_client}">${client.name}</option>
                        </c:forEach>
                        </c:if>
                    </select>
                </div>
                <div class="col-12">
                    <strong>Descrição</strong>
                    <textarea name="description" id="" rows="3" class="form-control"></textarea>
                </div>

                <div class="col-6">
                    <button type="submit" class="btn btn-secondary col-10">CADASTRAR</button>
                </div>
            </div>
        </form>

        <script>
        window.onload =  function (){
            $('#input-guarantee').mask('000');

            $('#select-client').change(function (){
                localStorage['last-client'] = $(this).find(':selected').text();
            });
        }
        </script>

    </jsp:body>
</t:template>
