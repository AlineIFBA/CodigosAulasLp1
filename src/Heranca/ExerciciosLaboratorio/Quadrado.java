package Heranca.ExerciciosLaboratorio;

public class Quadrado extends Forma {
    
    public Quadrado(int base){
        this.base=base;
        
    }
    
    public void print(){
       System.out.println("\nQUADRADO: ");
        for (int linhas=1;linhas<=base;linhas++){
            for (int asteriscos=1;asteriscos<=base;asteriscos++)
                System.out.print("* ");
            System.out.println("");
        }
    }
}

