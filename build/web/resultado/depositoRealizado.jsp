<%-- 
    Document   : exibirSaldo
    Created on : 10/09/2015, 03:10:27
    Author     : Hendrix
--%>

<%@ include file="../template/header.jsp"%>

<h1>Ol�, sr. ${objCliente.getNome()}!</h1>
    
<h2> O Senhor realizou um dep�sito de R$${valor}
<br> Saldo Atual: R$${objCliente.getSaldo()} </h2> 


<%@ include file="../template/footer.jsp"%>
