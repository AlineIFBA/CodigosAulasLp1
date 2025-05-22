package IntroducaoPoo.aula02;
public class Main2 {
   public static void main(String[] args) {
      //Instanciando objetos da classe Data:
      Data data1=new Data(12,11,1999);
      Data data2=new Data(7,3,2000);
      
      //Instanciando dois objetos Aluno:
      Aluno a=new Aluno("João",123);
      Aluno b=new Aluno("Maria",678);
      //Chamando o método menorMatricula com os objetos "a" e "b". Com o objeto que o método retornar, estaremos chamando o método imprimirDados()
      a.menorMatricula(b).imprimirDados();

      //Outra forma:
      Aluno menor=a.menorMatricula(b);//o objeto que o método retornar será atribuído à referência "menor" 
      //Como é o Aluno "a" que tem a menor matrícula, tanto a referência "a" quanto "menor" se referirão ao mesmo objeto
      menor.imprimirDados(); // mesmo esfeito de chamar a.imprimirDados();

      //Chamando o método com os dois parâmetros:
      Aluno c=new Aluno();
      c.menorMatricula(a,b);//esse aluno "c" só está sendo usado como handle, não está sendo usado "pra nada" no método. Neste caso, é melhor criarmos um método STATIC

   }

}
