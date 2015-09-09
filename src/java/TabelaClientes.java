
import java.util.*;

public class TabelaClientes {

    // Monta uma pequena tabela de clientes
    private static Map<String, Cliente> clientes;

    static {
        clientes = new HashMap<String, Cliente>();
        clientes.put("01", new Cliente(01, "Cliente01", "12,21"));
        clientes.put("02", new Cliente(02, "Cliente02", "12,21"));
        clientes.put("03", new Cliente(03, "Cliente03", "12,21"));
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
    
    public static Cliente addCliente(int nroConta, String nome, String saldo) {
        clientes.put(String.valueOf(nroConta), new Cliente(nroConta, nome, saldo));
        return (clientes.get(nroConta));
    }


    TabelaClientes() {
    } // Classe não instanciável
}
