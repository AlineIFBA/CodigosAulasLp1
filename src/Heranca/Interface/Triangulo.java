package Heranca.Interface;

//Triangulo implementa a interface Figura, então deverá implementar os métodos area(), perimetro() e print()
public class Triangulo implements Figura {
   private double lado1;
   private double lado2;
   private double lado3;
   
   public double perimetro(){
    return lado1+lado2+lado3;
   }
   
   public double area(){
   // Area=raiz(p*(p-lado1)*(p-lado2)*(p-lado3)), onde p=metade do perímetro
    double p=perimetro()/2;
    return Math.sqrt(p*(p-lado1)*(p-lado2)*(p-lado3));    
   }
   
   public void print(){
       System.out.println("Sou triângulo");
   }
   
    public void verificarTriangulo(){
       if((lado1>(lado2+lado3)) || (lado2>(lado1+lado3)) || (lado3>(lado2+lado1)))
           System.out.println("Atenção! Isso não é um triangulo");
   }

   public Triangulo(double lado1, double lado2, double lado3) {
       this.lado1 = lado1;
       this.lado2 = lado2;
       this.lado3 = lado3;
   }
   
  
}