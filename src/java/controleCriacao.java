/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class controleCriacao extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String nroConta = request.getParameter("nroConta");
            String address="";
            
            Cliente cliente = TabelaClientes.getCliente(nroConta);

            
            if (cliente == null) {
                address = "/resultado/criarClienteExito.jsp";  
                Cliente clienteAdd = TabelaClientes.addCliente(request.getParameter("nroConta"),request.getParameter("nome"), request.getParameter("saldo"));
                request.setAttribute("objCliente", clienteAdd);
            }else {
                address = "/resultado/criarClienteErro.jsp";    
                request.setAttribute("objCliente", cliente);                
            }
            
            RequestDispatcher dispatcher = request.getRequestDispatcher(address);
            dispatcher.forward(request, response);

       
    }
    
    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException{
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet test</title>");            
            out.println("</head>");
            out.println("<body>");

            //out.println("<h1> Saldo do cliente13: " +  TabelaClientes.getCliente("01").getSaldo() + "</h1>");

            out.println("cont == " + TabelaClientes.totalClientes() + "<br>");
           
            for (int i=1; i <= TabelaClientes.totalClientes(); i++){
                
                
                out.println("Nome: " + TabelaClientes.getCliente(Integer.toString(i)).getNome() + " | "
                        
                        
                          + "Conta: " + TabelaClientes.getCliente(Integer.toString(i)).getNroConta()+ " | "
                          + "Saldo: "+ TabelaClientes.getCliente(Integer.toString(i)).getSaldo() + "<br>");
            }
            
            out.println("</body>");
            out.println("</html>");
        }
        
    }
        
    



}
