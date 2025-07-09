package IntroducaoPoo.aula04;

public enum TipoConta {
   ESPECIAL("Conta especial",2),
   SIMPLIFICADA("Conta simples",8);

   private String descricao;
   private double taxaJuros;
   
   private TipoConta(String descricao, double taxaJuros){
      this.descricao=descricao;
      this.taxaJuros=taxaJuros;
   }
   public String getDescricao(){
      return descricao;
   }

   public double getTaxaJuros(){
      return taxaJuros;
   }

}



