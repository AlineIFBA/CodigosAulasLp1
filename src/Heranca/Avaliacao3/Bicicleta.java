package Heranca.Avaliacao3;

public class Bicicleta extends Veiculo{
   private int marchas;

   public Bicicleta(int velocidade, int marchas) {
      super(velocidade);
      this.marchas = marchas;
   }

   /*Questão 1f)*/
   @Override
   public void frear(){
      super.frear();
      super.frear();
      /* Também poderia ser 
       velocidade--;
       velocidade--;
       Mas o ideal é chamar o código que puder ser reutilizado da superclasse e não repeti-lo
       */

   }

   public int getMarchas() {
      return marchas;
   }

   public void setMarchas(int marchas) {
      this.marchas = marchas;
   }

   

   



}
