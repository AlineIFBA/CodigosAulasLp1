package IntroducaoPoo.aula03;

//Classe elaborada como exercício
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

    /*Métodos que são respostas de exercícios passados na aula: */
    public void imprimirExtenso(){
        String saida="";
        if (dia<10)//se só tem um dígito
            saida+="0"+dia+" de ";
        else
            saida+=dia+" de ";
        
        saida+= getMesExtenso();
        saida+=" de " +ano;
        System.out.println("Data: "+saida);
    }

    private String getMesExtenso(){
        String meses[]={"Janeiro","Fevereiro","Março",
        "Abril","Maio","Junho","Julho","Agosto",
        "Setembro","Outubro","Novembro","Dezembro" };
        return meses[mes-1];                
    }

    public void imprimirDDMMAAAA(){
       
        String saida="";
        if (dia<10)//se só tem um dígito
            saida+="0"+dia+"/";
        else
            saida+=dia+"/";
        if (mes<10)
            saida+="0"+mes+"/";
        else
            saida+=mes+"/";
        
        saida+=ano;
        return saida;
        
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