package classes.lanches;

import java.util.ArrayList;

public abstract class Sanduiche extends Lanche {

    private ArrayList<String> adicionais = new ArrayList<>();

    public void adicionarAdicional(String adicional) {
        this.adicionais.add(adicional);
    }


    //Getters & Setters
    public ArrayList<String> getAdicionais() {
        return adicionais;
    }
}