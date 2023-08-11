package javabasico.aula52.propriaexcecao.exercicio;

public class ContatoNaoExisteException extends Exception{
    @Override
    public String toString(){
        return "Contato procurado não existe.";
    }
}
