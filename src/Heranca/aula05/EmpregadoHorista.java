package Heranca.aula05;

public class EmpregadoHorista extends Empregado {
   private double valorHora;
   private int horasTrabalhadas;

  public EmpregadoHorista(String nome, double valorHora, int horasTrabalhadas) {
      super(nome);
      this.valorHora = valorHora;
      this.horasTrabalhadas = horasTrabalhadas;
   }

   public double pagamento(){
      return valorHora*horasTrabalhadas;
   }
   public double getValorHora() {
      return valorHora;
   }
   public void setValorHora(double valorHora) {
      this.valorHora = valorHora;
   }
   public int getHorasTrabalhadas() {
      return horasTrabalhadas;
   }
   public void setHorasTrabalhadas(int horasTrabalhadas) {
      this.horasTrabalhadas = horasTrabalhadas;
   }

   public String toString(){
      return super.toString()+" - Pagamento Horista: "+pagamento();
   }

}
