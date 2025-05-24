package IntroducaoPoo.aula03;

public class Empregado {
   private String nome;
   private double salario;
   private Data dataAdmissao;


   public Empregado(String nome, double salario, Data dataAdmissao) {
      this.nome = nome;
      this.salario = salario;
      this.dataAdmissao = dataAdmissao;
   }
   public double getSalario() {
      return salario;
   }
   public void setSalario(double salario) {
      this.salario = salario;
   }
   public Data getDataAdmissao() {
      return dataAdmissao;
   }
   public void setDataAdmissao(Data dataAdmissao) {
      this.dataAdmissao = dataAdmissao;
   }

   public void setValoresAdmissao(int dia, int mes, int ano){
      dataAdmissao.setDia(dia);
      dataAdmissao.setMes(mes);
      dataAdmissao.setAno(ano);

   }

   public void imprimirDataAdmissao(){
      System.out.println("Data de admissão: "+dataAdmissao);
      System.out.println("Data de admissão: "+dataAdmissao.getDia()+"/"+dataAdmissao.getMes()+"/"+dataAdmissao.getAno());
   }

   

}
