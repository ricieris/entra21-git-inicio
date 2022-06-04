package classes;

public class ListaTarefas {

    private int tamanhoLista;
    private String NomeLista;
    private Tarefa[] tarefas;

    public ListaTarefas(int tamanhoLista) {
        //TODO

    }

    public boolean adicionarTarefa(Tarefa tarefa) {
        //TODO
        return false;
    }

    public Tarefa buscarTarefa(int posicao) {
        //TODO
        return null;
    }

    public boolean alterarOrdemTarefa(Tarefa tarefa, int novaPosicao) {
        //TODO
        return false;
    }




    //Getters & Setters
    public int getTamanhoLista() {
        return tamanhoLista;
    }

    public void setTamanhoLista(int tamanhoLista) {
        this.tamanhoLista = tamanhoLista;
    }

    public String getNomeLista() {
        return NomeLista;
    }

    public void setNomeLista(String nomeLista) {
        NomeLista = nomeLista;
    }

    public Tarefa[] getTarefas() {
        return tarefas;
    }

    public void setTarefas(Tarefa[] tarefas) {
        this.tarefas = tarefas;
    }
}
