package IntroducaoPoo.aula04;

public class Conta {
    private int numero;
    private Cliente cliente;
    private double saldo;
    private TipoConta tipoConta;

    public Conta(int numero, Cliente cliente, TipoConta tipoConta) {
        this.numero = numero;
        this.cliente = cliente;
        this.tipoConta = tipoConta;
    }

    public Conta(String nome, String CPF, int numero, TipoConta tipoConta) {
        this.cliente = new Cliente (nome, CPF);
        this.numero = numero;     
        this.saldo = 0;
        this.tipoConta = tipoConta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }
    
    
    
}
