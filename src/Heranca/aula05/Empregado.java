package Heranca.aula05;

public abstract class Empregado {
   protected String nome;

   public Empregado(){

   }
   
   
   public Empregado(String nome) {
      this.nome = nome;
   }

   public abstract double pagamento();
   
   public String toString(){
      return "Empregado: "+nome;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

    public void imprimir(){
      System.out.println("Nome do empregado: "+nome);
   }

}
