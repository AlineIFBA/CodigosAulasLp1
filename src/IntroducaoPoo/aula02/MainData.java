package IntroducaoPoo.aula02;
public class MainData {
   public static void main(String[] args) {
      //Data data1=new Data(12,11,1999);
      //Data data2=new Data(7,3,2000);
      Aluno a=new Aluno("João",678);
      Aluno b=new Aluno("Maria",678);
      a.menorMatricula(b).imprimirDados();

   }

}
