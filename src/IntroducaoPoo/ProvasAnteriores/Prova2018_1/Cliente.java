package IntroducaoPoo.ProvasAnteriores.Prova2018_1;

public class Cliente {
   private String nome;
   private String CPF;

   //Questão 1.a)
   public Cliente(String nome, String CPF) {
      this.nome = nome;
      this.CPF = CPF;
   }

   public Cliente() {
      // nome=null;
      // CPF=null;
   }

   // Questão 1.b)
   public void imprimir() {
      // \t dá um espaço de tabulação e \n pula a linha
      System.out.println("\nNome: " + nome + "\tCPF: " + CPF);
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getCPF() {
      return CPF;
   }

   public void setCPF(String cPF) {
      CPF = cPF;
   }

}
