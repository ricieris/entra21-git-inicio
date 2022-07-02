package classes.loja;

import classes.guardados.Estante;
import java.util.HashMap;

public class Loja {
    private HashMap<String, Estante> estantes = new HashMap<>();


    //Getters & Setters

    public HashMap<String, Estante> getEstantes() {
        return estantes;
    }

    public void setEstantes(HashMap<String, Estante> estantes) {
        this.estantes = estantes;
    }
}
