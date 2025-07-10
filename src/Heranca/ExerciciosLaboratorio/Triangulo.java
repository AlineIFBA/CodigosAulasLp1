package Heranca.ExerciciosLaboratorio;

public class Triangulo extends Forma{
    private int altura;

    public Triangulo(int base,int altura) {
        //super(); Chamada implícita
        this.base=base;
        this.altura = altura;
    }
    
       
    public void print(){
        System.out.println("\nTRIÂNGULO: ");
        int asteriscos=1;
        for (int linhas=1;linhas<altura;linhas++){
            for (int colunas=1;colunas<=asteriscos;colunas++)
                System.out.print("* ");
            System.out.println("");
            asteriscos++;
        }
           
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

}
