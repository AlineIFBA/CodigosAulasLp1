package IntroducaoPoo.aula02;
import javax.swing.JOptionPane;
public class Aluno {
   /*Variáveis de instância do objeto:*/
    //O padrão é declarar as variáveis private
   private String nome;
   private int matricula;

    /*Construtor com 2 argumentos:*/
   

   /* = = = MÉTODOS ACESSORES E MUTATÓRIOS = = = */
   
   public String getNome() {
      return nome;
   }

   //construtor padrão
   public Aluno() {
      /*Deixar sem código é o mesmo efeito de: 
      nome=null;
      matricula=0;
      */
      
   }

   public Aluno(String nome) {
      this.nome = nome;
      this.matricula = 1;
   }
   
//construtor com 2 argumentos
   public Aluno(String nome, int matricula) {
      this.nome = nome;
      this.matricula = matricula;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public int getMatricula() {
      return matricula;
   }

   public void setMatricula(int matricula) {
      this.matricula = matricula;
   } 
    /* = = = = = = = = = = = = = = = = = = */
    
    /*Método que definimos para imprimir os valores das
    variáveis do objeto na tela*/
   public void imprimirDados(){
      System.out.println("Nome: "+nome+"\nMatrícula: "+matricula);
      //JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nMatrícula: "+matricula );
   }

   public Aluno menorMatricula(Aluno a1, Aluno a2){
      if (a1.matricula < a2.matricula)
         return a1;
      else if (a2.matricula < a1.matricula)
         return a2;
      else 
         return null;
   }

   public Aluno menorMatricula(Aluno al){
      if (this.matricula < al.matricula)
         return this;
      else if (al.matricula < this.matricula)
         return al;
      else 
         return null;
   }
  
}
