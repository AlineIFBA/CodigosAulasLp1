package Heranca.aula05;

public class EmpregadoBase extends Empregado{
   private double salarioBase;

   public EmpregadoBase(String nome, double salarioBase){
      super(nome);
      //this.nome=nome;
      this.salarioBase=salarioBase;

   }

   public double pagamento(){
      return salarioBase;

   }
   public double getSalarioBase() {
      return salarioBase;
   }

   public void setSalarioBase(double salarioBase) {
      this.salarioBase = salarioBase;
   }

   @Override
   public void imprimir(){
      super.imprimir();
      System.out.println("Salário base: "+salarioBase);

   }

   public String toString(){
      return super.toString()+"  -  Pagamento Salário Base: "+pagamento();
   }

   

  

   

}
