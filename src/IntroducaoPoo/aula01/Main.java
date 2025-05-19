package IntroducaoPoo.aula01;
import javax.swing.JOptionPane;

public class Main {
   public static void main(String[] args) {


      Aluno a= new Aluno("João", 123); //Chamando o construtor de 2 argumentos com valores literais
      Aluno b= new Aluno("Maria", 456); //Chamando o construtor de 2 argumentos com valores literais
      Aluno c= new Aluno("Maria", 456); //Chamando o construtor de 2 argumentos com valores literais
      //"b" E "c" tem os mesmos valores mas não são o mesmo objeto


      a.imprimirDados(); //Imprimindo os dados do objeto a
      b.imprimirDados(); //Imprimindo os dados do objeto b
      c.imprimirDados(); //Imprimindo os dados do objeto c

      //Solicitar nome do aluno ao usuário, usando a caixa de diálogo da classe JOptionPane
      String n= JOptionPane.showInputDialog("Digite o nome do aluno");
      
      /*Solicitar matrícula do aluno ao usuário, usando a caixa de diálogo da classe JOptionPane. O método "showInputDialog" retorna String, então devemos usar "Integer.parseInt" para converter para int. Pode usar o método com a classe Scanner também, ao invés de JOptionPane*/ 
      int m= Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula do aluno:"));

      Aluno d= new Aluno(n,m); //Chamando o construtor de 2 argumentos com valores que o usuário forneceu  
      d.imprimirDados(); //Imprimindo os dados do objeto d
        
      //= = = Usando os métodos get e set : = = =
      
      //Vamos modificar a matrícula do objeto a e depois imprimir os dados novamente:
        a.setMatricula(987); //Modificando a matrpicula de "a" através do método "setMatricula"
        a.imprimirDados();
        
        //Vamos modificar a matrícula e o nome do objeto c e depois imprimir os dados novamente:
        c.setNome("Mariana");
        c.setMatricula(234);
        c.imprimirDados();
        
             
        //Usando os métodos get para imprimir os dados do aluno "b" sem chamar o método imprimirDados:
        JOptionPane.showMessageDialog(null,"O objeto b tem os seguintes valores: \nNome:"
                + b.getNome()+" Matrícula: "+b.getMatricula());
           
   }
   
}
