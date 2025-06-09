package IntroducaoPoo.ProvasAnteriores.Prova2018_1;

//Questão 4
public class Main {
   public static void main(String[] args) {
      /*Instancie pelo menos dois objetos da classe Cliente. */
      Cliente cliente1= new Cliente();
      Cliente cliente2=new Cliente("Danilo", "1234500");

      /* Instancie dois objetos da classe Conta, usando cada um dos construtores solicitados na questão 3.*/
      Conta conta1=new Conta("José","34545",2,TipoConta.SIMPLIFICADA);
      Conta conta2=new Conta(1, cliente2, TipoConta.ESPECIAL);
      
     
      /* Chame os métodos imprimir para o objeto Cliente e para o objeto Conta criados. */
      cliente1.imprimir();
      cliente2.imprimir();
      conta1.imprimir();
      conta2.imprimir();

      /* Chamar também o método saque, deposito e transferencia. */
      conta1.deposito(1000);
      conta2.deposito(500);
      conta1.saque(150);
      conta1.transferencia(conta2, 130);

      Conta.transferencia(conta1, conta2, 13.50);//Método transferencia static

      //Outros testes não solicitados na questão:

      /*O cliente da conta1 foi instanciado dentro do construtor de cliente. Aqui na classe Main não há (até esse ponto) uma referência para esse cliente como há para o cliente da conta2, que é a referência "cliente2". Como acessar então o cliente da conta1?  */

      //Vamos criar uma referência e obter o cliente da conta1 através do método getCliente()
      Cliente clienteDaConta1 = conta1.getCliente();
      //Agora podemos chamar qualquer método de cliente com essa referência clienteDaConta1
      clienteDaConta1.imprimir();

      //Mas poderíamos também acessar o cliente da conta1 sem ter declarado uma referência como clienteDaConta1. Basta usar "conta1.getCliente()"
      conta1.getCliente().imprimir();

      //Vamos alterar o nome do cliente da conta1:
      conta1.getCliente().setNome("Paulo");

      //Podemos também usar o método alterarNomeCliente que criamos na classe Cliente:
      conta1.alterarNomeCliente("Josefa");


      Conta conta3=new Conta();
      //A instrução abaixo vai gerar uma exceção se for removido o //. Por quê?
      // conta3.getCliente().setNome("Sandra");
      
      //Exemplo de declaração de variável do tipo enum criado:
      TipoConta tipo= TipoConta.ESPECIAL;     

   }
   

}
