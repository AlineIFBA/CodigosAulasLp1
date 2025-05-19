package recursividade;
public class Repeticao {

     /*Exemplo - calcular o termo geral(an) da PA (3,6,9,12...),
    cuja razao é 3 e termo inicial (a1) é 3, com laço;
    n é a posição do termo na PA
     */
    public static int termoGeralPa_3Razao3(int n) {
        int an=3;
        for (int i=2;i<=n;i++)
            an=an+3;    
        return an;   
    }
    /* Exercício para calcular o termo geral(an)da PA (0,10,20,30...),
    cuja razao é 10 e termo inicial (a1) é 0, com laço;
    n é a posição do termo na PA
     */
     public static int termoGeralPa_0Razao10(int n) {
        int an=0;
        for (int i=2;i<=n;i++)
            an=an+10;    
        return an;       
    }

    /* Exercício para calcular o termo geral(an)da PA (-2, 1,4,7,...),
    cuja razao é 3 e termo inicial (a1) é -2, com laço;
    n é a posição do termo na PA
     */
    public static int termoGeralPa_2Razao3(int n){    
        int an=-2;
        for (int i=2;i<=n;i++)
            an=an+3;    
        return an;        
    }
    
     //Calcular fatorial de n com laço
    public static int fatorial (int n){
        int fat=1;
        for (int i=n; i>=1;i--)
            fat = fat*i;// igual a "fat*= i;"
        return fat;            
    }
    
     /* Calcular o termo geral(an)da sequência de Fibonacci, que é
    (1,1,2,3,5,8,13,21,34...). O primeiro termo é 1, o segundo termo
    também é 1, e an sempre é a soma dos dois anteriores - com laço */
    public static long fibonacci(int n) { 
        long a1=1;
        long a2=1;
        long an=a2;
        for (int i=3;i<=n;i++){
            an=a1+a2;
            a1=a2;
            a2=an;           
        }
        return an;     
    }
    
    //Calcula multiplicação de dois números inteiros positivos
 public static int mult(int m, int n){
    int mult=0;
    for (int i=1; i<=n; i++)
        mult+= m;
    return mult;
 } 
    
//Calcula a soma de n números inteiros
 public static int somaNInteiros(int n){
    int soma=0;
    for (int i=1;i<=n;i++){
        soma+=i;
    }
    return soma;
 }    
    
  
/* Exercício para calcular o termo geral(an)de qualquer PA 
(a1,a1+r,a2+r,a3+r...), cuja razao é o valor da variável "r" 
e termo inicial (a1) é o valor da variável "a1", com laço;
n é a posição do termo na PA*/
    public static int termoGeralPA(int a1, int r, int n) {
        int an=a1;
        for (int i=2;i<=n;i++)
            an=an+r;    
        return an;
    }
    
/* Exercício para calcular o termo geral(an)de qualquer PG 
 (a1,a1*r,a2*r,a3*r...), cuja razao é o valor da variável "r" 
 e termo inicial (a1) é o valor da variável "a1", com laço;
 n é a posição do termo na PG*/
    public static int termoGeralPG(int a1, int r, int n) {
        int an=a1;
        for (int i=2;i<=n;i++)
            an=an*r;    
        return an;
    }
    
    
    /* Exercício para calcular o resultado de um número
    inteiro "a" elevado à potência de valor "b" com laço*/
    public static int potenciacao(int a, int b) {
        if (b==0)
            return 1;
        else{
            int pot=1;
            for (int i=1;i<=b;i++)
                pot = pot * a;
       
            return pot;
        }
    }
    
/* Exercício para calcular a soma dos termos(Sn)de qualquer PA 
(a1,a1+r,a2+r,a3+r...), cuja razao é o valor da variável "r" 
e termo inicial (a1) é o valor da variável "a1", com laço;
n é a posição do termo na PG*/
    public static int somaPA(int a1, int r, int n) {
    /*Nessa versão iterativa, podemos chamar o método termoGeralPA
    que já foi implementado e vai acrescentando
    o valor de cada termo à vari´vel "soma"*/    
        int an=a1;
        int soma=0;
        for (int i=2;i<=n;i++){
            soma = soma + termoGeralPA(a1, r, i);
        }
        
        
        /*OU ... já poderíamos calcular termo geral e a soma
        com laços aninhados,como o código  comentado abaixo*/       
//     for (int i=2;i<=n;i++){
//        for (int j=2;j<=i;j++){
//            an = an + r;
//        }
//        soma = soma + an;
//     } 

       return soma;
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
    intervalo [m,n] (de m a n), com laço;*/
    public static int somaIntervaloMN(int m, int n) {
        int soma=0;
        
        /*Implementação de forma CRESCENTE (i começa igual 
        a "m", e vai aumentando até chegar ao valor de n */
        for (int i=m;i<=n;i++)
            soma+=i;
        
         /* se m for um número maior que n, o laço nunca 
        será V e, por isso, vai retornar 0.*/
        return soma;
            
    }
    
     /*OPÇÃO 2 -  Exercício para calcular a soma dos números inteiros no
    intervalo [m,n] (de m a n), com laço;*/
    public static int somaIntervaloMN2(int m, int n) {
        int soma=0;
        
        /*Implementação de forma DECRESCENTE (i começa igual 
        a "n", e vai diminuindo até chegar ao valor de m */
        for (int i=n;i>=m;i--)
            soma+=i;
        
         /* se m for um número maior que n, o laço nunca 
        será V e, por isso, vai retornar 0.*/
        return soma;
            
    }
    
    /* = = = = = PA e PG com fórmulas = = = = = */
    public static int termoGeralPA_formula(int a1, int r, int n) {
        return a1+(n-1)*r;//fórmula de termo geral da PA
    }
    
    public static int somaPA_formula(int a1, int r, int n) {
        int an= termoGeralPA_formula(a1, r, n);// calcula an (o termo geral)
        return ((a1+an)*n)/2;//fórmula de soma dos termos da PA
    }
    
    public static int termoGeralPG_formula(int a1, int r, int n) {
        return  (int)(a1*(Math.pow(r,n-1)));//fórmula de termo geral da PG
    }
    public static int somaPG_formula(int a1, int r, int n) {
        return  (int)((a1*(Math.pow(r,n)-1))/(r-1));//fórmula de soma dos termos da PG
    }
}