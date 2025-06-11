package TrabalhoUnidade2.CodigoIncompleto;

public enum TipoCompromisso {
   DATAFIXA("Data fixa","Na data:"),
   PERIODO("Período", "Até a data:"),
   SEMDATA("Sem prazo","Sem prazo");
   
   private String labelTipo;
   private String descricaoTipo;
   private TipoCompromisso(String descricaoTipo, String labelTipo){
      this.descricaoTipo=descricaoTipo;   
      this.labelTipo=labelTipo;
   }

   public String getDescricaoTipo() {
      return descricaoTipo;
   } 
   
   public String getLabelTipo() {
      return labelTipo;
   } 
}
