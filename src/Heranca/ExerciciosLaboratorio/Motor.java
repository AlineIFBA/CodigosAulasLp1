package Heranca.ExerciciosLaboratorio;

public class Motor {
    private int numCilindro;
    private int potencia;

    public Motor(int numCilindro, int potencia) {
        this.numCilindro = numCilindro;
        this.potencia = potencia;
    }
    
    public Motor(){
    
    }

    public int getNumCilindro() {
        return numCilindro;
    }

    public void setNumCilindro(int numCilindro) {
        this.numCilindro = numCilindro;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    public void outputData(){
        System.out.println("Cilindro: "+numCilindro+"\nPotência: "+potencia);
    }
    
}

