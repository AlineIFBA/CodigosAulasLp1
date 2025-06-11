package IntroducaoPoo.ExerciciosLaboratorio;
import java.util.Scanner;

//Questão 4
public class Empregado {
   private String nome;
   private Computador pc;

   // Questão 5
   public Empregado(String nome, Computador pc) {
      this.nome = nome;
      this.pc = pc;
   }

   // Questão 6
   public Empregado(String nome, int memoria, int hd, String processador) {
      this.nome = nome;
      pc = new Computador(memoria, hd, processador);
   }

   // Questão 7
   public void setPc(int memoria, int hd, String processador) {
      pc = new Computador(memoria, hd, processador);
   }

   // Questão 8
   public void setPc() {
      int memoria, hd;
      String processador;
      Scanner input = new Scanner(System.in);
      System.out.println("Digite um valor para a memória:");
      memoria = input.nextInt();
      System.out.println("Digite um valor para o HD:");
      hd = input.nextInt();
      System.out.println("Digite um modelo para o processador:");
      processador = input.next();
      pc = new Computador(memoria, hd, processador);
      input.close();
   }
  

   //Questão 9
   private Computador comprar() {
      //O método setPc já faz tudo que a questão pede. Para não repetir o código, va,os chamá-lo aqui
      setPc();
      return pc;//A diferença é que esse método comprar() tem que retornar o pc do Empregado
   }
   
   //Questão 10
   public static void transferir(Empregado e1, Empregado e2) {
      
      Computador anterior = e1.pc;//referência declarada para "pegar" o computador antigo de e1 e atribuir ao pc do empregado e2
      e2.pc = anterior; //o computador de e2 passa a ser o computador de e1. Nesse momento, os dois empregados estão com o mmesmo computador. Agora falta alterar o computador de e1:
      
      /*Podemos usar o método comprar() para alterar o computador de e1, pois comprar() instancia um novo computador  atribuindo-o ao objeto pc do Empregado (chamando o método setPc()), e depois retorna esse computador que foi criado para o Empregado. Assim, poderíamos usar a instrução abaixo: 
      
      e1.pc=e1.comprar();
      
      No entanto, nem era preciso atribuir o retorno do método comprar() ao e1.pc, pois dentro do método comprar(), o empregado e1 já teve seu computador alterado para o novo (linha 37). Quando chamamos e1.comprar(), o this dentro de comprar() é o empregado e1. Poderíamos então chamar o método comprar() sem usar o retorno para atribuir novamente o novo computador ao pc de e1 (Não fica errado, mas está redundante, fazendo a mesma coisa duas vezes):*/
      
      e1.comprar(); //Assim fica melhor, sem redundância
      
      /*Poderíamos também usar o método setPc(), que instancia um novo computador e o atribui ao objeto pc do Empregado, sem retornar esse novo computador. Poderíamos, então, ter usado a instrução abaixo:
      e1.setPc();  

      Está correto, mas o nome "comprar" dá mais ideia de que houve um computador novo, então eu preferi deixar e1.comprar() 
      */
      System.out.println("O computador de " + e1.nome + " foi transferido para " + e2.nome);

   }

   //Questão 11
   public void transferir(Empregado e) {
      Computador anterior = this.pc;
      e.pc = anterior;
      /*Aqui eu vou deixar o retorno de comprar() atribuir novamente o novo computador ao pc do empregado this, mas como podemos ocultar a palavra this, "visualmente" fica melhor: */
      this.pc = comprar(); // this recebeu um novo computador.
      
      /*Todas as instruções abaixo estariam certas e dariam o mesmo resultado:
      this.pc = this.comprar();
      pc = this.comprar();
      pc = comprar();
      this.setPc();
      setPc();
       */
      
      System.out.println("O computador de " + this.nome + " foi transferido para " + e.nome);

   }

   // Questão 12
   public static void troca(Empregado e1, Empregado e2) {
      Computador anterior = e1.pc;
      e1.pc = e2.pc;// e1 recebeu o computador de e2
      e2.pc = anterior;//e2 recebeu o computador de e1
      //Não houve a criação de nenhum objeto Computador novo
      System.out.println(e1.nome + " e " + e2.nome + " tiveram seus computadores trocados");

   }

   // Questão 13
   public static void change(Empregado e1, Empregado e2) {
      Computador anterior = e1.pc;
      e1.setPc(e2.pc);// e1 recebeu o computador de e2
      e2.setPc(anterior); //e2 recebeu o computador de e1
      /*O método setPc utilizado foi o setPc(Computador pc), que é o setPc padrão, cujo código vem logo a seguir. Os outros métodos setPc que nós implementamos não recebem o parâmetro de qual é o computador que vai ser atribuído ao pc do Empregado, pois estão instanciando um novo computador dentro do método. Assim, os outros setPc não eram adequados para a tarefa de apenas fazer uma troca de computadores entre os empregados*/
      System.out.println(e1.nome + " e " + e2.nome + " tiveram seus computadores trocados");
   }

    //Método setPc padrão; Os outros get e set estão a seguir
   public void setPc(Computador pc) {
      this.pc = pc;
   }
   
   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public Computador getPc() {
      return pc;
   }

   

}
