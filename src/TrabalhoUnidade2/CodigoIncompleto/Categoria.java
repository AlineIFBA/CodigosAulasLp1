package TrabalhoUnidade2.CodigoIncompleto;

public class Categoria {
   private static int geradorId=0;
   private int id;
   private String nome;

   public Categoria(String nome) {
      geradorId++;
      this.id=geradorId;
      this.nome = nome;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }
   
   public String toString(){
      return id+" - "+nome;
   }
 
}
