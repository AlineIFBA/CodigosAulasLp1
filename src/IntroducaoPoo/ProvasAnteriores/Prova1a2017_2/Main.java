package IntroducaoPoo.ProvasAnteriores.Prova1a2017_2;

/* Questão 4 */
public class Main {
   public static void main(String args[]) {
      /* Questão 4  - Instancie pelo menos dois objetos da classe Pessoa. */
      Pessoa p1 = new Pessoa("Beatriz", Sexo.FEMININO);
      Pessoa p2 = new Pessoa("Arnaldo", Sexo.MASCULINO);
      

      /* Questão 4 - Instancie dois objetos da classe Casamento, usando o construtor com argumentos e outro usando o construtor sem argumentos. */
      Casamento c1 = new Casamento(p1, p2, "01/02/2010");
      Casamento c2 = new Casamento();

      /* Questão 4  - Chame os métodos imprimir para o objeto Pessoa e para o objeto Casamento criados */
      p1.imprimir();
      p2.imprimir();
      c1.imprimir();
      c2.imprimir();
      
      /* Questão 4 -  Chamar também o método alterarNomeConjuge */
      c1.alterarNomeConjuge("Carla", Sexo.FEMININO);

      /* Criar um terceiro objeto Pessoa e alterar um dos cônjuges do casamento*/
      Pessoa p3 = new Pessoa("Sara", Sexo.FEMININO);
      c2.setEsposo(p3); 

     /* Alterar o nome de um dos cônjuges com uma única instrução no método main a partir do objeto casamento criado */
     c1.alterarNomeConjuge("Carlos", Sexo.MASCULINO);
     //OU:
     c1.getEsposo().setNome("Carlos");

   }
}