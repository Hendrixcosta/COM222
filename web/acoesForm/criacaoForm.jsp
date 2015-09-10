<%-- 
    Document   : CriacaoForm
    Created on : 08/09/2015, 22:25:16
    Author     : Hendrix
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Criacao de conta</title>
         <LINK REL=STYLESHEET
              HREF="./bank-support/JSP-Styles.css"
              TYPE="text/css">
    </head>
    <body>
        <h1>Seja bem vindo!</h1>
        
        
        
        
        
        <form action="./controleCriacao" method=post>
            
                <table cellpadding=4 cellspacing=2 border=0>
                    <tr>
                        <td valign=top> 
                            <b>Nome:</b> 
                            <br>
                            <input type="text" name="nome" size=15></td>
                    </tr>
                    
                    <tr>
                            <td  valign=top>
                            <b>Saldo Inicial:</b>
                            <br>
                            <input type="text" name="saldo" size=15></td>
                    </tr>
                    
                     <tr>
                            <td  valign=top>
                            <b>Numero da conta:</b>
                            <br>
                            <input type="text" name="nroConta" size=5></td>
                    </tr>
                    
                    
                    <tr>
                        <td  valign=top>
                        <input type="submit" value="Criar Conta">
                        </td>
                    </tr>
                    
                </table>
            
        </form>
        
        
    </body>
</html>
