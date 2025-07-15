/* @author Aline Silva Costa 
RESPOSTAS DA LISTA DE EXERCÍCIOS UNIDADE III

/*Respondendo às questões ...
Questão 5)a) Classe CD herda de Produto nome e preço, e possui número de faixas como atributo específico:*/
public class CD extends Produto {
   private int numeroFaixas;

   /*Questão 5- b)Evite ao máximo repetição de código utilizando a palavra super no construtor:*/
   public CD(String nome, double preco, int numeroFaixas, String codigoBarras) {
      super(nome, preco, codigoBarras);//usando super
      this.numeroFaixas = numeroFaixas;
   }

   public CD() {
   }
   
   /*Questão 6-a)	Sobrescreva o método toString() para que imprima:
    ii)	Para CDs: nome, preço e número de faixas;*/
   public String toString() {
      //Chamando super.toString() para evitar repetiçõ de código da superclasse
      return "\nCD: " + super.toString() + "\nNúmero de faixas: " + numeroFaixas;
   }

   public int getNumeroFaixas() {
      return numeroFaixas;
   }

   public void setNumeroFaixas(int numeroFaixas) {
      this.numeroFaixas = numeroFaixas;
   }

}
