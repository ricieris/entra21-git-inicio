package classes.veiculo;

import classes.Assento;
import classes.AssentoOnibus;
import classes.AssentoVoo;
import classes.MeioTransporte;

import java.util.ArrayList;

public class Onibus implements MeioTransporte {

    private ArrayList<AssentoOnibus> assentos = new ArrayList<>();

    @Override
    public boolean verificarOcupacao(String verificar) {
        for (int i = 0; i < this.assentos; i++) {
            for (int j = 0; j < this.codificacaoAssentos[i].length; j++) {
                if (this.codificacaoAssentos[i][j].equalsIgnoreCase(codigo)) {
                    return this.ocupacaoAssentos[i][j];
                }
            }
        }
        return false;
        return false;
    }

    @Override
    public int quantidadeLivre() {
        int qtdeAssentosLivres = 0;
        for (int i = 0; i < this.codificacaoAssentos.length; i++) {
            for (int j = 0; j < this.codificacaoAssentos[i].length; j++) {
                if(!this.ocupacaoAssentos[i][j]) {
                    qtdeAssentosLivres++;
                }
            }
        }
        return qtdeAssentosLivres;
    }

    @Override
    public void mostrarAssentos() {

    }

    @Override
    public Assento getAssento(String assento) {
        return null;
    }
}
