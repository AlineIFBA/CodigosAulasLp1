package IntroducaoPoo.ProvasAnteriores.Prova1b2024_2;


/**
 * 1. Implemente um método recursivo que calcule uma divisão inteira entre dois números inteiros
 * usando apenas a operação de subtração (Não usar /, % ou *). O método deve retornar um número
 * inteiro. Coloque o nome da classe que contém o método como Questao01.java (2,5)
 */
public class Questao1_Recursao {

   public static int divisaoInteira(int a, int b) {
      if (a < b) {
         return 0;
      } else if (b == 1) {
         return a;
      } else if (b == 0)//Para não dar erro de divisão por zero
      {
         return -1;
      } else {
         return 1 + divisaoInteira(a - b, b);
      }

   }

   public static void main(String[] args) {
      int n1 = 12;
      int n2 = 3;
      //n1=17;//n1=6;
      //n2=5;//n2=9;

      int div = divisaoInteira(n1, n2);

      System.out.println("Resultado da divisão de " + n1 + " por " + n2 + " = " + div);
   }

}