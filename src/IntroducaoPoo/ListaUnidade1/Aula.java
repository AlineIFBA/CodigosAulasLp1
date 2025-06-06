package IntroducaoPoo.ListaUnidade1;
/*Questão 13) Elabore a classe Aula com:
-Inicio (Horario)
-termino (Horario)
a. Elabore construtor public Aula (Horario h1, Horario h2)
b. Elabore o construtor public Aula (int h1, int m1, int h2, int m2). Inicialize os segundos com zero.
c. Elabore o método public int duracaoMinutos() que retorne qual a duração da aula em minutos
d. Elabore o método public void setDuracao(int minutos) que receba a duração da aula em minutos e a partir disso calcule um novo horário de término e modifique os valores do término do objeto aula.*/
public class Aula {
   private Horario inicio;
   private Horario fim;
   
   public Aula(Horario inicio, Horario fim) {
      this.inicio = inicio;
      this.fim = fim;
   }
   
   public Aula (int h1, int m1, int h2, int m2){
      this.inicio=new Horario(h1,m1,0);
      this.fim=new Horario(h2,m2,0);
   }


}
