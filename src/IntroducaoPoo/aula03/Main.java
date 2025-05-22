package IntroducaoPoo.aula03;

import javax.swing.JOptionPane;

public class Main {
   public static void main(String[] args) {
      
   int quantosAlunos=  Aluno.getQuantidade();
   JOptionPane.showMessageDialog(null, "Quantidade de alunos instanciados: "+quantosAlunos);
   Aluno a=new Aluno("João");
   Aluno b=new Aluno("Maria");
   Aluno c=new Aluno();

   a.imprimirDados();
   b.imprimirDados();
   c.imprimirDados();
   //Chamando método static pelo nome da classe
   Aluno menor= Aluno.menorMatricula(a,b);
   //menor.imprimirDados();
   quantosAlunos=  Aluno.getQuantidade();
   JOptionPane.showMessageDialog(null, "Quantidade de alunos instanciados: "+quantosAlunos);
   
   

}
}
