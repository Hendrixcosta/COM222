<%-- 
    Document   : exibirSaldo
    Created on : 10/09/2015, 03:10:27
    Author     : Hendrix
--%>

<%@ include file="../template/header.jsp"%>

<h1>Olá, sr. ${objCliente.getNome()},
<br>Seu saldo é: R$${objCliente.getSaldo()} </h1>


<%@ include file="../template/footer.jsp"%>
