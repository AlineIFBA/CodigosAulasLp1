package Heranca.ExerciciosLaboratorio;

public class Caminhao extends Veiculo{
    private double cargaMaxima;
    private int comprimento;

    public Caminhao(double cargaMaxima, int comprimento, int velocidadeMax, double preco, Motor motor) {
        super(velocidadeMax, preco, motor);
        this.cargaMaxima = cargaMaxima;
        this.comprimento = comprimento;
    }
    
    public Caminhao(){
        
    }
    
    public void outputData(){
        System.out.println("\n--CAMINHÃO--");
        motor.outputData();
        System.out.println("Velocidade máxima: "+velocidadeMax+"\nPreço: "+preco+"\nCarga máxima: "+cargaMaxima+"\nComprimento: "+comprimento);
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
     
}
