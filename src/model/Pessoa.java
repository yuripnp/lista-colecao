package model;

public class Pessoa {
    public String nome;
    public int idade;

    public void setIdade(int idade) {this.idade = idade;}
    public void setNome(String nome) {this.nome = nome;}
    public int getIdade() {return idade;}
    public String getNome() {return nome;}

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
