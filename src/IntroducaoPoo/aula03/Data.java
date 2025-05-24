package IntroducaoPoo.aula03;

//Classe elaborada como exercício
public class Data {
 
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        //O objeto this é criado na memória antes da execução da primeira instrução dentro do construtor
        this.setDia(dia); // Chamando setDia(dia) que faz a validação e assim não é necessário repetir o código
        this.setMes(mes); //idem
        this.setAno(ano); //idem    
    }
    
    public Data() {
        this.dia = 15;
        this.mes = 5;
        this.ano = 2025;
    }

       
    public void imprimir(){        
        System.out.println("Dia: "+dia+ " Mês: "+mes +" Ano: "+ano);
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
        System.out.println("Data: "+saida);
        
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
        "Setembro","Outubro","Novembro","Dezembro"};
        return meses[this.mes-1];                
    }

    public Data obterDataMaisRecente(Data data){
        if (data.ano>this.ano)
            return data;
        else if (this.ano>data.ano)
            return this;
        else // os anos são iguais
            if (data.mes>this.mes)
            return data;
        else if (this.mes>data.mes)
            return this;
        else //os meses também são iguais
          if (data.dia>this.dia)
            return data;
        else if (this.dia>data.dia)
            return this;
        else 
            return null; //as datas são iguais nos valores

    }

/*=========== MÉTODOS GET E SET abaixo ================ */
    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        if (dia>31 || dia<1)
            this.dia =1;
        else
            this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes>12 || mes<1)
            this.mes =1;
        else
            this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano>0 && ano<100)//de 1 a 99
            this.ano =2000+ano;
        else if (ano>=1000 && ano<=9999)
            this.ano = ano;
        else
            this.ano = 2025;        
    }
    
    
}