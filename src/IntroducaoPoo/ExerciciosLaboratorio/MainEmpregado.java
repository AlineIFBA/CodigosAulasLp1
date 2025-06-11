package IntroducaoPoo.ExerciciosLaboratorio;

public class MainEmpregado {
   public static void main(String[] args) {
      
   
   
   Computador c1=new Computador(128, 1024, "Core i9-14900K");

   Empregado e1=new Empregado("Uzias", c1);
   Empregado e2=new Empregado("Efraim",256,512,"Core i7-13700K");
   Empregado e3=new Empregado("Matusalém", null);
   Empregado e4=new Empregado("Dalila", null);

   //e3.comprar(); Método privado, não pode ser chamado
   e3.setPc(); //Atribui um novo computador a e3

   Empregado.transferir(e1,e2);//Transfere o computador de e1 para e2, e atribui um novo computador ao pc de e1
   e3.transferir(e4); //Transfere o computador de e3 para e4, e atribui um novo computador ao pc de e3

   Empregado.change(e1, e3);//Troca os computadores de e1 e e3

   }

}
