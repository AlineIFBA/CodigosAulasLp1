/* @author Aline Silva Costa 
RESPOSTAS DA LISTA DE EXERCÍCIOS UNIDADE III

/*Respondendo às questões ...
Questão 5)a) Classe DVD herda de Produto nome e preço, e possui duração como atributo específico:*/
public class DVD extends Produto {

   private int duracao;

   /*Questão 5- b)Evite ao máximo repetição de código utilizando a palavra super no construtor:*/
   public DVD(String nome, double preco, int duracao, String codigoBarras) {
      super(nome, preco, codigoBarras);
      this.duracao = duracao;

   }

   public DVD() {

   }

   /*Questão 6-a)Sobrescreva o método toString() para que imprima:
   iii)	Para DVDs: nome, preço e duração.*/
   public String toString() {
      return "\nDVD: " + super.toString() + "\nDuração: " + duracao;
   }

   public int getDuracao() {
      return duracao;
   }

   public void setDuracao(int duracao) {
      this.duracao = duracao;
   }

}

