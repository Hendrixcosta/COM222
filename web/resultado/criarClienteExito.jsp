<%-- 
    Document   : criarClienteExito
    Created on : 09/09/2015, 20:06:28
    Author     : Hendrix
--%>

 <%@ include file="../template/header.jsp"%>
        <h1> Seja bem vindo, Sr. ${objCliente.getNome()} ! </h1> <br>
        <h2> O n�mero da sua conta �: ${objCliente.getNroConta()} <br>
        <h2> E o seu saldo inicial �: R$ ${objCliente.getSaldo()} <br>
            
<%@ include file="../template/footer.jsp"%>