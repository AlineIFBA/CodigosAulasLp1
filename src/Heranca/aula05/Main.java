package Heranca.aula05;

public class Main {
   public static void main(String[] args) {

   //A seguinte instrução, que está comentada, não compila, pois declaramos Empregado como abstract:      
   //Empregado e1= new Empregado("Joana"); Não permitido criar objeto de classe abstrata

   //Instanciando um EmpregadoBase:
   EmpregadoBase eb1=new EmpregadoBase("Paola", 2200);
   eb1.imprimir();

   //Instanciando um EmpregadoHorista:
   EmpregadoHorista eh1=new EmpregadoHorista("Juliana", 30, 220);

   //Instanciando um EmpregadoComissionado:
   EmpregadoComissionado ec1= new EmpregadoComissionado("Carlos", 15, 20000);

   /*Declarando um array do tipo Empregado, com o tamanho 3
    * IMPORTANTE: A palavra "new" nesse caso não está instanciando objetos Empregado. Essa é a forma que a linguagem Java faz alocação de memória para o array. Isso é específico da linguagem; não está havendo chamada do construtor de Empregado aqui - este não pode ser chamado, já que a classe é abstrata
   */
   Empregado[] empregados=new Empregado[3];
   /*Agora estamos atribuindo os diferentes subtipo de empregados que criamos acima a cada referência do array. Por que isso não dá erro? Por causa da herança. O EmpregadoBase 'é-um' Empregado também;  O EmpregadoHorista 'é-um' Empregado também; O EmpregadoComissionado 'é-um' Empregado também;*/
   empregados[0]=eb1;
   empregados[1]=eh1;
   empregados[2]=ec1;

   for (Empregado e:empregados)//Laço que itera percorrendo o array "empregados"
      System.out.println(e.toString());//POLIMORFISMO i

   /*Explicando o polimorfismo...
   A mesma intrução "e.toString()" que está na linha 29 vai chamar métodos implementados de forma diferente, o que gerará comportamentos diferentes, de "múltiplas formas" (por isso, polimorfismo)
   Quando "e" for um EmpregadoBase, o que será verdadeiro quando o "e" for o objeto que está em "empregados[0]", o método "toString() chamado será o da subclasse EmporegadoBase, que retorna a String num determinado formato"
   Quando "e" for um EmpregadoHorista, o que será verdadeiro quando o "e" for o objeto que está em "empregados[1]", o método "toString()" chamado será o da subclasse EmporegadoHorista, que retorna a String num outro formato"
   E quando "e" for um EmpregadoComissionado, o que será verdadeiro quando o "e" for o objeto que está em "empregados[2]", o método "toString()" chamado será o da subclasse EmporegadoComissionado, que retorna a String num terceiro formato diferente.
   Ou seja, A MESMA MENSAGEM (mesma chamada e.toString()) GERA COMPORTAMENTOS DIFERENTES. O java verifica em tempo de execução (e não antes na compilação), qual é o subtipo que está em "e", para chamar o método da subclasse correta. Isso é chamado de VINCULAÇÃO DINÂMICA DE MÉTODO */

   /* OUTRA OBSERVAÇÃO: 
    * O "toString() nesse caso, poderia ser omitido. Tanto faz colocar
   System.out.println(e.toString());  QUANTO System.out.println(e);
   o "toString() vai ser chamado do mesmo jeito. Mas eu deixei o toString() explícito porque acabei usando ele pra dar o exemplo do polimorfismo, entaõ se eu omitisse, não ia ficar tão VISÍVEL que estava chamando um método ali"
   */
      
   }

}
