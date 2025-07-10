package Heranca.ExerciciosLaboratorio;

public abstract class Forma {
    protected int base;
    
    //Se nenhum construtor é declarado, Java fornece public Forma()

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
   
    public abstract void print();
    
}

