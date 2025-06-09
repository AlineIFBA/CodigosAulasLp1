package IntroducaoPoo.ExerciciosLaboratorio;

//Questão 3.a)
public class Conta {
   private int numeroConta;
   private String nomeCliente;
   private double saldo;

   // Questão 2.a)
   public Conta(int numeroConta, String nomeCliente, double saldo) {
      this.numeroConta = numeroConta;
      this.nomeCliente = nomeCliente;
      this.saldo = saldo;
   }

   public Conta(int numeroConta, String nomeCliente) {
      this.numeroConta = numeroConta;
      this.nomeCliente = nomeCliente;
      this.saldo = 0;
   }

   // Questão 2.b)
   public void imprimir() {
      System.out
            .println("Conta [numero=" + numeroConta + ", Nome do cliente=" + nomeCliente + ", Saldo=" + saldo + "]");
   }

   // Questão 2.c)
   public void deposito(double valor) {
      if (valor <= 0)
         System.out.println("Valor inválido");
      else
         saldo += valor;

   }

   // Questão 2.d)
   public void saque(double valor) {
      if (valor <= 0)
         System.out.println("Valor inválido");
      else if (saldo < valor)
         System.out.println("SALDO INSUFICIENTE");
      else {
         saldo -= valor;// ou this.saldo-=valor;
         System.out.println("Novo saldo: " + saldo);
      }

   }

   // Questão 2.e)
   public static void transferencia(Conta origem, Conta destino, double valor) {
      if (origem.saldo >= valor) {
         origem.saldo = origem.saldo - valor;
         destino.saldo = destino.saldo + valor;
      }
      else
         System.out.println("SALDO da conta "+origem.numeroConta+" é INSUFICIENTE");
   }

   // Questão 2.f)
   public void transferencia(Conta destino, double valor) {
      if (this.saldo >= valor) {
         this.saldo -= valor;
         destino.saldo += valor;
      }
      else
         System.out.println("SALDO da conta "+this.numeroConta+" é INSUFICIENTE");

   }

   // Questão 2.g)
   public static Conta maiorSaldo(Conta conta1, Conta conta2) {
      if (conta1.saldo > conta2.saldo) 
         return conta1;
      else if (conta2.saldo > conta1.saldo)
         return conta2;  
      else
         return null;
   }

    // Questão 2.h)
   public Conta maiorSaldo(Conta conta2) {
      if (this.saldo > conta2.saldo) 
         return this;
      else if (conta2.saldo > this.saldo)
         return conta2;  
      else
         return null;
   }


   public int getNumeroConta() {
      return numeroConta;
   }

   public void setNumeroConta(int numeroConta) {
      this.numeroConta = numeroConta;
   }

   public String getNomeCliente() {
      return nomeCliente;
   }

   public void setNomeCliente(String nomeCliente) {
      this.nomeCliente = nomeCliente;
   }

   public double getSaldo() {
      return saldo;
   }

   public void setSaldo(double saldo) {
      this.saldo = saldo;
   }

}
