import java.util.Arrays;
/* @author Aline Silva Costa RESPOSTAS DA LISTA DE EXERCÍCIOS UNIDADE III
 
Questão 5-b)Crie uma classe Loja com o método main() que adicione 5 produtos diferentes (à sua escolha) a um vetor (vetor de referências da superclasse), e por fim, imprima o conteúdo do vetor (usando o laço para coleções)*/
public class Loja {

   public static void main(String[] args) {

      //Vetor de referências da superclasse Produto:
      Produto produtos[] = new Produto[5];

      //Adicionando 5 produtos diferentes:
      produtos[0] = new Livro("Java", 200, "Deitel", "123");
      produtos[1] = new CD("Diante do Trono", 20, 12, "456");
      produtos[2] = new DVD("Pequeno Príncipe", 80, 90, "789");
      produtos[3] = new Livro("C++", 100, "Viviane", "1011");
      produtos[4] = new CD("Avivah", 25, 15, "1213");

      System.out.println("\n\nImprimindo ANTES da ordenação:");
      //Imprimindo o conteúdo do vetor usando o laço para coleções:
      for (Produto p : produtos) {
         System.out.println(p);
      }

      /*Questão 7) Ao final do método Loja.main(), ordene o vetor utilizando o método java.util.Arrays.sort() e imprima-o novamente. 
Depois altere a implementação da comparação na classe Produto, para ordenar por preço e execute o main() novamente para verificar a diferença no resultado:*/
      Arrays.sort(produtos);//Ordenando o vetor de produtos
      System.out.println("\n\nImprimindo novamente DEPOIS da ordenação:");
      for (Produto p : produtos) {
         System.out.println(p);
      }

      /*Questão 6d)Após a impressão do vetor (feita acima), escolha um dos 5 produtos e crie duas novas instâncias idênticas a ele: uma com o mesmo código de barras e outra com o código diferente. Efetue a busca deste produto no vetor utilizando as duas instâncias e verifique o resultado:*/
      
      Produto outroCD = new CD("Diante do Trono", 20, 12, "456");//criando outro CD com mesmos valores que o produtos[1], inclusive o mesmo código de barras 
      buscaProduto(produtos, outroCD);//Usando método buscaProduto (implementado abaixo) para verificar se o vetor produtos contém o mesmo CD que outroCD.
      Produto outroDVD = new DVD("Pequeno Príncipe", 80, 90, "788");//criando outro DVD com mesmos valores que o produtos[2], com exceção do vódigo de barras
      buscaProduto(produtos, outroDVD);//Usando método buscaProduto para verificar se o vetor produtos contém o mesmo DVD que outroDVD.

   }

   /*Questão 6-c) Na classe Loja, implemente um simples procedimento de busca que, dado um produto e um vetor de produtos, indique em que posição do vetor se encontra o produto especificado ou imprima que o mesmo não foi encontrado; Usar o método equals para comparar a igualdade entre produtos: */
   public static void buscaProduto(Produto produtos[], Produto produto) { //Método recebe um produto e um vetor de produtos
      for (int i = 0; i < produtos.length; i++) {
         if (produtos[i].equals(produto)) { //Usando método equals para comparar os produtos
            System.out.println("O produto " + produto.getCodigoBarras() + " foi encontrado na posição: " + i);
            return;
         }
      }
      System.out.println("O produto " + produto.getCodigoBarras() + " não foi encontrado");

   }

}

