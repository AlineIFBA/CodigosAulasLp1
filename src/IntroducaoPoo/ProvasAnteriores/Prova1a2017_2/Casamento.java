package IntroducaoPoo.ProvasAnteriores.Prova1a2017_2;

import java.util.Scanner;

//Questão 3.a)
public class Casamento {
   private Pessoa esposo;
   private Pessoa esposa;
   private String data;

   // Questão 3.b)
   public Casamento(Pessoa esposo, Pessoa esposa, String data) {
      this.esposo = esposo;
      this.esposa = esposa;
      this.data = data;
   }

   // Questão 3.b)
   public Casamento() {
      Scanner input = new Scanner(System.in);
      System.out.println("Digite o nome do esposo");
      String nomeEsposo = input.nextLine();
      this.esposo = new Pessoa(nomeEsposo, Sexo.MASCULINO);
      System.out.println("Digite o nome do esposa");
      String nomeEsposa = input.nextLine();
      this.esposa = new Pessoa(nomeEsposa, Sexo.FEMININO);
      System.out.println("Digite a data do casamento");
      String data = input.nextLine();
      this.data = data;

   }

   // Questão 3.d)
   public void imprimir() {
      System.out.println("Data do casamento: " + data +
            "\nNome do esposo: " + esposo.getNome() + "\nNome da esposa:" +
            esposa.getNome());
   }

   // Questão 3.e)
   public void alterarNomeConjuge(String nome, Sexo sexo) {
      if (sexo == Sexo.FEMININO)
         esposa.setNome(nome);
      else
         esposo.setNome(nome);

   }
   /* Questão 3.f) MÉTODOS GET E SET - no final da classe */

   // Questão 3.g
   public String toString() {
      return "Casamento [Esposo:" + esposo.getNome() + ", Esposa:" + esposa.getNome() + ", Data:" + data + "]";
   }
   
   /* Questão 3.f) MÉTODOS GET E SET */
   public Pessoa getEsposo() {
      return esposo;
   }


   public void setEsposo(Pessoa esposo) {
      this.esposo = esposo;
   }

   public Pessoa getEsposa() {
      return esposa;
   }

   public void setEsposa(Pessoa esposa) {
      this.esposa = esposa;
   }

   public String getData() {
      return data;
   }

   public void setData(String data) {
      this.data = data;
   }

   

}
