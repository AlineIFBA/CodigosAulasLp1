package Heranca.Avaliacao3;

public class Main {
   public static void main(String[] args) {
      
      /*Questão 1b)*/
      Veiculo vc=new Veiculo(200);
      Bicicleta bc=new Bicicleta(40, 18);
      //Carro não pode ser instanciada, pois é classe abstrata
      CarroCorrida cc=new CarroCorrida(300, 2019);
      CarroInteligente ci= new CarroInteligente(150,  2025);
      
      /*Questão 1c)*/
      cc.acelerar(); // CarroInteligente tem acelerar()
      ci.acelerar(); // CarroCorrida tem acelerar()

      /*Questão 1d)*/
      Veiculo vp[]=new Veiculo[3];
      Carro cp[]=new Carro[2];

      vp[0]=cc; //Um objeto CarroCorrida pode ser atribuído a uma referência do tipo Veiculo
      vp[1]=bc; //Um objeto CarroInteligente pode ser atribuído a uma referência do tipo Veiculo
      vp[2]=ci; //Um objeto Bicicleta pode ser atribuído a uma referência do tipo Veiculo

      cp[0]=ci; //Um objeto CarroInteligente pode ser atribuído a uma referência do tipo Carro
      cp[1]=cc; //Um objeto CarroCorrida pode ser atribuído a uma referência do tipo Carro

      for (Veiculo v:vp)
         v.frear();

      for (Carro c:cp)
         c.acelerar();
      
      /*Questão 1e)*/
      /*Mesmo cp[0] sendo um objeto CarroInteligente, não é possível chamar o método estacionar(), visto que o array cp contém referências do tipo Carro (superclasse), que não possui o método estacionar(). A única forma de estacionar o carro inteligente criado na linha 11, é chamar o método por uma referência do tipo CarroInteligente, que pode ser o próprio "ci":  */
      ci.estacionar();

      /*Outra forma seria criar outra referência do tipo CarroInteligente e fazer um cast de cp[0] para CarroInteligente, mas não era obrigatório fazer dessa forma, visto que eu disse que não seria cobrado na prova: */
      if (cp[0] instanceof CarroInteligente){
         CarroInteligente alias=(CarroInteligente) cp[0];
         alias.estacionar();
      }

      
   }

}
