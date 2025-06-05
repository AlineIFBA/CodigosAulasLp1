package TrabalhoUnidade2.CodigoIncompleto;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Controle {
   private List<Categoria> categorias = new ArrayList<>();
   private List<Compromisso> compromissos = new ArrayList<>();

   public Categoria inserirCategoria(String nomeCategoria) {
      Categoria cat = new Categoria(nomeCategoria);
      categorias.add(cat);
      return cat;
   }

   public void inserirCompromisso(String descricao, TipoCompromisso tipoCompromisso,
           String nomeCategoria, Calendar calendar) {

      /*Verifica se a categoria com o nome "nomeCategoria" já está cadastrada na lista de categorias.
       * Se não estiver, criar uma nova categoria com esse nome e usá-la para o novo objeto compromisso que será criado. Caso já tenha sido criada, inserir a referência dessa categoria no novo objeto compromisso que será criado. 
       * Criar o novo compromisso e inseri-lo ba lista de compromissos
     
      ...
      Compromisso compromisso = new Compromisso(descricao, tipoCompromisso, categoria);
      compromissos.add(compromisso);
      */

   }

   public Categoria buscarCategoria(String nomeCategoria) {
      for (Categoria categoria : categorias) {
         if (nomeCategoria.equals(categoria.getNome())) {
            return categoria;
         }
      }
      return null;
   }

   public Categoria buscarCategoria(int idCategoria) {
      for (Categoria categoria : categorias) {
         if (idCategoria == categoria.getId()) {
            return categoria;
         }
      }
      return null;
   }

   public String imprimirCompromissos() {
      String saida = "";
      for (Compromisso compromisso : compromissos) {
         saida += compromisso.toString();
      }
      return saida;
   }
   
   public String imprimirCompromissosPorCategoria(String nomeCategoria) {
      String saida = "";
      for (Compromisso compromisso : compromissos) {
         if (compromisso.getCategoria().getNome().equalsIgnoreCase(nomeCategoria))
         saida += compromisso.toString();
      }
      return saida;
   }
   
   public String imprimirCompromissosPorDescricao(String substringDescricao) {
      //Implementar
      return null;
   }
   
   public String imprimirCompromissosNaoConcluidos() {
      //Implementar
      return null;
   }
   
   public String imprimirCompromissosPorData(int dia, int mes, int ano) {
      
      //Implementar
      return null;
   }
   
   public String concluirCompromisso(int idCompromisso) {      
      //Implementar
      return null;
   }

   public String imprimirCategorias() {
     //Implementar
      return null;
   }

   public List<Categoria> getCategorias() {
      return categorias;
   }

   public void setCategorias(List<Categoria> categorias) {
      this.categorias = categorias;
   }

   public List<Compromisso> getCompromissos() {
      return compromissos;
   }

   public void setCompromissos(List<Compromisso> compromissos) {
      this.compromissos = compromissos;
   }
   
   
   
   }


