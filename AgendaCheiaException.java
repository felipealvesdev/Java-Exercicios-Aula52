package javabasico.aula52.propriaexcecao.exercicio;

public class AgendaCheiaException extends Exception{

    @Override
    public String toString(){
        return "Agenda cheia.";
    }
}
