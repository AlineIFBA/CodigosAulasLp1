package IntroducaoPoo.ProvasAnteriores.Prova1a2018_1;

//Questão 3.a)
public class Conta {
   private int numero;
   private Cliente cliente;
   private TipoConta tipoConta;
   private double saldo;

  
   //Questão 3.b)
   public Conta(int numero, Cliente cliente, TipoConta tipoConta) {
      this.numero = numero;
      this.cliente = cliente;
      this.tipoConta = tipoConta;
      this.saldo=0;
   }

   //Questão 3.c)
   public Conta (String nome, String CPF, int numero, TipoConta tipoConta){
      this.numero = numero;
      //O objeto cliente foi criado aqui, já que não foi passado o objeto como parêmtro mas sim os parâmetros que correspondem às variáveis de instância do cliente - nome e CPF:
      this.cliente = new Cliente(nome, CPF);
      this.tipoConta = tipoConta;
      this.saldo=0;

   }

   public Conta(){

   }

   /*Questão 3.d) Métodos get e set estão no final da classe */

   //Questão 3.e)
   public void imprimir() {
      System.out.println( "Conta [numero=" + numero + ", Nome do cliente=" + cliente.getNome() + ", CPF= " + cliente.getCPF() + ", tipoConta=" + tipoConta + ", saldo=" + saldo + "]");
   }

   //Questão 3.f)
   public void saque(double valor){
      if (this.tipoConta==TipoConta.ESPECIAL)//se a conta for ESPECIAL, vai sacar independente do saldo      
         this.saldo=this.saldo-valor;
      else
         if (this.saldo>=valor)//se a conta não for ESPECIAL, vai sacar só se houver saldo disponível
            this.saldo=this.saldo-valor;
}

   //Questão 3.g)
   public void deposito(double valor){
      this.saldo=this.saldo+valor;// saldo=saldo+valor; OU saldo+=valor; 
      /*Poderia chamar setSaldo?
       * Sim, qualquer método da classe pode ser chamado pela própria classe
       * setSaldo(saldo+valor); 
       * OU this.setSaldo(this.saldo+valor); */
}

   //Questão 3.h)
public void transferencia(Conta destino, double valor){
      if (this.saldo>=valor){
         this.saldo=this.saldo-valor;
         destino.saldo= destino.saldo+valor;
      }
         
  }

  //Questão 3.i)
  public static void transferencia(Conta origem, Conta destino, double valor){
       if (origem.saldo>=valor){
         origem.saldo=origem.saldo-valor;
         destino.saldo= destino.saldo+valor;
      }
  }


//Questão 3.j)
public void alterarNomeCliente(String nome){
   //Como "nome" é private na classe Cliente, a classe Conta (esta) só pode alterar o nome do seu objeto "cliente" chamando o método setNome da classe Cliente
   cliente.setNome(nome);
}

/*Questão 3.d) Métodos get e set: */  
public void setNumero(int numero) {
      this.numero = numero;
   }


   public void setCliente(Cliente cliente) {
      this.cliente = cliente;
   }


   public void setTipoConta(TipoConta tipoConta) {
      this.tipoConta = tipoConta;
   }


   public void setSaldo(double saldo) {
      this.saldo = saldo;
   }


   public int getNumero() {
      return numero;
   }


   public Cliente getCliente() {
      return cliente;
   }


   public TipoConta getTipoConta() {
      return tipoConta;
   }


   public double getSaldo() {
      return saldo;
   }

/*==================================================== */
}
