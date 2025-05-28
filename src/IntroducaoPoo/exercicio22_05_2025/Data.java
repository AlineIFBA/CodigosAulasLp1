package IntroducaoPoo.exercicio22_05_2025;

//Classe elaborada como exercício
public class Data {
 
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        //O objeto this é criado na memória antes da execução da primeira instrução dentro do construtor
        //O exercício pediu pra fazer validação nos métodos set, mas faz sentido fazer a validação também no construtor, pra não permitir datas com valores sem sentido (mês 30 por exemplo)
        /*Pra não repetir o código dos métodos set (é uma boa prática não repetir código), chamamos os métodos set aqui, pois eles já estão implementando a validação */
        this.setAno(ano); // Foi necessário chamar setAno e setMes primeiro, pois a validação do dia depende de ano e mês  
        this.setMes(mes); // Foi necessário chamar setMes antes de setDia, pois a validação do dia depende do ano e mês
        this.setDia(dia); // Chamando setDia(dia) por último, pois a quantidade máxima de dias depende do mês e do ano no caso de fevereiro
        /*Se setDia fosse chamado primeiro, o ano e o mês ainda estariam com o valor zero no objeto. Então, na ordem do código abaixo não funcionaria como pretendemos: 
         setDia(dia); // se chamasse esse primeiro, mês e ano ainda seriam zero
         setMes(mes); //só aqui o valor do mês seria atribuído, já depois de validar o dia
         setAno(ano);//só aqui o valor do ano seria atribuído, já depois de validar o dia e o mês
        */
    }
    
    public Data() {
        //Deixando o construtor vazio (pra ficar diferente do outro código de exemplo)
        //Os objetos que foram criados por esse construtor terão ano, mês e dia com o valor 0 (zero)
    }

       
    public void imprimir(){        
        System.out.println("Dia: "+dia+ " Mês: "+mes +" Ano: "+ano);
    }

     /*Métodos que são respostas de exercícios passados na aula: */
    public void imprimirDDMMAAAA(){       
        String saida="";
        if (dia<10)//se só tem um dígito
            saida+="0"+dia+"/";//concatena um zero à esquerda 
        else
            saida+=dia+"/";
        if (mes<10)
            saida+="0"+mes+"/";
        else
            saida+=mes+"/";        
        saida+=ano;
        System.out.println("Data: "+saida);
        
    }
   
    public void imprimirExtenso(){
        String saida="";
        if (dia<10)//se só tem um dígito
            saida+="0"+dia+" de ";
        else
            saida+=dia+" de ";
        
        saida+= getMesExtenso();//chamando o método getMextenso() para organizar o código e também reutilizar esse método quando necessário
        saida+=" de " +ano;
        System.out.println("Data: "+saida);
    }

    private String getMesExtenso(){//Um método pode ser private quando for usado como auxiliar de outro. Não queremos que esse método seja usado sozinho fora da classe, então deixamos private e ele não estará disponível na classe Main
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
    
    //Método que retorna se duas datas são iguais (em valores)
    public static boolean datasIguais(Data d1,Data d2){
        if (d1.dia==d2.dia && d1.mes==d2.mes && d1.ano==d2.ano)
            return true;
        else 
            return false;
    }

    public boolean anoBissexto(){
        /* Um ano é bissexto se ele não for divisível por 100 e for divisível por 4 ao mesmo tempo, ou se ele for divisível por 400. */
        if (((ano%100!=0) && (ano%4==0)) || (ano%400==0))
            return true;
        else
            return false;
    }

    //Retorna a quantidade máxima de dias do mês do objeto data
    public int diasDoMes(){
        if (mes==2){
            if (anoBissexto())
                return 29;
            return 28;
        }   else if (mes==4 || mes==6 || mes==9 || mes==9)
                return 30;
        return 31;
    }

/*=========== MÉTODOS GET E SET abaixo: ================ */
    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        if (dia>diasDoMes() || dia<1)
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
   /*=========== MÉTODOS GET E SET  ================ */ 
    
}