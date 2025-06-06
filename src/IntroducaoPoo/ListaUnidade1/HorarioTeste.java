package IntroducaoPoo.ListaUnidade1;

public class HorarioTeste {
    public static void main(String[] args) {
        
        //Questão 10
        Horario h1=new Horario(3,20,30);
        Horario h2=new Horario(2,50,50);
        Horario h3=new Horario(1,15,8);
        
        //Questão 11:
        Horario.soma(h1, h2);
        h1.soma(h3);
        Horario.somar(h2, h3);
        h3.soma(4,5,20);
        
        //Questão 12: (h1 está sendo o handle)
        h1.soma(h1,h2);
        
        h1.soma(h2);
        Horario novo=Horario.somar(h1, h2);
        System.out.println(novo);
    }
    
}