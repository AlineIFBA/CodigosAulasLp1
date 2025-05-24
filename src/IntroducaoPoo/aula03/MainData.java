package IntroducaoPoo.aula03;

public class MainData {
   public static void main(String[] args) {
      Data d1=new Data(40,13,25);
      d1.imprimir();
      d1.imprimirDDMMAAAA();
      d1.imprimirExtenso();

      Data d2=new Data();//inicializando com os valores 15,5 e 2025
      d2.imprimirDDMMAAAA();
      d2.imprimirExtenso();
      d2.setMes(40);//O mês será alterado para 1 (40 não será permitido)
      d2.imprimirExtenso();
      Data d3=new Data(15,1,2025);

      Data menorData = d3.obterDataMaisRecente(d2);
      if (menorData!=null)
         menorData.imprimirDDMMAAAA();
     
   }

}
