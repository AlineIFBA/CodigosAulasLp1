package IntroducaoPoo.aula03;

/Classe elaborada como exercício
public class Data {
 
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
       
    }
    
    public Data() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 2025;
    }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
         this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
       this.ano=ano;
    }
    
    public void imprimir(){
        
        System.out.println("Dia: "+dia+ "Mês: "+mes +"Ano: "+ano);
    }
    
    
}