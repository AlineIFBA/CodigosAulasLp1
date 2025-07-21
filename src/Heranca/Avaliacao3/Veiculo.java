package Heranca.Avaliacao3;

public class Veiculo {
   protected int velocidade;

   public Veiculo(int velocidade) {
      this.velocidade = velocidade;
   }

   public void frear(){
      velocidade--;
   }

   public int getVelocidade() {
      return velocidade;
   }

   public void setVelocidade(int velocidade) {
      this.velocidade = velocidade;
   }

   
   

}
