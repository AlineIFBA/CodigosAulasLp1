package IntroducaoPoo.ProvasAnteriores;

import java.util.Scanner;

public class Casamento {
   private Pessoa esposo;
   private Pessoa esposa;
   private String data;

   public Casamento(Pessoa esposo, Pessoa esposa, String data) {
      this.esposo = esposo;
      this.esposa = esposa;
      this.data = data;
   }

   public Casamento(){
      Scanner input=new Scanner(System.in);
      System.out.println("Digite o nome do esposo");
      String nomeEsposo=input.nextLine();
      this.esposo= new Pessoa(nomeEsposo, Sexo.MASCULINO);
      System.out.println("Digite o nome do esposa");
      String nomeEsposa=input.nextLine();
      this.esposa= new Pessoa(nomeEsposa, Sexo.FEMININO);
      System.out.println("Digite a data do casamento");
      String data=input.nextLine();
      this.data=data;

   }

 public void alterarNomeConjuge (String nome, Sexo sexo){
   if (sexo==Sexo.FEMININO)
      esposa.setNome(nome);
   else
      esposo.setNome(nome);

 }

 public void imprimirDados(){
   System.out.println("Data do casamento: "+data+
   "\nNome do esposo: "+esposo.getNome()+"\nNome da esposa:"+
   esposa.getNome());
 }

}
