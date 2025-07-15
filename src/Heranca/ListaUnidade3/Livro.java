/* @author Aline Silva Costa 
RESPOSTAS DA LISTA DE EXERCÍCIOS UNIDADE III

/*Respondendo às questões ...
Questão 5)a) Classe Livro herda de Produto nome e preço, e possui autor como atributo específico:*/
public class Livro extends Produto {

   private String autor;

   /*Questão 5- b)Evite ao máximo repetição de código utilizando a palavra super no construtor:*/
   public Livro(String nome, double preco, String autor, String codigoBarras) {
      super(nome, preco, codigoBarras);
      this.autor = autor;

   }

   public Livro() {
   }
   
   /*Questão 6-a)Sobrescreva o método toString() para que imprima:
   i)Para livros: nome, preço e autor;*/
   public String toString() {
      return "\nLIVRO: " + super.toString() + "\nAutor: " + autor;
   }

   public String getAutor() {
      return autor;
   }

   public void setAutor(String autor) {
      this.autor = autor;
   }

}
