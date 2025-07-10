package Heranca.ExerciciosLaboratorio;

public class Conta {
   protected int numero;
   protected double saldo;

   public Conta() {

   }

   public Conta(int numero, double saldo) {
      this.saldo = saldo;
      this.numero = numero;
   }

   public void deposito(double valor) {
      if (valor > 0) {
         saldo = saldo + valor;
         System.out.println("Novo saldo: " + saldo);
      } else
         System.out.println("Valor inválido");
   }

   public void saque(double valor) {
      if (saldo - valor >= 0) {
         saldo = saldo - valor;
         System.out.println("Novo saldo: " + saldo);
      } else
         System.out.println("Saldo insuficiente");
   }

   public void imprimeSaldo() {
      System.out.println("Saldo: " + saldo);
   }

   public double getSaldo() {
      return saldo;
   }

   public void setSaldo(double saldo) {
      this.saldo = saldo;
   }

   public int getNumero() {
      return numero;
   }

   public void setNumero(int numero) {
      this.numero = numero;
   }

}
