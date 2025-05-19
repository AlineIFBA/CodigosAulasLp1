package IntroducaoPoo.aula01;
import javax.swing.JOptionPane;
public class Aluno {
   /*Variáveis de instância do objeto:*/
    //O padrão é declarar as variáveis private
   private String nome;
   private int matricula;

    /*Construtor com 2 argumentos:*/
   public Aluno(String n, int m){
      nome=n;
      matricula=m;
   }

   /* = = = MÉTODOS ACESSORES E MUTATÓRIOS = = = */
   public void setMatricula(int m){
      matricula=m;
   }
   public void setNome(String n){
      nome=n;
   }
   public int getMatricula(){
      return matricula;
   }

   public String getNome(){
      return nome;
   }

    /* = = = = = = = = = = = = = = = = = = */
    
    /*Método que definimos para imprimir os valores das
    variáveis do objeto na tela*/
   public void imprimirDados(){
      //System.out.println("Nome: "+nome+"\nMatrícula: "+matricula);
      JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nMatrícula: "+matricula );
   }   
}
