package Heranca.aula06;

import java.util.Arrays;

public class QuadradoMain {
 public static void main(String[] args) {
        
        Quadrado a=new Quadrado(4);
        Quadrado b=new Quadrado(4);
        Triangulo t=new Triangulo(3, 4, 5);
        Quadrado c=a;//c é uma outra referência para o objeto "a", ou seja, "a" e "c" são o mesmo objeto


        System.out.println("-------------Os testes abaixo são feitos com o operador ==, que só é avaliado como true se os operandos comparados forem o mesmo objeto-------------");
        if (a==b)// será avaliado como false
            System.out.println("Os objetos a e b são iguais com ==");
        else
            System.out.println("Os objetos a e b NÃO são iguais com ==");
        
         if (a==c)// será avaliado como true
            System.out.println("Os objetos a e c são iguais com ==");
        else
            System.out.println("Os objetos e e c NÃO são iguais com ==");



        System.out.println("-------------Os testes abaixo são feitos com o método equals depois do override na classe Quadrado. O método retorna true se os objetos comparados forem dois Quadrados com o mesmo valor de lado -------------");    
        if (a.equals(b))
            System.out.println("Comparação com equals () - a e b são quadrados iguais ");
         else
            System.out.println("Comparação com equals () - a e b NÃO são quadrados iguais ");

         if (a.equals(c))
            System.out.println("Comparação com equals () -a e c são quadrados iguais ");
         else
            System.out.println("Comparação com equals () - a e c NÃO SÃO quadrados iguais ");

        if (a.equals(t))
            System.out.println("Comparação com equals () -Quadrado a e Triângulo t são iguais ");
         else
            System.out.println("Comparação com equals () - Quadrado a e Triângulo t NÃO SÃO iguais (não são nem  da mesma classe)");
        if (a.equals(null))
            System.out.println("Comparação com equals () -Quadrado a e null são iguais ");
         else
            System.out.println("Comparação com equals () - Quadrado a e null NÃO SÃO iguais");

        System.out.println("-------------Os testes abaixo são feitos com o método compareTo implementado na classe Quadrado. O método retorna um número inteiro conforme implementamos -------------"); 
        if ((a.compareTo(b))==0)
            System.out.println("Os quadrados têm lados iguais ");
        else if ((a.compareTo(b))>0)
            System.out.println("\'a\' tem lado maior que \'b\'");
        else if ((a.compareTo(b))==-1)
            System.out.println("\'a\' tem lado menor que \'b\'");
        
    
        //Array q de tamanho 3, do tipo Quadrado
        Quadrado q[]=new Quadrado[3];
        q[0]=new Quadrado(3);//Instanciamos um quadrado de lado 3 e atribuímos à referência q[0]
        q[1]=new Quadrado(2);//Instanciamos um quadrado de lado 2 e atribuímos à referência q[1]
        q[2]=new Quadrado(1);//Instanciamos um quadrado de lado 1 e atribuímos à referência q[2]
       
       
        System.out.println("ANTES DE ORDENAR:");        
        for (Quadrado qd:q) //esse laço vai imprimir 3,2,1
        {
            System.out.println("Lado do quadrado: "+qd.getLado()); 
        }
        // Ordenar o aray:
        Arrays.sort(q);//Só pode ordenar se implementar Comparable
        System.out.println("DEPOIS QUE ORDENAR:");
        for (Quadrado qd:q)//esse laço vai imprimir 1,2,3
        {
            System.out.println("Lado do quadrado: "+qd.getLado());
        }
         
    }
    
}