package IntroducaoPoo.ProvasAnteriores.Prova1a2024_2;

/**
 * 3. Implemente um método recursivo que calcule a soma de uma lista de números passada como String.
 * Exemplo: a String “146783” será uma lista dos números 1,4,6,7,8 e 3 para serem somados (2,0)
 * Método charAt(i) da classe String obtém o caracter da posição i Método substring(i) da classe
 * String obtém a substring da posição i até o final da String Método substring(i,j) da classe
 * String obtém a substring da posição 1 até a posição j-1 Método length() da classe String obtém o
 * tamanho da String
 */
public class Questao3_Recursao {

   public static int somaLista(String lista) {
      if (lista.length() == 0) {
         return 0;
      } else if (lista.length() == 1) {
         return Integer.parseInt(lista);
      } else {
         return Integer.parseInt(lista.substring(0, 1)) + somaLista(lista.substring(1));
      }
      // OU: return Integer.parseInt(Character.toString(lista.charAt(0)))+somaLista(lista.substring(1));

   }

   public static void main(String[] args) {
      int soma = somaLista("123456");
      System.out.println("A soma é: " + soma);
   }

}