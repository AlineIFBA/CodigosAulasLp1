package Heranca.aula05;
/**Declaramos a classe Empregado como ABSTRACT. Isso quer dizer que não podemos instanciar um objeto dessa classe, ou seja, não haverá na nossa aplicação nenhum Empregado "genérico", que não seja de um dos tipos das subclasses.
 * O construtor de Empregado, portanto, NUNCA PODERÁ SER CHAMADO com "new"
 */
public abstract class Empregado {
   //Com o modificador "protected", a variável "nome" será como public poara as subsclasses e como privada para outras classes. 
   protected String nome;

   public Empregado(){
      /*Esse construtor nunca será usado para instanciar um objeto Empregado, pois esta classe é abstract
       * Este construtor poderá (ou deverá, se outro construtor não for chamado) ser invocado pelas subsclasses, para REUTILIZAÇÃO da implementação.
       * Se nenhum construtor for chamado pelo programador na subclasse, o Java irá implicitamente chamar este construtor padrão antes de qualquer instrução dentro construtor da subclasse
       */

   }
   

   public Empregado(String nome) {
      this.nome = nome;
      /*Esse construtor nunca será usado para instanciar um objeto Empregado, pois esta classe é abstract
       * Este construtor poderá (ou deverá, se outro construtor não for chamado) ser invocado pelas subsclasses, para REUTILIZAÇÃO da implementação
       */
   }
  
   /* Esse método pagamento() é ABSTRACT, ou seja, ele não tem implementação, apenas a assinatura
   Um método abstract na superclasse faz com que as subclasses sejam OBRIGADAS A IMPLEMENTAR este método
   SÓ PODE TER MÉTODO ABSTRACT EM CLASSE ABSTRACT*/
   public abstract double pagamento();
   
   public String toString(){
      return "Empregado: "+nome;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

    public void imprimir(){
      System.out.println("Nome do empregado: "+nome);
   }

}
