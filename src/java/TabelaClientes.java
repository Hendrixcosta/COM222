
import java.util.*;

public class TabelaClientes {

    // Monta uma pequena tabela de clientes
    private static Map<String, Cliente> clientes;
    
    

    static {
        clientes = new HashMap<String, Cliente>();
        clientes.put("1", new Cliente(01, "Ana Carolina", (float)(100.00)));
        clientes.put("2", new Cliente(02, "Barbara Silva", (float)50.50));
        clientes.put("3", new Cliente(03, "Camila Lelis", (float)1.00));
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
        float floatSaldo =  Float.parseFloat(saldo);
        clientes.put(nroConta, new Cliente(Integer.parseInt(nroConta), nome, floatSaldo));
        return (clientes.get(nroConta));        
    }

    public static boolean saque(String nroConta, float valor){
        float valorcliente = clientes.get(nroConta).getSaldo();
        float saldoAtual = valorcliente - valor;
        clientes.get(nroConta).setSaldo(saldoAtual);
        return true;
    }
    
    public static boolean deposito(String nroConta, float valor){
        float valorcliente = clientes.get(nroConta).getSaldo();
        float saldoAtual = valorcliente + valor;
        clientes.get(nroConta).setSaldo(saldoAtual);
        return true;
    }
    
    
    public static String listarClientes (){
        String ListaClientes="";
        for (String cod : clientes.keySet()){
            Cliente c =  clientes.get(cod);
            ListaClientes = ListaClientes + "Nome: " + c.getNome() + " | "
                                          + "Conta: " + c.getNroConta() + " | "
                                          + "Saldo: "+ c.getSaldo() + "\n";
        }
        return ListaClientes;
    }

    TabelaClientes() {
    } // Classe não instanciável
}
