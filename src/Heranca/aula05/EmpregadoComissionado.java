package Heranca.aula05;

/*Esta classe herda de Empregado (ou estende Empregado) */
public class EmpregadoComissionado extends Empregado {
   private double comissao;
   private double vendas;

   public EmpregadoComissionado() {
      /*
       * A primeira instrução dentro do construtor de uma subclasse TEM QUE SER uma
       * chamada ao
       * construtor da superclasse. Isso é feito usando a palavra "super". Ex:
       * super(); -> Chama o construtor padrão da superclasse. Nesse caso, chamaria o
       * construtor "Empregado()", sem argumentos
       * super(nome); ->Chama o construtor com um parâmetro na superclasse. Nesse
       * caso, chamaria o construtor "Empregado(String nome)"
       */
      super();// chamada explícita ao construtor padrão da superclasse. Se não colocar, o Java
              // vai chamar implicitamente
   }

   public EmpregadoComissionado(String nome, double comissao, double vendas) {
      /*
       * A primeira instrução dentro do construtor de uma subclasse TEM QUE SER uma
       * chamada ao construtor da superclasse
       */
      super(nome);// chamada explícita ao construtor com um argumento superclasse. Se não colocar,
                  // o Java vai chamar implicitamente o construtor padrão "super();"
      this.comissao = comissao;
      this.vendas = vendas;
   }

   /* Esse método pagamento() tem ser implementado aqui na subclasse
    * OBRIGATORIAMENTE, pois ele foi declarado como abstract na superclasse */
   public double pagamento() {
      return (comissao / 100) * vendas;
   }

   // Esse método está sendo sobrescrito, pois já está implementado na superclasse.
   // Mas, se desejarmos uma implementação diferente, temos que sobrescrever -
   // "override method"no inglês
   public String toString() {
      /*
       * Para reutilizar o que já foi implementado neste método lá na superclasse,
       * deve-se chamar o método da superclasse precedido da palavra "super":
       */
      // Optamos por chamar o toString() da super classe (instrução super.toString())
      // e completar com o restante que queríamos. Lembre-se de que não é preciso usar
      // o método toString() explicitamente na maioria das situações, mas nesse caso,
      // não dá pra usar apenas a palavra "super" aqui.
      return super.toString() + " -  Pagamento Comissionado: " + pagamento();
   }

   public double getComissao() {
      return comissao;
   }

   public void setComissao(double comissao) {
      this.comissao = comissao;
   }

   public double getVendas() {
      return vendas;
   }

   public void setVendas(double vendas) {
      this.vendas = vendas;
   }

}
