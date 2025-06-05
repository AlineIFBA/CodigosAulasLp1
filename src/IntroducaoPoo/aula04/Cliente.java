package IntroducaoPoo.aula04;

public class Cliente {
    private String nome;
    private String CPF;
   

    public Cliente(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
          
        
    }

    public Cliente() {
      
    }
    
    public void imprimir(){
      
        System.out.println("Nome do cliente: "+nome+"\nCPF: "+CPF);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    
}