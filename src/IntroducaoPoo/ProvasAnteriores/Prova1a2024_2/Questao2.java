package IntroducaoPoo.ProvasAnteriores.Prova1a2024_2;


/**
 * * 2. Elabore a classe Questao2 que contenha
 */
public class Questao2 {

   /*a) o método void main instanciando 3 figuras de tipos diferentes e chamando o método de cálculo de area()para pelo menos uma figura e imprimindo o resultado (0,5)*/
   public static void main(String[] args) {
      Figura triangulo = new Figura(3, 4, 5);
      Figura quadrado1 = new Figura(3.5);
      Figura quadrado2 = new Figura(4.5, 4.5);
      Figura retangulo1 = new Figura(3, 4);
      Figura retangulo2 = new Figura(2, 6);

      System.out.println("Área do " + triangulo.getTipoFigura() + ": " + triangulo.area());

      /* b) Chame o método que retorna a maior de duas figuras usando figuras de mesmo tipo e mesma área como parâmetro, e depois chame novamente usando figuras de tipos diferentes. Use o método toString() para mostrar o resultado obtido pelas duas chamadas, mas não permita que erros sejam gerados,como uma exceção NullPointerException (1,0)*/
      Figura maior = Figura.maiorFigura(retangulo1, retangulo2);//mesmo tipo e mesma área
      if (maior == null)//para evitar erro NullPointerException
      {
         System.out.println("Figuras de mesma área e/ou mesmo tipo");
      } else {
         System.out.println("Maior figura: " + maior.toString() + " com área igual a " + maior.area());
      }

      maior = Figura.maiorFigura(quadrado1, retangulo2);
      if (maior == null)//para evitar erro NullPointerException
      {
         System.out.println("Figuras de mesma área e/ou mesmo tipo");
      } else {
         System.out.println("Maior figura: " + maior.toString() + " com área igual a " + maior.area());
      }
   }
}
