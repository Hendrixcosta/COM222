<%-- 
    Document   : exibirSaldo
    Created on : 10/09/2015, 03:10:27
    Author     : Hendrix
--%>

<%@ include file="../template/header.jsp"%>

<h1>Olá, sr. ${objCliente.getNome()},
<br>Lamentamos em informar que seu saldo de R$${objCliente.getSaldo()} 
<br>é insuficiente para o saque de R$${valor}.</h1>

<%@ include file="../template/footer.jsp"%>
