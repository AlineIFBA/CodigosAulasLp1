package Heranca.ExerciciosLaboratorio;

public class ContaTeste {
    public static void main(String[] args) {
        Conta c=new Conta(1,800);
        ContaEspecial ce=new ContaEspecial(2,1000,500);
        Poupanca p=new Poupanca(3,1200,0.5);
        c.deposito(200);
        c.saque(300);
        c.imprimeSaldo();
        
        ce.saque(1200);
        
        p.imprimeSaldo();
        p.deposito(0);//Valor inválido
        p.deposito(500);

        Conta c2=p;
        
        
        
    }
    
}
