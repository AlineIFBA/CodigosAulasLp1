package Heranca.Interface;


/*Interface é como uma classe abstrata (não pode ser instanciada), mas sem implementação alguma (sem implementação de método), e sem construtor , pois não será herdada, será "implementada"*/
public interface Figura {
   
   /*A interface pode ter variáveis, apesar de não ter nesse primeiro exemplo
   As variáveis da interface são todas static final.  */

   /*Os métodos da interface são todos ABSTRACT, mesmo sem colocar essa palavra
    * Asssim, não há implementação desses métodos aqui, apenas a declaração
    A classe que implementar uma interface é obrigada a implementar todos os métodos dela.
    Portanto, a classe que implementar essa interface Figura é obrigada a implementar todos os métodos abaixo
   */
   public double area();
   public double perimetro();
   public void print();
   
}
