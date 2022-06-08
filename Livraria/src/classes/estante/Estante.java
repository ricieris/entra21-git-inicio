package classes.estante;

import classes.Item;
import classes.avaliacao.Avaliacao;

public class Estante {
    private int capMaxima;
    private Item[] itens;

    public Estante(int capMaxima) {
        setCapMaxima(capMaxima);
        setItens(new Item[capMaxima]);

        //TODO
    }

    public boolean estanteCheia() {
        //TODO
//        for (Item i : getItens()) {
//            if (i != null) {
//            }
//        }
        return false;
    }

    public int quantidadeItens() {
        //TODO
        return 0;
    }

    public Item buscarItem(String titulo) {
        //TODO
        return null;
    }

    public boolean adicionarItem(Item item) {
        //TODO
        return false;
    }

    public Item removerItem(int posicao) {
        //TODO
        return null;
    }


    //Getters & Setters

    public int getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }
}
