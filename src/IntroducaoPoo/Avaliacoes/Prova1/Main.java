package IntroducaoPoo.Avaliacoes.Prova1;

public class Main {
   public static void main(String[] args) {

      /*3)	Instancie pelo menos três objetos da classe Pessoa. */ 
      Pessoa p1=new Pessoa("Jana");
      Pessoa p2=new Pessoa("Marcos");
      Pessoa p3=new Pessoa("Fabiana");

      /*3)	Chame o método setDinheiroNaConta com um valor maior que zero sendo passado como parâmetro para atualizar o valor dessa variável para as pessoas criadas. */ 
      p1.setDinheiroNaConta(1000);
      p2.setDinheiroNaConta(7000);
      p3.setDinheiroNaConta(200);

    /*3)	Instancie dois objetos da classe Namoro.  */   
      Namoro n1=new Namoro(p2, p3);
      Namoro n2=new Namoro(p2, p1);

    /*3) Faça pelo menos uma chamada para cada um dos métodos elaborados da letra d) à letra g) */ 
      n1.comprarPresente(500);
      Namoro.comprarPresente(p3, 100);

      if (n1.saoNamorados(p1, p2))
         System.out.println(p1.getNome()+ " e "+ p2.getNome()+" são o par deste relacionamento");
      else
         System.out.println(p1.getNome()+ " e "+ p2.getNome()+" não são o par deste relacionamento");
   }

}
