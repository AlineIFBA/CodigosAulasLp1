package Heranca.ExerciciosLaboratorio;


public class FormaTeste {
    public static void main(String[] args) {
        Triangulo t=new Triangulo(5,5);
//        t.print();
        Retangulo r=new Retangulo(3,4);
//        r.print();
        Quadrado q=new Quadrado(7);
//        q.print();
        
        Forma formas[]=new Forma[3];//Criando 3 referências a Formas
        formas[0]=t;
        formas[1]=r;
        formas[2]=q;
        
        for (Forma f:formas){
         f.print();//Comportamento polimórfico
         if (f instanceof Triangulo){
            Triangulo tri=(Triangulo)f;
            System.out.println(tri.area());
         }

        }
            
   
    }
    
}
