
import java.util.*;

public class TabelaClientes {

    // Monta uma pequena tabela de clientes
    private static Map<String, Cliente> clientes;
    
    

    static {
        clientes = new HashMap<String, Cliente>();
        clientes.put("1", new Cliente(01, "Cliente01", "1000"));
        clientes.put("2", new Cliente(02, "Cliente02", "2000"));
        clientes.put("3", new Cliente(03, "Cliente03", "3000"));
    }

    public static Map<String, Cliente> getSampleCustomers() {
        return (clientes);
    }

    /**
     * Finds the customer with the given ID. Returns null if there is no match.
     */
    public static Cliente getCliente(String id) {
        return (clientes.get(id));
    }
    
    public static Cliente addCliente(String nroConta, String nome, String saldo) {
        clientes.put(nroConta, new Cliente(Integer.parseInt(nroConta), nome, saldo));
        return (clientes.get(nroConta));        
    }

    public static boolean saque(String nroConta, int valor){
        String valorcliente = clientes.get(nroConta).getSaldo();
        int saldoAtual = Integer.parseInt(valorcliente) - valor;
        clientes.get(nroConta).setSaldo(Integer.toString(saldoAtual));
        return true;
    }
    
    public static boolean deposito(String nroConta, int valor){
        String valorcliente = clientes.get(nroConta).getSaldo();
        int saldoAtual = Integer.parseInt(valorcliente) + valor;
        clientes.get(nroConta).setSaldo(Integer.toString(saldoAtual));
        return true;
    }
    
    
    public static int totalClientes (){
        return clientes.size();
    }

    TabelaClientes() {
    } // Classe não instanciável
}
