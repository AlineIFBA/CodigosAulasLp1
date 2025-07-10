package Heranca.ExerciciosLaboratorio;

public class ContaEspecial extends Conta {
   private double limite;

   public ContaEspecial() {
      //super();
      //this.limite=0;
   }
   
   public ContaEspecial(double limite) {
      //super();
      this.limite = limite;
   }

   public ContaEspecial(int numero, double saldo, double limite) {
      super(numero, saldo);//tem ser a primeira instrução do construtor
      this.limite = limite;
      
   }

 
   public void imprimeSaldo() {
      //super.imprimeSaldo();
      //System.out.println("Limite:  " + limite + "\nSaldo total: " + (saldo + limite));
      System.out.println("Saldo: " + saldo + "\nLimite:  " + limite + "\nSaldo total: " + (saldo + limite));
   }

   public void imprimeSaldo(boolean imprimir) {
      imprimeSaldo();
      if (imprimir==true)
         imprimirPapel();
   }

    public void imprimirPapel() {
      System.out.println("Enviado pra impressora");
         
   }

   public void saque(double valor) {
      if ((saldo + limite) - valor >= 0) {
         saldo = saldo - valor;
         System.out.println("Novo saldo: " + saldo);
      } else
         System.out.println("Saldo insuficiente");

   }

   public double getLimite() {
      return limite;
   }

   public void setLimite(double limite) {
      this.limite = limite;
   }

}
