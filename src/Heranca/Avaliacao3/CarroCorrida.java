package Heranca.Avaliacao3;

public class CarroCorrida extends Carro {

   public CarroCorrida (int velocidade, int ano){
      super(velocidade, ano);
   }

   public void acelerar(){
      velocidade+=5;
   }


}
