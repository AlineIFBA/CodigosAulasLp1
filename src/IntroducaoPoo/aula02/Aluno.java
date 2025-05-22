package IntroducaoPoo.aula02;
import javax.swing.JOptionPane;
public class Aluno {
   /*Variáveis de instância do objeto:*/
    //O padrão é declarar as variáveis private
   private String nome;
   private int matricula;

 
    /*construtor padrão - sem nenhum argumento
   Se nenhum construtor for definido pelo programador, o Java fornece implicitamente (sem estar escrito no código) este construtor padrão. Assim, se não houver nenhum construtor implementado, é possivel criar um objeto invocando o construtor padrão, como no exemplo: Aluno a=new Aluno();
   Entretanto, se algum outro construtor for fornecido, o construtor padrão não poderá ser chamado se não estiver presente no código. */
   public Aluno() {
      /*Se nenhum código for escrito no construtor padrão, as variáveis de instância serão inicializadas pelo Java com os valores default, que são:valor zero para tipos numéricos, false para boolean e null para qualquer objeto. Sendo assim, deixar este construtor de Aluno sem código tem o mesmo efeito das linhas de código abaixo: 

      nome=null;
      matricula=0;
      */      
   }
//construtor com 1 argumento
   public Aluno(String nome) {
      this.nome = nome;
      this.matricula = 1; //A matrícula será inicializada com o valor 1 caso este construtor seja chamado
   }
   
//construtor com 2 argumentos
   public Aluno(String nome, int matricula) {
      this.nome = nome;
      this.matricula = matricula;
   }
   /*CONCEITO IMPORTANTE DA ORIENTAÇÃO A OBJETOS:
   Como foi definido mais de um construtor, dizxemos que houve uma SOBRECARGA do construtor
   Há SOBRECARGA DE MÉTODO quando há mais de uma método com o mesmo nome, porém com a lista de parâmetros diferente */


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
   public Aluno menorMatricula(Aluno a1, Aluno a2){
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
