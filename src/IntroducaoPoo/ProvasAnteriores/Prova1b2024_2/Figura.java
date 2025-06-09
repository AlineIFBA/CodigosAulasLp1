package IntroducaoPoo.ProvasAnteriores.Prova1b2024_2;


/* 2. Implemente a classe Figura, que poderá ser usada para instanciar quadrados, retângulos e
 * triângulos, contendo as variáveis de instância “tipoFigura” (String), “lado1”(double), “lado2”
 * (double) e “lado3” (double). Usar variáveis private e métodos public (0,2) */
public class Figura {

   private String tipoFigura;
   private double lado1;
   private double lado2;
   private double lado3;

   /* a) Elabore um construtor que receba dois valores double. A variável de instância que não recebeu um valor como parâmetro deve ser inicializada com o valor -1 como padrão. Se os valores forem iguais, tipoFigura deve ser “Quadrado”, Caso sejam diferentes, deve ser “Retângulo”.  (0,8) */
   public Figura(double lado1, double lado2) {//esse construtor será usado para instanciar quadrados
      this.lado1 = lado1;
      this.lado2 = lado2;
      this.lado3 = -1;
      if (lado1 == lado2) {
         tipoFigura = "Quadrado";
      } else {
         tipoFigura = "Retângulo";
      }
   }

   /* b)  Elabore um construtor que receba três valores double. Configurar o tipo como “Triângulo”(0,5)*/
   public Figura(double lado1, double lado2, double lado3) {//esse construtor será usado para instanciar triângulos
      this.lado1 = lado1;
      this.lado2 = lado2;
      this.lado3 = lado3;
      this.tipoFigura = "Triângulo";
   }

   /*c) Elaborar um método public double area() que retorne a área da figura conforme o seu tipo. Utilize as fórmulas (1,5)
Área do quadrado de lado L é L2 (L ao quadrado)
Área do retângulo de lados L1 e L2 é L1*L2
Área de qualquer triângulo (e não apenas triângulo retângulo) de lados “a”, “b” e “c” é:
  RaizQuadradaDe : p(p-a)(p-b)(p-c), onde p= (a+b+c)/2. 
Math.sqrt(x) em Java calcula a raiz de um número x.*/
   public double area() {
      if (lado3 == -1)//não é um triângulo, então é quadrado ou retângulo
      {
         return lado1 * lado2; //a área do retângulo ou quadrado podem ser calculados da mesma forma
      } else {
         double p = (lado1 + lado2 + lado3) / 2;
         return Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
      }

   }

   /*d) Faça um método public Figura maiorFigura(Figura fig) que retorne a maior figura entre a que chama o método e a do parâmetro “fig”. A comparação e o retorno devem ser feitos apenas se as figuras forem do mesmo tipo. A maior figura é a que tem maior área. Se as figuras não puderem ser comparadas, imprimir a mensagem “As figuras não são do mesmo tipo” e retorne null (1,0)*/
   public Figura maiorFigura(Figura fig) {
      if (this.tipoFigura.equals(fig.tipoFigura)) { //se as figuras são do mesmo tipo
         if (this.area() > fig.area()) {
            return this;
         } else if (fig.area() > this.area()) {
            return fig;
         } else //if (fig.area()==this.area()) - se as áreas forem iguais nesse caso 
         {
            System.out.println("As figuras têm a mesma área: " + fig.area());
            return null;
         }

      } else {//as figuras não são do mesmo tipo
         System.out.println("As figuras não são do mesmo tipo e, portanto, não podem ser comparadas");
         return null;
      }

   }

   /* e) Implemente o método public String toString() para retornar uma String com o tipo da figura, os valores dos lados e 
   a área. Os lados “inválidos” não deverão compor a string de retorno. Por exemplo, quadrado e retângulo não 
   devem ter o lado3 (1,0)*/
   public String toString() {
      if (tipoFigura.equals("Triângulo")) {
         return tipoFigura + "  Lado 1: " + lado1 + "  Lado 2:" + lado2 + "Lado3: " + lado3 + "\n";
      }
      if (tipoFigura.equals("Retângulo")) {
         return tipoFigura + "  Lado 1: " + lado1 + "  Lado 2:" + lado2 + "\n";
      }
      if (tipoFigura.equals("Quadrado")) {
         return tipoFigura + "  Lado: " + lado1 + "\n";
      }

      return null;
   }

   /*f) O método da questão d) pode ou deve usar métodos get()? Por quê? Responda em forma de comentário no código /* resposta da letra f) .... (0,5) 
   
   RESPOSTA: O método Figura maiorFigura(Figura fig) criado na questão d) PODE usar métodos get para acessar o valor de tipo da
   figura, mas isso não é obrigatório (portanto, pode usar ou não)
   Por exemplo, ao invés de usar "this.tipoFigura", poderíamos fazer "this.getTipoFigura()", desde que o método "getTipoFigura()" fosse implementado. Mas o método não necessariamente deve ser usado mesmo que a variável seja private. Isso se explica porque o acesso (leitura do valor armazenado na variável) está sendo feito dentro da própria classe Figura, e não a partir de outra classe. Assim, a variável "tipoFigura" é visível em toda a classe Figura, enquanto uma outra classe externa
poderia ler o valor apenas se chamasse o método getTipoFigura() */
   public String getTipoFigura() {
      return tipoFigura;
   }

}