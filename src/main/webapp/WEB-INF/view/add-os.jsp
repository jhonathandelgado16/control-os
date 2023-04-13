<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:template title="Adicionar OS">
    <jsp:body>
        <h1>Adicionar ordens de serviço</h1>

        <form action="" class="justify-content-center row" method="post">
            <div class="col-8 row justify-content-center card-os">
                <div class="col-4">
                    <strong>OS Nº</strong>
                    <input type="number" readonly name="id" class="form-control col-2">
                </div>
                <div class="col-4">
                    <strong>Data do Serviço</strong>
                    <input type="date" name="date_service" class="form-control">
                </div>
                <div class="col-4">
                    <strong>Dias de Garantia</strong>
                    <input type="text" name="days_guarantee" class="form-control">
                </div>

                <div class="col-6">
                    <strong>Serviço Prestado</strong>
                    <input type="text" name="service" class="form-control">
                </div>
                <div class="col-6">
                    <strong>Cliente</strong>
                    <select name="id_client" id="" class="form-select">
                        <option value="">Selecione o Cliente</option>
                    </select>
                </div>
                <div class="col-12">
                    <strong>Descrição</strong>
                    <textarea name="description" id="" rows="3" class="form-control"></textarea>
                </div>

                <div class="col-6">
                    <button type="button" class="btn btn-secondary col-10">CADASTRAR</button>
                </div>
            </div>
        </form>
    </jsp:body>
</t:template>
