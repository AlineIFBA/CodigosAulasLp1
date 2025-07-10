package Heranca.ExerciciosLaboratorio;

public class Onibus extends Veiculo{
    private int totalPassageiros;
    private boolean comBanheiro;

    public Onibus(int totalPassageiros, boolean comBanheiro, int velocidadeMax, double preco, Motor motor) {
        super(velocidadeMax, preco, motor);
        this.totalPassageiros = totalPassageiros;
        this.comBanheiro = comBanheiro;
    }
    
    public Onibus(){
        
    }
    
    public void outputData(){
        System.out.println("\n--ÔNIBUS--");
        motor.outputData();
        System.out.println("Velocidade máxima: "+velocidadeMax+"\nPreço: "+preco+"\nTotal de passageiros: "+totalPassageiros+"\nCom banheiro: "+comBanheiro);
    }

    public int getTotalPassageiros() {
        return totalPassageiros;
    }

    public void setTotalPassageiros(int totalPassageiros) {
        this.totalPassageiros = totalPassageiros;
    }

    public boolean isComBanheiro() {
        return comBanheiro;
    }

    public void setComBanheiro(boolean comBanheiro) {
        this.comBanheiro = comBanheiro;
    }
    
    
    
    
}
