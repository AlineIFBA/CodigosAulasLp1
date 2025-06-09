package IntroducaoPoo.ProvasAnteriores.Prova1a2024_2;

/* AVALIAÇÃO 1A * 1. Implemente a classe Figura, que poderá ser usada para instanciar quadrados,
 * retângulos e triângulos, contendo as variáveis de instância “lado1”(double), “lado2” (double) e
 * “lado3” (double). Usar variáveis private e métodos public (0,2)  */
public class Figura {

   private double lado1;
   private double lado2;
   private double lado3;

   /* a) Elabore um construtor que receba um valor double. As variáveis de instância que não receberam um valor como parâmetro deve ser inicializada com o valor -1 como padrão. Este construtor instanciará um quadrado (0,3) */
   public Figura(double lado) {//esse construtor será usado para instanciar quadrados
      this.lado1 = lado;
      this.lado2 = -1;
      this.lado3 = -1;
   }

   /* b) Elabore um construtor que receba dois valores double. A variável de instância que não recebeu um valor como parâmetro deve ser inicializada com o valor -1 como padrão. Este construtor instanciará um quadrado (pois aceitará dois double iguais) ou um retângulo (0,25) */
   public Figura(double lado1, double lado2) {//esse construtor será usado para instanciar retângulos, ou será um quadrado se
      //for chamado assim: new Figura (4.0, 4.0) - com os dois lados iguais
      this.lado1 = lado1;
      this.lado2 = lado2;
      this.lado3 = -1;
   }

   /* c)  Elabore um construtor que receba três valores double. Este construtor instanciará um triângulo (0,5)*/
   public Figura(double lado1, double lado2, double lado3) {//esse construtor será usado para instanciar triangulos
      this.lado1 = lado1;
      this.lado2 = lado2;
      this.lado3 = lado3;
   }

   /*d) Elaborar um método public double area() que retorne a área da figura conforme o seu tipo. Utilize as fórmulas (1,5)
Área do quadrado de lado L (dois lados iguais) é L2 (L ao quadrado)
Área do retângulo de lados L1 e L2 é L1*L2
Área de qualquer triângulo retângulo de lados “a”, “b” e “h” é: (b*a)/2. Mas é apenas para triângulo retângulo. Se o triângulo não for retângulo, retornar -1 
O triângulo é retângulo se h² = a² + b². */
   public double area() {
      if ((lado2 == -1 && lado2 == -1) || (lado1 == lado2 && lado3 == -1))//se for um quadrado
      {
         return lado1 * lado1;
      }
      if (lado1 != lado2 && lado3 == -1)//se for um retângulo
      {
         return lado1 * lado2;
      }
      if (lado1 != -1 && lado2 != -1 && lado3 != -1) {//se for triângulo
         if (Math.pow(lado1, 2) == Math.pow(lado2, 2) + Math.pow(lado3, 2)) // é retângulo
         {
            return (lado2 * lado3) / 2;
         }
         if (Math.pow(lado2, 2) == Math.pow(lado1, 2) + Math.pow(lado3, 2)) // outra forma de ser retângulo 
         {
            return (lado1 * lado3) / 2;
         }
         if (Math.pow(lado3, 2) == Math.pow(lado1, 2) + Math.pow(lado2, 2)) // outra forma de ser retângulo 
         {
            return (lado1 * lado2) / 2;
         }
      }
      return -1;
   }

   /* e) Faça o método public String getTipoFigura() que retorne “Triângulo” se a figura tiver os 3 lados válidos, “Quadrado” se tiver apenas um lado ou dois lados iguais e “Retângulo” se tiver 2 lados válidos e  diferentes (0,5)*/
   public String getTipoFigura() {
      if (lado1 != -1 && lado2 != -1 && lado3 != -1) {
         return "Triângulo";
      }
      if ((lado2 == -1 && lado2 == -1) || (lado1 == lado2 && lado3 == -1)) {
         return "Quadrado";
      }
      if (lado1 != lado2 && lado3 == -1)//se for um retângulo
      {
         return "Retângulo";
      }

      return null;
   }

   /* f) Faça um método public static Figura maiorFigura(Figura fig1, Figura fig2) que retorne a maior figura entre a fig1 e  fig2. A maior figura é a que tem maior área. Se as figuras forem de mesma área e mesmo tipo, retornar null (1,0)*/
   public static Figura maiorFigura(Figura fig1, Figura fig2) {
      if (fig1.area() > fig2.area()) {
         return fig1;
      }
      if (fig2.area() > fig1.area()) {
         return fig2;
      }

      return null;
   }

   /* g) Implemente o método public String toString() para retornar uma String com o tipo da figura e os valores dos lados. Os lados “inválidos” não deverão compor a string de retorno. (1,0)*/
   public String toString() {
      if (getTipoFigura().equals("Triângulo")) {
         return getTipoFigura() + "  Lado 1: " + lado1 + "  Lado 2:" + lado2 + "Lado3: " + lado3 + "\n";
      }
      if (getTipoFigura().equals("Retângulo")) {
         return getTipoFigura() + "  Lado 1: " + lado1 + "  Lado 2:" + lado2 + "\n";
      }
      if (getTipoFigura().equals("Quadrado")) {
         return getTipoFigura() + "  Lado: " + lado1 + "\n";
      }

      return null;
   }

   /* h) Implemente o método public boolean figurasDoMesmoTipo(Figura fig)que retorne se as figuras são do mesmo tipo (true) ou não (false) (0,5) */
   public boolean figurasDoMesmoTipo(Figura fig) {
      if (fig.getTipoFigura().equals(this.getTipoFigura())) {
         return true;
      } else {
         return false;
      }
   }
}