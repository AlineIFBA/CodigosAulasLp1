package Heranca.ExerciciosLaboratorio;

/**@author Aline Silva Costa */
public abstract class Veiculo {
    protected int velocidadeMax;
    protected double preco;
    protected Motor motor;

    public Veiculo(int velocidadeMax, double preco, Motor motor) {
        this.velocidadeMax = velocidadeMax;
        this.preco = preco;
        this.motor = motor;
    }
    
    public Veiculo(){
        
    }
    
    public abstract void outputData();

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    
    
}
