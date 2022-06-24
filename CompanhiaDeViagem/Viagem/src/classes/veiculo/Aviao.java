package classes.veiculo;

import classes.Assento;
import classes.AssentoVoo;
import classes.MeioTransporte;

import java.util.ArrayList;

public class Aviao implements MeioTransporte {

    private ArrayList<AssentoVoo> assentos = new ArrayList<>();


    @Override
    public boolean verificarOcupacao(String verificar) {
        return false;
    }

    @Override
    public int quantidadeLivre() {
        return 0;
    }

    @Override
    public void mostrarAssentos() {

    }

    @Override
    public Assento getAssento(String assento) {
        return null;
    }
}
