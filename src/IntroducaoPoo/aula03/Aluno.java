package IntroducaoPoo.aula03;

import javax.swing.JOptionPane;
public class Aluno {
   /*Variáveis de instância do objeto:*/
    //O padrão é declarar as variáveis private
   private static int quantidade=0;
   private String nome;
   private int matricula;

 
   public Aluno() {
   

      nome=null;
      matricula=0;   */   
      quantidade++;  
      this.matricula = quantidade; 
   }
//construtor com 1 argumento
   public Aluno(String nome) {
      this.nome = nome;
      quantidade++;
      this.matricula = quantidade; //A matrícula será inicializada com o valor 1 caso este construtor seja chamado
      
   }
   
/* = = = MÉTODOS ACESSORES E MUTATÓRIOS = = = */
   
  public String getNome() {
      return this.nome;
      /* A referência this não é obrigatória aqui. 
      Codificar "return this.nome" tem o mesmo efeito de codificar "return nome" */
   }
public void setNome(String nome) {
   /* A referência this É OBRIGATÓRIA aqui neste caso em que o parâmetro do métofdo tem o mesmo nome da variável de instância do objeto. 
      É necessário usar "this.nome" para se referir à variável de instância. Usar apenas "nome" faz referência à variável local do parâmetro. */
      this.nome = nome;
   }

   public int getMatricula() {
      return matricula;
   }

   public void setMatricula(int matricula) {
      this.matricula = matricula;
   } 

   public static int getQuantidade(){
      return quantidade;
   }
   /* = = = = = = = = = = = = = = = = = = */
    
    /*Método que definimos para imprimir os valores das variáveis do objeto na tela*/
   public void imprimirDados(){
      System.out.println("Nome: "+nome+"\nMatrícula: "+matricula);
      //JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nMatrícula: "+matricula );
   }

   /*Método que recebe dois objetos Aluno como parâmetro e retorna o objeto Aluno que tiver o menor número de matrícula. Diferentemente das variáveis de tipo primitivo, os objetos são passados como parâmetro por referência e não por valor
    PASSAGEM POR VALOR - Uma cópia da variável sendo passada é criada localmente para o método que recebe o parâmetro (Aplica-se a tipos primitivos - int, double, float, boolean, char etc.)
    PASSAGEM POR REFERÊNCIA - Não é criada uma cópia do objeto mas o "próprio objeto" é passado como parâmetro, ou seja, é passada a referência do objeto (uma espécie de "endereço" do objeto, que é o nome declarado) para o método que recebe o parâmetro. 
   */
   public static Aluno menorMatricula(Aluno a1, Aluno a2){
      if (a1.matricula < a2.matricula) //a1 e a2 correspondem aos mesmos objetos que foram passados como parâmetro ao chamar este método. 
         return a1;
      else if (a2.matricula < a1.matricula)
         return a2;
      else 
         return null;
   }

   /*Aqui estamos fazendo uma SOBRECARGA do método menorMatricula
   Neste, apenas um objeto Aluno é passado como parâmetro. O outro objeto Aluno que será comparado a ele será o objeto que foi usado para chamar o método (ou seja, o handle). Para este objeto, usamos a referência this. */
   public Aluno menorMatricula(Aluno al){ 
      //al corresponde ao mesmo objetos que foi passado como parâmetro ao chamar este método. 
      //this corresponde ao objeto "chamador" (handle) do método
      //Se na classe Main2, a chamada foi "a.menorMatricula(b)", o objeto "this" aqui se refere ao objeto "a" e o objeto "al" aqui se refere ao objeto "b"
      if (this.matricula < al.matricula) 
         return this;
      else if (al.matricula < this.matricula)
         return al;
      else 
         return null;
   }
  
}

