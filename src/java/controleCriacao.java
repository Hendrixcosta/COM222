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
            //imprimir todos os clientes do hashmap
            
            out.println(TabelaClientes.listarClientes());
        }
    }
}
