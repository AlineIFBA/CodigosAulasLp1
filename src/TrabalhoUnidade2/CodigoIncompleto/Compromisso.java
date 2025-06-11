package TrabalhoUnidade2.CodigoIncompleto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Compromisso {
   private static int geradorId=0;
   private int id;
   private Categoria categoria;
   private String descricao;
   private TipoCompromisso tipoCompromisso;
   private Date dataCompromisso;
   private boolean concluido;
   
   public Compromisso() {
      geradorId++;
      this.id=geradorId;
   }
   
   public Compromisso(String descricao, TipoCompromisso tipoCompromisso, Categoria categoria) {
      geradorId++;
      this.id=geradorId;
      this.descricao = descricao;
      this.concluido = false;
      this.tipoCompromisso=tipoCompromisso;
      this.categoria=categoria;
   }

   
   public Compromisso(Categoria categoria, String descricao, TipoCompromisso tipoCompromisso, Date dataCompromisso,  boolean concluido) {
      geradorId++;
      this.id=geradorId;
      this.categoria = categoria;
      this.descricao = descricao;
      this.tipoCompromisso = tipoCompromisso;
      this.dataCompromisso = dataCompromisso;
      this.concluido = concluido;
   }

   public Categoria getCategoria() {
      return categoria;
   }

   public void setCategoria(Categoria categoria) {
      this.categoria = categoria;
   }

   public String getDescricao() {
      return descricao;
   }

   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }

   public TipoCompromisso getTipoCompromisso() {
      return tipoCompromisso;
   }

   public void setTipoCompromisso(TipoCompromisso tipoCompromisso) {
      this.tipoCompromisso = tipoCompromisso;
   }

   public Date getDataCompromisso() {
      return dataCompromisso;
   }

   public void setDataCompromisso(Date dataCompromissoo) {
      this.dataCompromisso = dataCompromissoo;
   }

  
   public boolean isConcluido() {
      return concluido;
   }

   public void setConcluido(boolean concluido) {
      this.concluido = concluido;
   }
   
   public String toString(){
      return "Compromisso: "+ this.getDescricao()+"\nCategoria: "+categoria.getNome();         
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

 
   
   
 
}
