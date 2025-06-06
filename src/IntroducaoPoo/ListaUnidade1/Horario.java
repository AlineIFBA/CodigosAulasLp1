package IntroducaoPoo.ListaUnidade1;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;
    

    //Questão 8a
    public Horario(int hora, int minuto) {
        this.hora=hora;
        this.minuto=minuto;
        this.segundo=0;
        //this(hora,minuto,0);
        
    }
    
    //Questão 8b
    public Horario(int hora) {
        this.hora=hora;
        this.minuto=0;
        this.segundo=0;
        //this(hora,0,0);
    }
    //Questão 8c
    public Horario(int hora, int minuto, int segundo) {
        if (hora>=0 && hora<24)
            this.hora = hora;
        else
            this.hora=0;
        if (minuto>=0 && minuto<60)
            this.minuto = minuto;
        else
            this.minuto=0;
        if (segundo>=0 && segundo<60)
            this.segundo=segundo;
        else
            this.segundo=0;
        
        
    }
    
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora>=0 && hora<24)
            this.hora = hora;
        else
            this.hora=0;
        
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto>=0 && minuto<60)
            this.minuto = minuto;
        else
            this.minuto=0;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo>=0 && segundo<60)
            this.segundo=segundo;
        else
            this.segundo=0;
    }
    
    //Questao 8e
    public static void soma (Horario horario1, Horario horario2){
    int segundo=horario1.segundo + horario2.segundo;
    int minuto=segundo/60;
    segundo=segundo%60;
    
    minuto=horario1.minuto + horario2.minuto+ minuto;
    int hora=minuto/60;
    minuto=minuto%60;
    
    hora=horario1.hora+ horario2.hora+hora;
    System.out.println("Soma: "+hora + " horas "+ minuto+ " minutos "+ segundo + " segundos");
}
    //Questao 8f 
    public void soma (Horario horario){
    int segundo=this.segundo + horario.segundo;
    int minuto=segundo/60;
    segundo=segundo%60;
    
    minuto=this.minuto + horario.minuto+ minuto;
    int hora=minuto/60;
    minuto=minuto%60;
    
    hora=this.hora+ horario.hora+hora;
    System.out.println("Soma: "+hora + " horas "+ minuto+ " minutos "+ segundo + " segundos");
}
    
//Questao 8g
    public void soma (int horas, int minutos, int segundos){
    int segundo=getSegundo() + segundos;
    int minuto=segundo/60;
    segundo=segundo%60;
    
    minuto=getMinuto() + minutos+ minuto;
    int hora=minuto/60;
    minuto=minuto%60;
    
    hora=getHora()+ horas +hora;
    
    //Alterando as variáveis de instância do objeto Horario:
    setHora(hora);
    setMinuto(minuto);
    setSegundo(segundo);
}  
    
    //Questao 9
    public static Horario somar (Horario horario1, Horario horario2){
        int segundo=horario1.segundo + horario2.segundo;
        int minuto=segundo/60;
        segundo=segundo%60;
    
        minuto=horario1.minuto + horario2.minuto+ minuto;
        int hora=minuto/60;
        minuto=minuto%60;
    
        hora=horario1.hora+ horario2.hora+hora;
        
        //Instanciando um novo objeto:
        Horario novo=new Horario(hora, minuto, segundo);
        return novo;
    }
    
    public String toString(){
        return hora+":"+minuto+":"+segundo;
    }
    
}

