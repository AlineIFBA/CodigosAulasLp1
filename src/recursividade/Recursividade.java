package recursividade;

//Exemplos e exercícios de recursividade
public class Recursividade {

  
/* Exemplo - calcular o termo geral(an) da PA (3,6,9,12...),
cuja razao é 3 e termo inicial (a1) é 3, com recursão;
n é a posição do termo na PA   */
    public static int termoGeralPa_3Razao3(int n) {
        if (n == 1)//caso base     
            return 3;
        else 
            return termoGeralPa_3Razao3(n - 1) + 3;       
    }
    
/* Exercício para calcular o termo geral(an)da PA (0,10,20,30...),
    cuja razao é 10 e termo inicial (a1) é 0, com recursão;
    n é a posição do termo na PA */
    public static int termoGeralPa_0Razao10(int n) {
        if (n == 1)//caso base        
            return 0;
        else 
            return termoGeralPa_0Razao10(n - 1) + 10;        
    }

/* Exercício para calcular o termo geral(an)da PA (-2, 1,4,7,...),
cuja razao é 3 e termo inicial (a1) é -2, com recursão;
n é a posição do termo na PA  */
    public static int termoGeralPa_2Razao3(int n) {
        if (n == 1)//caso base
            return -2;
        else 
            return termoGeralPa_2Razao3(n - 1) + 3;        
    }
    
//Exemplo - Calcular fatorial de n com recursão
    public static int fatorial(int n) {
        if (n == 1) 
            return 1;//caso base
        else 
            return n * fatorial(n - 1);
    }
    
/* Calcular o termo geral(an)da sequência de Fibonacci, que é
(1,1,2,3,5,8,13,21,34...). O primeiro termo é 1, o segundo termo
também é 1, e an sempre é a soma dos dois anteriores- com recursão */
    public static long fibonacci(long n) {
        if (n == 1 || n == 2) //casos base - a1 e a2 são iguais a 1
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);//soma dos dois termos anteriores
    }

//Calcula multiplicação de dois números inteiros positivos
 public static int mult(int m, int n){
    if (n==1)
        return m;
    else
        return m + mult (m,n-1);
 } 
 
//Calcula a soma de n números inteiros
 public static int somaNInteiros(int n){
    if (n==1)
        return 1;
    else
        return n + somaNInteiros (n-1);
 }  
 

/* Exercício para calcular o termo geral(an)de qualquer PA 
(a1,a1+r,a2+r,a3+r...), cuja razao é o valor da variável "r" 
e termo inicial (a1) é o valor da variável "a1", com recursão;
n é a posição do termo na PA */
    public static int termoGeralPA(int a1, int r, int n) {
        if (n == 1)//caso base
            return a1;
        else 
            return termoGeralPA(a1, r, n - 1) + r;
    }
 
/* Exercício para calcular o termo geral(an)de qualquer PG 
(a1,a1*r,a2*r,a3*r...), cuja razao é o valor da variável "r" 
e termo inicial (a1) é o valor da variável "a1", com recursão; 
n é a posição do termo na PG*/
    public static int termoGeralPG(int a1, int r, int n) {
        if (n==1)
            return a1;
        else
            return termoGeralPG(a1,r,n-1)*r;
    }
    
    
/* Exercício para calcular o resultado de um número
 inteiro "a" elevado à potência de valor "b" com recursão*/
    public static int potenciacao(int a, int b) {
        if (b==0)//primeiro caso base
            return 1;//qualquer número elevado a 0 é 1.
        if (b==1)//segundo caso base
            return a;//qualquer número elevado a 1 é ele mesmo.
       
        /*passo recursivo (só chega até essa linha se os 
        dois "if" anteriores foram false*/
        return a*potenciacao(a,b-1);
    }
    
/* Exercício para calcular a soma dos termos(Sn)de qualquer PA 
(a1,a1+r,a2+r,a3+r...), cuja razao é o valor da variável "r" 
e termo inicial (a1) é o valor da variável "a1", com recursão;
n é a posição do termo na PG*/
    public static int somaPA(int a1, int r, int n) {
        if (n==1)
            return a1;
        else
            return termoGeralPA(a1,r,n-1)+somaPA(a1,r,n-1);
    }
    
/* Exercício para calcular a soma dos termos(Sn)de qualquer PG 
(a1,a1*r,a2*r,a3*r...), cuja razao é o valor da variável "r" 
e termo inicial (a1) é o valor da variável "a1", com recursão;
n é a posição do termo na PG*/
    public static int somaPG(int a1, int r, int n) {
        if (n==1)
            return a1;
        else
            return termoGeralPG(a1,r,n-1)+somaPG(a1,r,n-1);
    }
    
/* Exercício para calcular a soma dos números inteiros no
    intervalo [m,n] (de m a n), com recursão;*/
    public static int somaIntervaloMN(int m, int n) {
        /* se m for um número maior que n, vai retornar 0.*/
        if (m > n)// ou if (n < m)
            return 0;
        else if (m==n)
            return m;//ou return n, tanto faz
        else
            /*Implementação de forma CRESCENTE (m vai aumentando
            até chegar ao valor de n */
            return m+somaIntervaloMN(m+1,n);
    }
    
    /* OPÇÃO 2 - Exercício para calcular a soma dos números inteiros no
    intervalo [m,n] (de m a n), com recursão; */
    public static int somaIntervaloMN2(int m, int n) {
        /* se m for um número maior que n, vai retornar 0.*/
        if (n < m) // ou if (m>n)
            return 0;
        else if (m==n)
            return m;//ou return n, tanto faz
        else
            /*Implementação de forma DECRESCENTE (n vai diminuindo
            até chegar ao valor de m */
            return n + somaIntervaloMN2(m,n-1);
    }
}
