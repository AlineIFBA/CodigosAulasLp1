package TrabalhoUnidade2.CodigoIncompleto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

   private static int dia;
   private static int mes;
   private static int ano;
   private static String nomeCategoria;
   private static String listaCompromissos;
   private static Scanner input; 
   private static Controle controle;

   public static void main(String args[]) {
      input = new Scanner(System.in);
      controle = new Controle();
      
      
      /*criar uma String para ser um “menu” com as opções abaixo. O menu deve ser exibido dentro de um laço até que o usuário digite 0 para sair*/

      String menu = "0-Sair\n"
              + "1-Criar compromisso\n"
              + "2-Cadastrar categorias\n"
              + "3-Imprimir todos os compromissos\n"
              + "4-Imprimir todas as categorias cadastradas\n"
              + "5-Concluir compromisso\n"
              + "6-Listar compromissos por categoria\n"
              + "7-Listar compromissos por descrição\n"
              + "8-Listar compromissos não concluídos\n"
              + "9-Listar compromissos por data\n"
              + "10-Listar compromissos por período\n"
              + "Digite a opção desejada:\n";

      String saida = "";
      int opcao = -1;
      TipoCompromisso tipoCompromisso = null;
      do {
         
         System.out.print(menu);
         opcao = input.nextInt();
         //descomentar linha abaixo se for ler entrada do arquivo
         //System.out.println("//OPÇÃO ESCOLHIDA: "+opcao+"\n");
         input.nextLine();//Corrigir comportamento inesperado de nextLine();
         switch (opcao) {
            case 1:
               /*Categoria categoria, String descricao, TipoCompromisso tipoCompromisso, Date dataCompromisso,  boolean concluido*/
               System.out.println("Digite o compromisso:");
               String descricao = input.nextLine();

              // tipoCompromisso = solicitarTipoCompromisso();
               //Calendar calendar = configurarDataCalendario(tipoCompromisso);
               //System.out.println("Digite o nome da categoria deste compromisso:");
               nomeCategoria = input.nextLine();

               controle.inserirCompromisso(descricao, tipoCompromisso, nomeCategoria, calendar);
               break;
            case 2:
               System.out.println("Digite o nome da categoria:");
               nomeCategoria = input.nextLine();

               controle.inserirCategoria(nomeCategoria);
               break;
            case 3:
               saida = controle.imprimirCompromissos();
               System.out.println(" *** Compromissos da agenda: *** \n" + saida);
               break;
            case 4:
               saida = controle.imprimirCategorias();
               System.out.println(" *** Categorias cadastradas *** \n" + saida);
               break;
            case 5:
               System.out.println("Digite o Id do compromisso:");
               int id = input.nextInt();

               input.nextLine();
               String resultado = controle.concluirCompromisso(id);
               System.out.println(resultado);
               break;
            case 6:
               System.out.println("Digite o nome da categoria:");
               nomeCategoria = input.nextLine();

               listaCompromissos = controle.imprimirCompromissosPorCategoria(nomeCategoria);
               System.out.println(listaCompromissos);
               break;
            case 7:
               System.out.println("Digite o compromisso:");
               descricao = input.nextLine();
//
               listaCompromissos = controle.imprimirCompromissosPorDescricao(descricao);
               System.out.println(listaCompromissos);
               break;
            case 8:
               listaCompromissos = controle.imprimirCompromissosNaoConcluidos();
               System.out.println(listaCompromissos);
               break;
            case 9:
               //solicitarData();
               listaCompromissos = controle.imprimirCompromissosPorData(dia, mes, ano);
               System.out.println(listaCompromissos);
               break;
            case 10:
               break;
               
         }
         
      } while (opcao != 0);
      
   }
}
