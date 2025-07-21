package Heranca.Avaliacao3;

public abstract class Carro extends Veiculo {
   protected int ano;

   public Carro(int velocidade, int ano) {
      super(velocidade);
      this.ano = ano;
   }

   public abstract void acelerar();

   public int getAno() {
      return ano;
   }

   public void setAno(int ano) {
      this.ano = ano;
   }

   

  

   

}
