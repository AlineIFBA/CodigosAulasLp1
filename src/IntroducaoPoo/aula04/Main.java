package IntroducaoPoo.aula04;

public class Main {
   public static void main(String[] args) {
   TipoConta tipo1=TipoConta.ESPECIAL;
   Cliente c1=new Cliente("Danilo","12345");
   Conta conta1=new Conta(1,c1,tipo1);
   
   //método ordinal() retorna o inteiro equivalente
   System.out.println("Valor do tipo1:"+tipo1+" INteiro equivalente: "+tipo1.ordinal());
   tipo1=TipoConta.SIMPLIFICADA;
   System.out.println("Valor do tipo1:"+tipo1+" INteiro equivalente: "+tipo1.ordinal());


    if (tipo1==TipoConta.ESPECIAL)
      System.out.println("É especial");

      
     
}
}
