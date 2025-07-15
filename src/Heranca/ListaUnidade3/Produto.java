import java.util.Scanner;
/* @author Aline Silva Costa 
RESPOSTAS DA LISTA DE EXERCÍCIOS UNIDADE III
 
5)
a)Sobrescreva o método toString() para que imprima:
   i)Para livros: nome, preço e autor;
   ii)Para CDs: nome, preço e número de faixas;
   iii)Para DVDs: nome, preço e duração.
b)Evite ao máximo repetição de código utilizando a palavra super no construtor e no método sobrescrito. Em seguida, crie uma classe Loja com o método main() que adicione 5 produtos diferentes (a sua escolha) a um vetor (vetor de referências da superclasse), por fim, imprima o conteúdo do vetor (usando o laço para coleções)


/*Respondendo às questões ...

Questão 5)Superclasse Produto com as variáveis de instância comuns a todos os produtos (nome, preço e codigo de barras):
Questão 7) Produtoi deve implementar Comparable*/
public class Produto implements Comparable<Produto> {

   protected String nome;
   protected double preco;
   /*Questão 6- a)Atributo codigoBarras do tipo String adicionado:*/
   protected String codigoBarras;

   public Produto(String nome, double preco, String codigoBarras) {
      this.nome = nome;
      this.preco = preco;
      this.codigoBarras = codigoBarras;
   }

   /*Questão 6-a) Solicitando que o código de barras seja fornecido dentro do construtor default, já que é um valor obrigatório e, portanto, deve ser preenchido:*/
   public Produto() {
      Scanner input = new Scanner(System.in);
      System.out.println("Digite o código de barras");
      codigoBarras = input.next();
      input.close();
   }

   /*Sobrescrevendo o método toString():*/
   public String toString() {
      return "\nTítulo: " + nome + "\nPreço: " + preco;
   }

   /*6-b)Sobrescreva o método equals() (herdado da classe Object) retornando true se dois produtos possuem o mesmo código de barras; Assinatura do método equals: public boolean equals(Object obj)*/
   //Método equals() para JDK mais antigo:
   public boolean equals(Object obj) {
      if (obj instanceof Produto) {
         Produto p = (Produto) obj;
         if (p.codigoBarras.equals(this.codigoBarras)) {
            return true;
         }
      }
      return false;
   }

   /*Questão 7)Produto deve implementar a comparação por nome:
   Método foi comentado para permitir a alteração do código comparando por preço, como pede a questão depois*/
//   public int compareTo(Produto p) {
//      if (p !=null) {
//         if (p.nome.equals(this.nome)) 
//            return 0;
//         if (this.nome.compareTo(p.nome) < 0) 
//            return -1;
//         if (this.nome.compareTo(p.nome) > 0) 
//            return 1;
//      }
//      return -1;
//   }

/*Questão 7)Produto deve implementar a comparação por nome:*/
   public int compareTo(Produto p) {
      if (p !=null) {         
         if (p.preco == this.preco) 
            return 0;
         if (this.preco < p.preco) 
            return -1;
         if (this.preco > p.preco) 
            return 1;
      }
      return -1;
   }
 
   /*MÉTODOS GET E SET:*/
   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public double getPreco() {
      return preco;
   }

   public void setPreco(double preco) {
      this.preco = preco;
   }

   public String getCodigoBarras() {
      return codigoBarras;
   }

   public void setCodigoBarras(String codigoBarras) {
      this.codigoBarras = codigoBarras;
   }
 
}
