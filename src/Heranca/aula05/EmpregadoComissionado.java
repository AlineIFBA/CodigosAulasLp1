package Heranca.aula05;

public class EmpregadoComissionado extends Empregado{
   private double comissao;
   private double vendas;

   
   public EmpregadoComissionado(String nome, double comissao, double vendas) {
      super(nome);
      this.comissao = comissao;
      this.vendas = vendas;
   }

   public double pagamento(){
      return (comissao/100)*vendas;
   }
   public double getComissao() {
      return comissao;
   }
   public void setComissao(double comissao) {
      this.comissao = comissao;
   }
   public double getVendas() {
      return vendas;
   }
   public void setVendas(double vendas) {
      this.vendas = vendas;
   }

   public String toString(){
      return super.toString()+" -  Pagamento Comissionado: "+pagamento();
   }
   

}
