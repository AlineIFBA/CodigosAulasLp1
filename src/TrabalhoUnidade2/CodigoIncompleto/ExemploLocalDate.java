package TrabalhoUnidade2.CodigoIncompleto;

import java.time.LocalDate;

public class ExemploLocalDate {

   public static void main(String[] args) {

      LocalDate hoje = LocalDate.now(); // Data atual
      LocalDate aniversario = LocalDate.of(2025, 6, 5); // Data específica
      LocalDate semanaQueVem = hoje.plusWeeks(1); // Adicionando tempo
      LocalDate mais10Dias = hoje.plusDays(10); // Soma de 10 dias
      LocalDate semanaPassada = hoje.minusDays(7);

      System.out.println("Hoje: " + hoje);
      System.out.println("Aniversário: " + aniversario);
      System.out.println("Semana que vem: " + semanaQueVem);
      System.out.println("Daqui a 10 dias: " + mais10Dias);
      System.out.println("Semana passada: " + semanaPassada);

   }

}
