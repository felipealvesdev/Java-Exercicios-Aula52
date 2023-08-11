package javabasico.aula52.propriaexcecao.exercicio;


public class Agenda {
    private int n = 0;
    private Contato[] contatos = new Contato[3];

    public int getN(){
        return this.n;
    }
    public String getContato(int id){
        boolean idEncontrado = false;
        try{
            for(int i = 0; i< contatos.length; i++){
                if(contatos[i].getId() == id){
                    idEncontrado = true;
                    break;

                }
                return "Informações sobre o contato de ID = "+ id + ", nome: "+this.contatos[id-1].getNome() +" telefone:"+ this.contatos[id-1].getTelefone();
            }
                throw new ContatoNaoExisteException();
        }catch(ContatoNaoExisteException | NullPointerException e){
            System.out.println("Contato não encontrado.");
            return "Insira um id válido.";
        }
    }
    public void adicionarContato(Contato contato){
        try{
            if(this.n< contatos.length){
                this.contatos[this.n] = contato;
                this.n++;
                System.out.println("Contato " + contato.getNome() + " adicionado a agenda.");
            }else{
                throw new AgendaCheiaException();
            }

        }catch(AgendaCheiaException e){
            System.out.println("Agenda Cheia. Limite de apenas "+ contatos.length + " contatos.");
        }catch(Exception e){
            System.out.println("Algum erro aconteceu. Por favor, certifique-se de que está inserindo os tipos de dados certos");
        }

    }
}
