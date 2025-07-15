package Heranca.Interface;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuadradoMain {
   public static void main(String[] args) {
      
   
   Quadrado q1=new Quadrado(8);
   Quadrado q2=new Quadrado(2);
   Quadrado q3=new Quadrado(1);

   Figura figuras[]=new Figura[3];
   figuras[0]=q1;
   figuras[1]=q2;
   figuras[2]=q3;

   for (Figura f:figuras){
      Quadrado qd=(Quadrado)f;
      System.out.println("Lado:"+qd.getLado()+ "   Área: "+f.area());
   }
      

   Arrays.sort(figuras);
   
   System.out.println("\nDEPOIS DA ORDENAÇÃO:\n");
    for (Figura f:figuras){
      Quadrado qd=(Quadrado)f;
      System.out.println("Lado:"+qd.getLado()+ "  Área: "+f.area());
   }
}



}
