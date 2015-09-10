<%-- 
    Document   : exibirSaldo
    Created on : 10/09/2015, 03:10:27
    Author     : Hendrix
--%>

<%@ include file="../template/header.jsp"%>

<h1>Olá, sr. ${objClienteO.getNome()}!</h1>
    
<h2> O Senhor transferiu da sua conta um valor de R$${valor}
<br> e depositou na conta de ${objClienteD.getNome()}.

<br><br>Saldo Atual: R$${objClienteO.getSaldo()} </h2> 


<%@ include file="../template/footer.jsp"%>
