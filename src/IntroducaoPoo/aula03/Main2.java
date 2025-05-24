package IntroducaoPoo.aula03;

public class Main2 {
   public static void main(String[] args) {
      Data d1=new Data(12,4,2025);
      Empregado e1=new Empregado("Cláudio", 3500, d1);

      d1.setAno(2024);

      Data d2=new Data(22,5,2025);

      //Alterando a data (trocando o objeto) do empregado:
      e1.setDataAdmissao(d2);
      e1.imprimirDataAdmissao();
      e1.setValoresAdmissao(13,1,2020);
      e1.imprimirDataAdmissao();

      d2.imprimir();




   }

}
