<%-- 
    Document   : CriacaoForm
    Created on : 08/09/2015, 22:25:16
    Author     : Hendrix
--%>

<%@ include file="../template/header.jsp"%>

        <h1>Realize um saque:</h1>
        
        <form action="./controleSaque" method=post>
            
                <table cellpadding=4 cellspacing=2 border=0>
                    
                    
                    <tr>
                            <td  valign=top>
                            <b>Numero da conta:</b>
                            <br>
                            <input type="text" name="nroConta" size=15></td>
                    </tr>
                    <tr>
                            <td  valign=top>
                            <b>Valor:</b>
                            <br>
                            <input type="number" name="valor" ></td>
                    </tr>
                    
                    
                    <tr>
                        <td  valign=top>
                        <input type="submit" value="Sacar">
                        </td>
                    </tr>
                    
                </table>
            
        </form>
        
        
  <%@ include file="../template/footer.jsp"%>
