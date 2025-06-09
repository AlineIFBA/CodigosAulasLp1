package IntroducaoPoo.ProvasAnteriores.Prova1b2024_2;

public class Questao3 {
public class Questao3 {

   /**
    * 1. Elabora a classe Questao3 que contenha a) o método void main instanciando 3 figuras de
    * tipos diferentes e chamando o método de cálculo de area() para pelo menos uma figura e
    * imprimindo o resultado (0,5)
    */
   public static void main(String[] args) {
      Figura f1 = new Figura(4.5, 4.5);//instanciando quadrado  
      Figura f2 = new Figura(5, 7);//instanciando retângulo  
      Figura f3 = new Figura(3, 4, 5);//instanciando triângulo 
      Figura f4 = new Figura(11, 3);//instanciando retângulo 

      double area = f3.area();
      System.out.println("Área do " + f3.getTipoFigura() + ": " + area);

      /* b) Chame o método que compara duas figuras usando figuras do mesmo tipo, e depois chame novamente usando figuras de tipos diferentes. Use o método toString() para mostrar o resultado obtido pelas duas chamadas, mas não permita que erros sejam gerados, como uma exceção NullPointerException (1,0) */
      Figura maior = f2.maiorFigura(f4);//comparação entre os objetos f2 e f4 - de mesmo tipo
      if (maior == null)//para evitar erro NullPointerException
      {
         System.out.println("Figuras de mesma área ou tipos diferentes");
      } else {
         System.out.println("Maior figura: " + maior.toString() + " com área igual a " + maior.area());
      }

      maior = f1.maiorFigura(f2);//comparação entre os objetos f1 e f2 - de tipos diferentes
      if (maior == null)//para evitar erro NullPointerException
      {
         System.out.println("Figuras de mesma área ou tipos diferentes");
      } else {
         System.out.println("Maior figura: " + maior.toString() + " com área igual a " + maior.area());
      }
   }

}
