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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet test</title>");            
//            out.println("</head>");
//            out.println("<body>");
            
            //parametros do POST
            //out.println("<h1> Nome: " + request.getParameter("nome")+ "</h1>");
            //out.println("<h1> Saldo: " + request.getParameter("saldo")+ "</h1>");
            
            
            
            
            //adicionando cliente à tabela 
            
            //out.println("<h1> Nome do cliente Adicionado: " +clienteAdd.getNome()+ "</h1>");
            
            //recuperando cliente adicionado 
            
            String nroConta = request.getParameter("nroConta");
            String address="";
            
            Cliente cliente = TabelaClientes.getCliente(nroConta);

            out.println("CLiente == " + cliente.toString());
//            Cliente clienteAdd=null;
//            //out.println("Nome CLiente criado ==" + cliente.getNome());
//            if (cliente.getNome() == null) {
//                address = "/resultado/criaClienteExito.jsp";  
//                //out.println("Cliente == NULL");
//                clienteAdd = TabelaClientes.addCliente(request.getParameter("nroConta"),request.getParameter("nome"), request.getParameter("saldo"));
//            }else  {
//                out.println("Nome CLiente criado ==" + cliente.getNome());
//                address = "/resultado/criarClienteErro.jsp";    
//            }
            
            //out.println("Nome: " + clienteAdd.getNome());
                        
            
           RequestDispatcher dispatcher = request.getRequestDispatcher(address);
           dispatcher.forward(request, response);
                
//            out.println("<h1> Nome do ultimo cliente: " +  TabelaClientes.getCliente(Integer.toString(TabelaClientes.cont)).getNome()+ "</h1>");
//            out.println("<h1> Saldo do ultimo cliente: " +  TabelaClientes.getCliente(Integer.toString(TabelaClientes.cont)).getSaldo() + "</h1>");
//                
//            out.println("</body>");
//            out.println("</html>");
        }
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
