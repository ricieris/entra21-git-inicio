package classes.veiculo;

import classes.Assento;
import classes.AssentoOnibus;
import classes.AssentoVoo;
import classes.MeioTransporte;

import java.util.ArrayList;

public class Onibus implements MeioTransporte {

    private ArrayList<AssentoOnibus> assentos = new ArrayList<>();
    private boolean leito;

    public Onibus (int linhasCadeiras) {
        int totalAssentos = linhasCadeiras * 4;

    }


    @Override
    public boolean verificarOcupacao(String verificar) {
//        for (int i = 0; i < this.assentos; i++) {
//            for (int j = 0; j < this.codificacaoAssentos[i].length; j++) {
//                if (this.codificacaoAssentos[i][j].equalsIgnoreCase(codigo)) {
//                    return this.ocupacaoAssentos[i][j];
//                }
//            }
//        }
        return false;
    }

    @Override
    public int quantidadeLivre() {
        int qtdeAssentosLivres = 0;
//        for (int i = 0; i < this.codificacaoAssentos.length; i++) {
//            for (int j = 0; j < this.codificacaoAssentos[i].length; j++) {
//                if(!this.ocupacaoAssentos[i][j]) {
//                    qtdeAssentosLivres++;
//                }
//            }
//        }
        return qtdeAssentosLivres;
    }

    @Override
    public void mostrarAssentos() {

    }

    @Override
    public Assento getAssento(String assento) {
        return null;
    }


    // Getters & Setters


    public ArrayList<AssentoOnibus> getAssentos() {
        return assentos;
    }

    public void setAssentos(ArrayList<AssentoOnibus> assentos) {
        this.assentos = assentos;
    }

    public boolean isLeito() {
        return leito;
    }

    public void setLeito(boolean leito) {
        this.leito = leito;
    }
}
