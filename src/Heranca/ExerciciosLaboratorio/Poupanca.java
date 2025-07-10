package Heranca.ExerciciosLaboratorio;

public class Poupanca extends Conta{
    private double rendimento;//percentual

    public Poupanca() {
        
    }

    public Poupanca(int numero, double saldo, double rendimento) {
        super(numero, saldo);
        this.rendimento = rendimento;
    }
    
    public void imprimeRendimento(){
        double rendimentos=this.saldo*(this.rendimento/100);
        double saldo=this.saldo+rendimentos;
        System.out.println("Saldo com rendimento: "+ saldo);
    }

    @Override
    public void imprimeSaldo() {
      super.imprimeSaldo();
      imprimeRendimento();
      
    }
  
}

