package IntroducaoPoo.ProvasAnteriores;

public class Pessoa{
private String nome;
private Sexo sexo;//enum criado na questão anterior




public Pessoa(String nome, Sexo sexo) {
   this.nome = nome;
   this.sexo = sexo;
}

public Pessoa(){

}

public void imprimirDados(){
   System.out.println("Nome: "+nome+"\nSexo: "+sexo);
}

public String getNome() {
return nome;
}
public void setNome(String nome) {
this.nome = nome;
}
public Sexo getSexo() {
return sexo;
}
public void setSexo(Sexo sexo) {
this.sexo = sexo;
}



}
