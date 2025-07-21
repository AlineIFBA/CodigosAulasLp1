package Heranca.Avaliacao3;

public class CarroInteligente extends Carro {

   public CarroInteligente (int velocidade, int ano){
      super(velocidade, ano);
   }

   public void acelerar(){
      velocidade++;
   }

   public void estacionar(){
      System.out.println("Estacionar carro inteligente");
   }

}
