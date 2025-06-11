package IntroducaoPoo.ExerciciosLaboratorio;

//Questão 1
public class Computador {
   private int memoria;
   private int hd;
   private String processador;

   // Questão 2 - Construtor com 3 argumentos
   public Computador(int memoria, int hd, String processador) {
      this.memoria = memoria;
      this.hd = hd;
      this.processador = processador;
   }

   // Questão 3 - Criar método que imprime os dados no seguinte formato:“Core
   // i5-13400 - HD 800 GB – 64 GB de RAM”
   public void imprimir() {
      System.out.println(processador + " - HD " + hd + " GB - " + memoria + " GB de RAM");

   }

   public int getMemoria() {
      return memoria;
   }

   public void setMemoria(int memoria) {
      this.memoria = memoria;
   }

   public int getHd() {
      return hd;
   }

   public void setHd(int hd) {
      this.hd = hd;
   }

   public String getProcessador() {
      return processador;
   }

   public void setProcessador(String processador) {
      this.processador = processador;
   }

}
