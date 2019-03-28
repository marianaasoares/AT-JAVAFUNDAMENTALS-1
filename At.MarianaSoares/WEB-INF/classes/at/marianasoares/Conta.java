package at.marianasoares;

public class Conta {

	    private int numeroConta;
	    private String nomeCliente;
	    private double saldoConta;
	    protected static int cont = 0;

	    public Conta(String nome, int conta, double saldo) {
	        numeroConta = conta;
	        nomeCliente = nome;
	        saldoConta = saldo;
	        cont++;
	    }
	    
	    public void setConta(int conta) {
	        numeroConta = conta;
	    }
	    
	    public int getConta() {
	        return numeroConta;
	    }
	    
	    public void setNome(String nome) {
	        nomeCliente = nome;
	    }
	    
	    public String getNome() {
	        return nomeCliente;
	    }
	    
	    public void setSaldo(double saldo) {
	        saldoConta = saldo;
	    }
	    
	    public double getSaldo() {
	        return saldoConta;
	    }
	    
	    public String toString() {
	        return numeroConta + " " + nomeCliente + " " + saldoConta;
	    }
	}

