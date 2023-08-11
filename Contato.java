package javabasico.aula52.propriaexcecao.exercicio;

public class Contato {
    private String nome;
    private String telefone;
    private static int identificador;

    private int id;

    Contato(){
        identificador++;
        this.id = identificador;
    }
    public int getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTelefone(){
        return this.telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
}
