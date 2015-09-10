<%-- 
    Document   : CriacaoForm
    Created on : 08/09/2015, 22:25:16
    Author     : Hendrix
--%>

 <%@ include file="../template/header.jsp"%>
        <h1>Realize uma transferência:</h1>
            <form action="./controleTransferencia" method=post>
            
                <table cellpadding=4 cellspacing=2 border=0>                    
                    <tr>
                            <td  valign=top>
                            <b>Numero da conta de Origem:</b>
                            <br>
                            <input type="text" name="nroContaorigem" size=15></td>
                    </tr>            
                    <tr>
                            <td  valign=top>
                            <b>Numero da conta de Destino:</b>
                            <br>
                            <input type="text" name="nroContadestino" size=15></td>
                    </tr>            
                    <tr>
                            <td  valign=top>
                            <b>Valor a ser transferido:</b>
                            <br>
                            <input type="number" name="valor" ></td>
                    </tr>
                    <tr>
                        <td  valign=top>
                        <input type="submit" value="Transferir">
                        </td>
                    </tr>            
                </table>    
        </form>
     <%@ include file="../template/footer.jsp"%>