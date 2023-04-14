<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:template title="Adicionar OS">
    <jsp:body>
        <h1 class="text-center">Clientes</h1>

        <div class="row">
            <form action="clientes" class="col-4 justify-content-center row" method="post">
                <div class=" row justify-content-center card-os">
                    <h2>Cadastrar novo cliente</h2>
                    <div class="col-10">
                        <strong>Nome Completo</strong>
                        <input type="text" placeholder="Ex: Christopher Julius Rock III" name="name" class="form-control" required>
                    </div>
                    <div class="col-10">
                        <strong>Contato</strong>
                        <input id="contact" type="text" placeholder="Ex: 4002-8922" name="contact" class="form-control" required>
                    </div>

                    <div class="col-6">
                        <button type="submit" class="btn btn-secondary col-10">CADASTRAR</button>
                    </div>
                </div>
            </form>

            <div class="offset-1 col-7">
                <table class="table text-center">
                    <thead>
                    <th> Nome </th>
                    <th> Contato </th>
                    </thead>
                    <tbody>
                    <c:if test="${not empty clients}">
                        <c:forEach var="client" items="${clients}">
                            <tr>
                                <td>${client.name}</td>
                                <td>${client.contact}</td>
                            </tr>
                        </c:forEach>
                    </c:if>
                    </tbody>
                </table>
            </div>
            </div>

        <script>
            window.onload =  function (){
                $('#contact').mask('(00) 0000-0000');
            }
        </script>

    </jsp:body>
</t:template>
