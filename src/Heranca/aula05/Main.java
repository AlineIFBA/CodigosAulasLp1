package Heranca.aula05;

public class Main {
   public static void main(String[] args) {

   //Empregado e1= new Empregado("Joana"); Não permitido criar objeto de classe abstrata
   EmpregadoBase eb1=new EmpregadoBase("Paola", 2200);
   eb1.imprimir();
   EmpregadoHorista eh1=new EmpregadoHorista("Juliana", 30, 220);
   EmpregadoComissionado ec1= new EmpregadoComissionado("Carlos", 15, 20000);

   Empregado[] empregados=new Empregado[3];
   empregados[0]=eb1;
   empregados[1]=eh1;
   empregados[2]=ec1;

   for (Empregado e:empregados)
      System.out.println(e.toString());//POLIMORFISMO

   //System.out.println(eb1.toString());
   //System.out.println(eh1);
   //System.out.println(ec1);
      
   }

}
