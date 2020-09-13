package br.com.xmls.tableView;

/*
* Object from TableView
*/

public class User {
    public int n;
    public String nome;
    public String sexo;
    public int idade;
    public String aprovado;
    
    public User(int n, String nome, String sexo, int idade, String aprovado){
        this.n = n;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.aprovado = aprovado;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getAprovado() {
        return aprovado;
    }

    public void setAprovado(String aprovado) {
        this.aprovado = aprovado;
    }
    
    
}
