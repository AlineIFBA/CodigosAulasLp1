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

   /*Questão 1
   a)	Implemente um construtor que receba apenas o argumento do nome. Esse construtor deve inicializar a variável nNamoros com o valor 0 e dinheiroNaConta com 0 
   */
   public Pessoa(String nome) {
      this.nome = nome;
      this.nNamoros = 0; 
      this.dinheiroNaConta = 0; 
   }

   /*Questão 1
   b)	b)	Implemente o método public boolean estaNamorando(), que deve retornar true se o número de namoros da pessoa for maior que zero e false se for igual a 0.
   */
   public boolean estaNamorando(){
      if (nNamoros>0)
         return true;
      else
         return false;
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
