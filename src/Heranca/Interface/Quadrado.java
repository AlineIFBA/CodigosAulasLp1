package Heranca.Interface;


//Quadrado implementa a interface Figura, então deverá implementar os métodos area(), perimetro() e print()
/*Uma classe pode implementar mais de uma interface, que é o caso deste exemplo
 * Quadrado está implementando Figura, uma interface que nós definimos, e também a interface Comparable, definida nos pacotes Java, para tornar um objeto "comparável" (que possa ser comparado com outro se é m,aior, menor ou igual). Ao implementar a interface Comparable, nossa classe é obrigada a implementar o método "compareTo". Feito isso, poderemos aplicar métodos de ordenar uma lista ou array de objetos da nossa classe, do menor para o maior, fornecidos em outras implementações do Java
 */

 /*O tipo "Quadrado" dentro de "<>" especifica o tipo de Comparable. Isso se chama "Programação genérica" (não é assunto da disciplina, mas caso alguém se interesse pelo assunto agora, esse é o nome). Numa versão JDK mais antigo, será aceito apenas Comparable ao invés de Comparable<Tipo> */
public class Quadrado implements Figura { 
   private double lado;
   

   /*Este é o método abstract da interface Comparable que nossa classe se tornou obrigada a implementar
    * Como declaramos Comparable<Quadrado> "lá em cima", compareTo irá receber um Quadrado como parâmetro. Em versão mais antiga do compilador Java, receberá somente "Object"  */
   public int compareTo(Quadrado q) {
    /*Esse método deve ser implementado assim, segundo a recomendação do Java: 
    -Se o objeto this for MENOR que o objeto "q", o método deve retornar um número inteiro negativo
    -Se o objeto this for MAIOR que o objeto "q", o método deve retornar um número inteiro positivo
    -Se os objeto this e "q" forem iguais, o método deve retornar o número inteiro zero
    A definição do que é maior, menor e igual, é exatamente o que for definido no método.
    Vamos definir aqui neste exemplo, que objetos com lados de mesmo valor será quadrados iguais (mesmo não sendo o mesmo objeto. Estamos interessados na comparação de valores agora)
    */
        if (this.lado<q.lado)
            return -1; //negativo
        else if (this.lado>q.lado)
            return 1;//positivo
        else
            return 0;//zero
       
}
   public double area(){
       return lado*lado;
   }
   public double perimetro(){
       return lado*4;
   }
   
   public void print(){
       System.out.println("Sou quadrado");
   }
   
  
   public Quadrado(double lado) {
       this.lado = lado;
   }

   public double getLado() {
       return lado;
   }

   public void setLado(double lado) {
       this.lado = lado;
   }
   
   /*Esse método "equals" é herdado da superclasse mãe de toda e qualquer outra classe em Java - a classe Object. Qualquer classe herda de Object por padrão. De "Object" que herda-se o método "public String toString()"
   Se nossa classe não sobrescreve os métodos herdados de "Object", obteremos a implementação padrão que está na classe Object. Assim, quando chamamos "toString()" pra um objeto de uma classe que criamos, a saída é uma String que representa uma referência ao objeto. Se queremos algo diferente, o método deve ser sobrescrito
   O mesmo acontece com "equals". Se chamarmos "equals" pra comparar um objeto de nossa classe com qualquer outro objeto,  a saída será a implementação padrão do Java - o método só retorna "true" se forem exatamente o mesmo objeto. A comparação é feita pela referência e não com base em valores de variáveis.
   Na implementação abaixo, o método "equals" está sendo sobrescrito
   */

    @Override //Anotação de "sobrescrever". Serve para documentação. A IDE coloca mas pode tirar se desejar
   public boolean equals(Object obj) { //Essa é a assinatura do método e deve ser respeitada
      if (this == obj) //está comparando se é o mesmo objeto em memória
         return true;
      if (obj == null) // se por acaso o valor do parâmetro for null, ou seja, se chamar "q1.equals(null)" será falso
         return false;

      /*Abaixo, a instrução verifica se os objetos sendo comparados são da mesma classe. Se as classes dos objetos forem diferentes, o método também retornará falso. Sim, dá pra chamar "equals" com qualquer tipo, já que o parâmetro de entrada é Object. 
       Por exemplo, se instanciarmos um Quadrado "q" e um Triangulo "t", poderíamos chamar "q.equals(t)", e o resultado seria false, pois getClass() retorna Quadrado para "q" e Triangulo para "t" */
      if (getClass() != obj.getClass()) 
         return false;
       
      /*Abaixo, a instrução verifica se os lados dos quadrados são iguais. Queremos que o método retorne true se os lados tiverem o mesmo valor. Só que "obj" (o parâmetro) veio como Object. Assim, a variável "lado" dele não está acessível, pois apesar de ser um Quadrado, ele veio como Objetc. Então deve-se fazer uma "coerção de tipo" (cast) para converter obj em Quadrado, o que é feito com a instrução "(Quadrado) obj;".
      Se obj não for um Quadrado, vai gerar uma exceção na hora da execução. Existe como verificar se obj realmente é um Quadrado ou não para evitar esse erro. Basta usar o operador "instanceof" */  
      
      if (obj instanceof Quadrado){ //verificando se obj é uma instância da subclasse Quadrado
        Quadrado other = (Quadrado) obj;//Declaramos a referência "other" para receber a referência do objeto obj convertido em Quadrado
        if (this.lado == other.lado) //se os dois lados forem iguais retorna true. Se não for, saí do "if" e vai pra última instrução do método, que é "return false"
            return true;
      }
      return false;// Executa esse return se obj não for um quadrado ou, se for, tenha o lado diferente do lado de this
   }
   
}