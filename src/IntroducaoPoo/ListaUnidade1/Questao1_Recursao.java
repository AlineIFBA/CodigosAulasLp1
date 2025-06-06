package IntroducaoPoo.ListaUnidade1;

import java.util.Scanner;
/* Resposta da Questão 1 da lista de Exercícios 1
Professora: Aline Silva Costa  */
public class Questao1_Recursao {

/*Elabore métodos recursivos para:
a.Verificar se uma palavra é palíndroma ou não. Retorno: boolean
b.Calcular o MMC de dois números inteiros
c.Calcular o MDC de dois números inteiros pelo algoritmo de Euclides
d.Converter um número inteiro em binário. Retorno: String*/

 /*O MÉTODO MAIN ESTÁ NESTE ARQUIVO MESMO, ABAIXO DO CÓDIGO DE TODOS OS MÉTODOS:*/
    public static boolean palindroma(String palavra) {
        if (palavra.length() == 1) {//CASO BASE
            return true;
        } 
        else if (palavra.length() == 2) { //CASO BASE
            return (palavra.charAt(0) == palavra.charAt(palavra.length() - 1));
        } 
        else if (palavra.charAt(0) == palavra.charAt(palavra.length() - 1)) {
            return true && palindroma(palavra.substring(1, palavra.length() - 1));
        }

        return false;
    }
    

    public static int mmc(int a, int b) {
        return mmc(a, b, 2);

    }

    private static int mmc(int a, int b, int primo) {

        if (a == 1 && b == 1) {
            return 1;
        }
        if (a % b == 0) {
            return a;
        }
        if (b % a == 0) {
            return b;
        }
        if ((a % primo == 0) && (b % primo == 0)) {
            return primo * mmc(a / primo, b / primo, primo);
        }
        if (b % primo == 0) {
            return primo * mmc(a, b / primo, primo);
        }
        if (a % primo == 0) {
            return primo * mmc(a / primo, b, primo);
        }

        return mmc(a, b, proximoPrimo(primo));

    }

    public static int proximoPrimo(int primo) {
        int n = primo + 1;
        while (!primoRecursivo(n)) {
            n++;
        }
        return n;
    }

    private static boolean primoRecursivo(int n) {
        return primoRecursivo(n, 2);

    }

    private static boolean primoRecursivo(int n, int div) {
        if (n == 2 || n == 1 || n == 3) {
            return true;
        }
        if (n == div) {
            return true;
        }
        if (n % div != 0) {
            return true && primoRecursivo(n, div + 1);
        } else {
            return false;
        }
    }

    public static boolean primoIterativo(int n) {
        for (int i = 4; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int mdcEuclides(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mdcEuclides(b, a % b);
        }
    }

    public static String decimalParaBinario(int n) {
        if (n < 2) {
            return "" + n;// Concatenando uma string vazia com "n"para que o Java force a conversão de n para String.
        } // Também poderia chamar o método da classe Integer que converte inteiro para String: return Integer.toString(n);
        else {
            return decimalParaBinario(n / 2) + (n % 2);// esse + é de concatenação e não de soma
        }

    }

    public static void main(String argumentos[]) {
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        //String palavra=entradaTeclado.next();        
        String palavra = "aba";
        palavra = "arara";
        //palavra="abba";
        if (palindroma(palavra)) {
            System.out.println("A palavra " + palavra + " é palíndroma");
        } else {
            System.out.println("A palavra " + palavra + " NÃO é palíndroma");
        }

//        System.out.println("Digite um número inteiro");
//        int n1=entradaTeclado.nextInt();       
//        System.out.println("Digite outro número inteiro");
//        int n2=entradaTeclado.nextInt();
//        
//        System.out.println("O MMC de "+n1+" e "+n2 +" é "+mmc(n1,n2));
//        System.out.println("O MDC de "+n1+" e "+n2 +" é "+mdcEuclides(n1,n2));
//       
//        System.out.println("O número "+n1+" convertido para binário é "+decimalParaBinario(n1));         
//        System.out.println("O número "+n2+" convertido para binário é "+decimalParaBinario(n2));         
//        
    }
}

