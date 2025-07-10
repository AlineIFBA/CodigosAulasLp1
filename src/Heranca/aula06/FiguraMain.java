package Heranca.aula06;

public class FiguraMain {
   public static void main(String[] args) {
        
    /*Implementando POLIMORFISMO com interface:
       * Vamos instanciar um array de referências da interface Figura. É um array de REFERÊNCIAS, e não de  OBJETOS Figura - interface não instancia objetos, pois não é classe. Nem tem construtor
       * Três variáveis do tipo "Figura" que vão armazenar o "endereço" ou a "localização", ou o "nome de contato" de um objeto que implementa a classe Figura (é uma figura, se comporta como uma figura, pois implementa os métodos da interface). */  
      Figura figuras[]=new Figura[3];
      figuras[0]=new Quadrado(4);//Instanciamos um quadrado de lado 4 e atribuímos à referência figuras[0]
      figuras[1]=new Triangulo(2,3,4);//Instância de triângulo de lados 2,3 e 4 e atribuímos à referência figuras[1]
      figuras[2]=new Triangulo(7,10,5);//Instância de triângulo de lados 7,10 e 5 e atribuímos à referência figuras[2]
          
      //Laço para percorrer o array figuras
      for (Figura f:figuras){
          f.print();//comportamento polimórfico aqui. Vai chamar o método "print()" de Quadrado ou Triângulo, conforme for o tipo de "f" naquela iteração
          if (f instanceof Triangulo){ // se "f" for Triangulo (só será true para os 2 últimos objetos no array)
              Triangulo t=(Triangulo)f; //coerção de Figura para Triangulo
              t.verificarTriangulo(); //O método verificarTriangulo só apareceu para "t" do tipo Triângulo. Como "f" (referência da interface), os métodos acessíveis para o objeto eram só os da interface Figura
          }
          System.out.println("Perimetro: "+f.perimetro()+" Area: "+ f.area());//comportamento polimórfico aqui também   
         
      }
   
  }

}
