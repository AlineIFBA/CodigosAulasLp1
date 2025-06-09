package IntroducaoPoo.ExerciciosLaboratorio;

public class Main {
   public static void main(String[] args) {
      //Criando dois objetos com os mesmos valores:
      Data d1=new Data(5,5,25);
      Data d2=new Data(5,5,25);

      /*Ao comparar duas referências com ==, só é true se forem referências para o mesmo objeto */
      if (d1==d2)//vai ser false, porque d1 e d2 não são o mesmo objeto. 
         System.out.println("Essas referências são o mesmo objeto");
      else
         System.out.println("Essas referências são de objetos distintos");

      /*No if abaixo, estamos chamando o método datasIguais, que conforme implementamos, vai retornar true se o dia, o mês e o ano das datas forem iguais */
      if (Data.datasIguais(d1, d2)) //vai ser true, porque d1 e d2 têm os mesmos valores de dia, mês e ano
         System.out.println("As datas são iguais (em valores) mas não são o mesmo objeto");
      

      d2.setMes(2);//Agora alteramos o mês do objeto d2 para o valor 2(fevereiro)
      Data menorData = d1.obterDataMaisRecente(d2); //chamamos o método obterDataMaisReecente para comparar d1 e d2 e obter a mais recente. A referência menorData vai receber a data que o método retornar

      /*Como alteramos o mês de d2 para 2, sabemos que o método acima vai retornar d1, que tem o mês 5. Então, "menorData" vai receber a referência do objeto d1, fazendo com que d1 e menorData se refiram ao mesmo objeto */

      if (d1==menorData){// vai ser true, porque menorData está guardando o mesmo objeto que d1
         System.out.println("Os objetos d1 e menorData são o mesmo objeto");     
      }
      else
         System.out.println("Os objetos d1 e menorData são objetos diferentes"); 
      
      /*Imprimindo os valores de cada data no formato dd/mm/aaaa: */
      menorData.imprimirDDMMAAAA();//terá a mesma saída da instrução abaixo
      d1.imprimirDDMMAAAA();//terá a mesma saída da instrução acima
      d2.imprimirDDMMAAAA();//terá saída com mês de fevereiro
          
   }

}

