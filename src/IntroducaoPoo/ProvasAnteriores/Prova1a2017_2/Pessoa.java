package IntroducaoPoo.ProvasAnteriores.Prova1a2017_2;

public class Pessoa{
private String nome;
private Sexo sexo;//enum criado na questão anterior



//Questão 2.a)
public Pessoa(String nome, Sexo sexo) {
   this.nome = nome;
   this.sexo = sexo;
}
public Pessoa(){

}

//Questão 2.b)
public void imprimir(){
   System.out.println("Nome: "+nome+"\nSexo: "+sexo);
}

/* ==== MÉTODOS GET E SET====== */
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
