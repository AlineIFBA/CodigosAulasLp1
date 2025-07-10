package Heranca.ExerciciosLaboratorio;

public class Retangulo extends Forma{
    private int altura;
    
    public Retangulo(int base, int altura){
        this.base=base;
        this.altura=altura;
    }
    public void print(){
        System.out.println("\nRETÂNGULO: ");
        for (int linhas=1;linhas<=altura;linhas++){
            for (int asteriscos=1;asteriscos<=base;asteriscos++)
                System.out.print("* ");
            System.out.println("");
        }
            
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
}

