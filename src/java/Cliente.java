/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hendrix
 */
public class Cliente {
    
    private int NroConta;
    private String Nome;
    private float Saldo;

    public Cliente(int NroConta, String Nome, float Saldo) {
        this.NroConta = NroConta;
        this.Nome = Nome;
        this.Saldo = Saldo;
    }
    
    public int getNroConta() {
        return NroConta;
    }

    public void setNroConta(int NroConta) {
        this.NroConta = NroConta;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float Saldo) {
        this.Saldo = Saldo;
    }
    
    
    
    
}
