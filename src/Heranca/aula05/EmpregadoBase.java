package Heranca.aula05;

/*Esta classe herda de Empregado (ou estende Empregado) */
public class EmpregadoBase extends Empregado{
   private double salarioBase;

   public EmpregadoBase(){
       /*A primeira instrução dentro do construtor de uma subclasse TEM QUE SER uma chamada ao
       * construtor da superclasse. Isso é feito usando a palavra "super". Ex:
       * super();   -> Chama o construtor padrão da superclasse. Nesse caso, chamaria o construtor "Empregado()", sem argumentos
       * super(nome);  ->Chama o construtor com um parâmetro na superclasse. Nesse caso, chamaria o construtor "Empregado(String nome)"      */
      super();//chamada explícita ao construtor padrão da superclasse. Se não colocar, o Java vai chamar implicitamente

   }
   
   public EmpregadoBase(String nome, double salarioBase){
      /*A primeira instrução dentro do construtor de uma subclasse TEM QUE SER uma chamada ao construtor da superclasse*/
      super(nome);
      /*Ao invés da instrução acima, chamando explicitamente o construtor, poderíamos atribuir o valor diretamente à variável "nome", como na instrução a seguir?
      this.nome=nome; //Isso poderia ser feito, já que a classe-filha (esta) tem acesso à variévl "nome" sem precisar usa get ou set, já que foi declarada na superclasse com a palavra "protected"
      No entanto, é mais comum (e esperado) que se chame o construtor da superclasse para REUTILIZAR a implementação que já foi feita no construtor da superclasse (se tiver validações por exemplo). Mas no caso de ser necessária uma inicialização da variável de forma totalmente diferente da classe mão, faria maios sentido acessar a variévl diretamente. Mas também vale se perguntar, nessa situação, se realmente se aplica o recurso de herança (Essa classe deveria mesmo estar herdando da superclasse??? )
      */
      this.salarioBase=salarioBase;

   }

   /* Esse método pagamento() tem ser implementado aqui na subclasse OBRIGATORIAMENTE, pois ele foi declarado como abstract na superclasse */
   public double pagamento(){
      return salarioBase;

   }

   @Override // Essa anotação @override não é obrigatória, mas ajuda a prevenir erros, como errar o nome do método sobrescrito 
   public void imprimir(){
      super.imprimir();
      System.out.println("Salário base: "+salarioBase);

   }
//Esse método está sendo sobrescrito, pois já está implementado na superclasse. Mas, se desejarmos uma implementação diferente, temos que sobrescrever - "override method"no inglês
   public String toString(){
      /*Para reutilizar o que já foi implementado neste método lá na superclasse, deve-se chamar o método da superclasse precedido da palavra "super":*/
      //Optamos por chamar o toString() da super classe (instrução super.toString()) e completar com o restante que queríamos. Lembre-se de que não é preciso usar o método toString() explicitamente na maioria das situações, mas nesse caso, não dá pra usar apenas a palavra "super" aqui.  
      return super.toString()+"  -  Pagamento Salário Base: "+pagamento();
      
   }
    public double getSalarioBase() {
      return salarioBase;
   }

   public void setSalarioBase(double salarioBase) {
      this.salarioBase = salarioBase;
   }
   
   

}
