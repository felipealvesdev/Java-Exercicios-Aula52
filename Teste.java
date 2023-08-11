package javabasico.aula52.propriaexcecao.exercicio;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean ligado = true;

        Agenda agenda01 = new Agenda();

        Contato contato01 = new Contato();
        Contato contato02 = new Contato();
        Contato contato03 = new Contato();
        Contato contato04 = new Contato();
//
//        contato01.setNome("Felipe");
//        contato01.setTelefone("81 99999-8888");
//
//        contato02.setNome("José");
//        contato02.setTelefone("81 55555-8888");
//
//        contato03.setNome("Platão");
//        contato03.setTelefone("81 11111-2222");
//
//        contato04.setNome("Sócrates");
//        contato04.setTelefone("81 1211-1322");

//        agenda01.adicionarContato(contato01);
//        agenda01.adicionarContato(contato02);
//        agenda01.adicionarContato(contato03);
//        agenda01.adicionarContato(contato04);
        while(ligado){
            System.out.println("Digite 1 para consultar um id de contato ou digite 2 para adicionar um novo contato.");
            int resposta = scan.nextInt();
            if(resposta == 1){
                System.out.println("Digite o id a ser consultado.");
                int idDigitado = scan.nextInt();
                System.out.println(agenda01.getContato(idDigitado));
            }else if(resposta == 2){
                System.out.println("Digite o contato a ser inserido como titulo:");
            }
            System.out.println("Digite 0 para sair do programa ou pressione qualquer tecla para continuar.");
            int sair = scan.nextInt();
            if(sair == 0){
                ligado = false;
            }
        }
        System.out.println("Programa encerrado.");
    }
}
