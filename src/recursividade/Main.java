package recursividade;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
    //Variáveis que serão usadas:
    int an,fat,n,a1,r;
    //Variáveis String que serão usadas com JOptionPane. Se usar inpuxNext() da classe Scanner para entrada do usuário não precisa dessas variáveis:
    String entrada, entrada2, entrada3;
    //Variável long para fibonacci, pois pode chegar a números enormes:
    long fib;
    
    /*Solicitar número inteiro n ao usuário*/
    entrada=JOptionPane.showInputDialog("Digite um número inteiro n:");
    n=Integer.parseInt(entrada); // converte de String para int
    
    /* =======Chamando as funções recursivas criadas=========:*/
    //comente ou descomente a cada 2 linhas (entrada e saída) que desejar:
    
    //Fatorial recursivo:
    fat = Recursividade.fatorial(n);
    JOptionPane.showMessageDialog(null, "O fatorial de (com recursão) "+n+" é "+fat);
    
    //an da PA (0,10,20,30,...) recursivo:
    an = Recursividade.termoGeralPa_0Razao10(n);
    JOptionPane.showMessageDialog(null, "O termo a"+n+" da PA é "+an+"(com recursão)");
    
    //an da PA (-2,1,4,7,...) recursivo:
    an = Recursividade.termoGeralPa_2Razao3(n);
    JOptionPane.showMessageDialog(null, "O termo a"+n+" da PA é "+an+"(com recursão)");
    
    //an da PA (3,6,9,12,...) recursivo:
    an = Recursividade.termoGeralPa_3Razao3(n);
    JOptionPane.showMessageDialog(null, "O termo a"+n+" da PA é "+an+"(com recursão)");
    
    //an da sequência de Fibonacci (1,1,2,3,5,8,13,21,34,...) recursivo:
    fib = Recursividade.fibonacci(n);
    JOptionPane.showMessageDialog(null, "O termo a"+n+" na sequência Fibonacci é "+fib+"(com recursão)");
    
    /*Solicitar a1 e razão r para qualquer PA:*/
    entrada2=JOptionPane.showInputDialog("Digite o termo inicial da PA:");
    entrada3=JOptionPane.showInputDialog("Digite a razão da PA:");
    a1=Integer.parseInt(entrada2); // converte de String para int
    r=Integer.parseInt(entrada3); // converte de String para int
    an = Recursividade.termoGeralPA(a1, r, n);
    JOptionPane.showMessageDialog(null, "O termo a"+n+" da PA com a1= "+a1 +" e razão ="+r+" é "+an+"(com recursão)");

                
     /* === Chamando as funções com laço (não recursivas) criadas ===:*/
     /* Chame todas as funções desejadas entre as restantes, trocando o
    nome da classe "Recursividade" pela classe "Repeticao" na chamada,
    como no exemplo abaixo:  */
    fat = Repeticao.fatorial(n);//Chamando método da classe Repeticao
    JOptionPane.showMessageDialog(null, "O fatorial de "+n+" é "+fat);  
    
    //... chame os outros métodos que desejar:

    }
    
}
