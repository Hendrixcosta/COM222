<%-- 
    Document   : criarClienteExito
    Created on : 09/09/2015, 20:06:28
    Author     : Hendrix
--%>

 <%@ include file="../template/header.jsp"%>
        <h1> Erro ao criar conta. </h1> <br>
        
        <h2> O Sr. ${objCliente.getNome()}, ja possui uma conta cadastrada conosco, <br>
        com  o número: ${objCliente.getNroConta()} <br>
        <h2> E o seu saldo é de : R$ ${objCliente.getSaldo()} <br>
            
<%@ include file="../template/footer.jsp"%>