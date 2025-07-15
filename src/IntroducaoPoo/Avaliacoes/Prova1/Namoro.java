package IntroducaoPoo.Avaliacoes.Prova1;
   /*Questão 2 - Elabore a classe Namoro contendo:
   a)	variáveis de instância: 
      i)	namorado (Pessoa) 
      ii)	namorada (Pessoa) 
      iii)	terminado (boolean)
   */
public class Namoro {
   private Pessoa namorado;
   private Pessoa namorada;
   private boolean terminado;

   /*Questão 2 
   b)	Elabore um construtor com 2 argumentos do tipo Pessoa, que serão o namorado e a namorada. Os valores das variáveis nNamoros das duas pessoas deve ser incrementado em 1. O valor de terminado deve ser inicializado com false.  */
   public Namoro(Pessoa namorado, Pessoa namorada) {
      this.namorado = namorado;
      this.namorada = namorada;
      this.terminado = false;
      this.namorada.setnNamoros(this.namorada.getnNamoros()+1);
      this.namorado.setnNamoros(this.namorado.getnNamoros()+1);
   }
  /*Questão 2 
   c)	Elabore os métodos get e set  */
   public Pessoa getNamorado() {
      return namorado;
   }

   public void setNamorado(Pessoa namorado) {
      this.namorado = namorado;
   }

   public Pessoa getNamorada() {
      return namorada;
   }

   public void setNamorada(Pessoa namorada) {
      this.namorada = namorada;
   }

   public boolean isTerminado() {
      return terminado;
   }

   public void setTerminado(boolean terminado) {
      this.terminado = terminado;
   }

    /*Questão 2 
   d)	Elabore o método public void terminarNamoro() que atualize o valor de terminado para true e decremente em 1 os valores das variáveis nNamoros das duas pessoas envolvidas no namoro   */
   public void terminarNamoro(){
      terminado=true;
      namorada.setnNamoros(namorada.getnNamoros()-1);
      namorado.setnNamoros(namorado.getnNamoros()-1);
   }
   
    /*Questão 2 
   e)	Elabore um método com a assinatura public static void comprarPresente (Pessoa p, double valorPresente). Se a pessoa estiver namorando e tiver dinheiroNaConta suficiente para comprar o presente, deduza o valor do presente de dinheiroNaConta. Senão tiver dinheiro suficiente, terminar o namoro e atualizar a variável nNamoros decrementando 1 do seu valor */
   public static void comprarPresente (Pessoa p, double valorPresente){
      if (p.estaNamorando())
         if (p.getDinheiroNaConta()>=valorPresente)
            p.setDinheiroNaConta(p.getDinheiroNaConta()-valorPresente);
         else 
            p.setnNamoros(p.getnNamoros()-1);
            //Não tem como terminar namoro no método static, pois o objeto Namoro não existe
      }
   }
   
  /*Questão 2 
   f)	Elabore um método com a assinatura public void comprarPresente (double valorPresente). Esse método deve fazer o mesmo que o método anterior, mas nesse caso, o namorado é que deve comprar presente para a namorada. O método da questão anterior pode ser chamado? Se sim, implemente este método chamando-o. Senão, implemente-o como necessário. */
   public void comprarPresente (double valorPresente){
         Namoro.comprarPresente(this.namorado, valorPresente);//Daria para chamar o método static implementado acima
         //Como está dentro da prórpia classe Namoro, poderia chamar o método static sem o nome da classe:
         // comprarPresente(this.namorado, valorPresente);
         //Ou também chamá-lo pelo objeto this (um objeto Namoro) que é handle desta chamada deste método, com o "this" explícito:
         //this.comprarPresente(this.namorado, valorPresente);

      }
   }
   
   /*Questão 2f)
   Sem chamar o método static implementado mais acima, o método comprarPresente (double valorPresente ficaria da seguinte forma: 
     
      public void comprarPresente (double valorPresente){
         if (terminado==false))//está namorando
            if (namorado.getDinheiroNaConta()>=valorPresente)
               namorado.setDinheiroNaConta(p.getDinheiroNaConta()-valorPresente);
            else 
               namorado.setnNamoros(namorado.getnNamoros()-1);
      }
   } */

   /*Questão 2 
   g)	Elabore um método com a assinatura public boolean saoNamorados (Pessoa p1, Pessoa p2) que retorne true se as duas pessoas têm um namoro entre si (ou seja, se as pessoas namorada e namorado do namoro) ou false caso contrário  */
   public boolean saoNamorados (Pessoa p1, Pessoa p2){
      if (this.namorada==p1 && this.namorado==p2)
         return true;
      else
         return false;
  }
   

   

   




}
