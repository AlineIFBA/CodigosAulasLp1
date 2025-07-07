package IntroducaoPoo.Avaliacoes.Prova1;
public class Pessoa {
   private String nome;
   private int nNamoros;
   private double dinheiroNaConta;

   public Pessoa(String nome, int nNamoros, double dinheiroNaConta) {
      this.nome = nome;
      this.nNamoros = nNamoros;
      this.dinheiroNaConta = dinheiroNaConta;
   }
   public String getNome() {
      return nome;
   }
   public void setNome(String nome) {
      this.nome = nome;
   }
   public int getnNamoros() {
      return nNamoros;
   }
   public void setnNamoros(int nNamoros) {
      this.nNamoros = nNamoros;
   }
   public double getDinheiroNaConta() {
      return dinheiroNaConta;
   }
   public void setDinheiroNaConta(double dinheiroNaConta) {
      this.dinheiroNaConta = dinheiroNaConta;
   }
   public void imprimir() {
      System.out.println("Pessoa [nome=" + nome + ", nNamoros=" + nNamoros + ", dinheiroNaConta=" + dinheiroNaConta + "]");
   }
}
