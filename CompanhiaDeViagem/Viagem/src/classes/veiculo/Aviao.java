package classes.veiculo;

import classes.Assento;
import classes.AssentoVoo;
import classes.ClasseAssentoVoo;
import classes.MeioTransporte;

import java.util.ArrayList;

public class Aviao implements MeioTransporte {

    private ArrayList<AssentoVoo> assentos = new ArrayList<>();

    public Aviao(int linhasCadeirasLuxo, int linhasCadeirasEconomicas) {
        String codigoAssentos = "ABCD";
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < linhasCadeirasLuxo; j++) {
                AssentoVoo a = new AssentoVoo();
                a.setCodigo(String.valueOf(codigoAssentos.charAt(i)) + j);
                a.setClasse(ClasseAssentoVoo.LUXO);
                assentos.add(a);
            }
        }

    codigoAssentos = "ABCDEF";
        for (int i = 0; i < 6; i++) {
        for (int j = 0; j < linhasCadeirasEconomicas; j++) {
            AssentoVoo a = new AssentoVoo();
            a.setCodigo(String.valueOf(codigoAssentos.charAt(i))+j);
            a.setClasse(ClasseAssentoVoo.ECONOMICA);
            assentos.add(a);
        }
    }
}


    @Override
    public boolean verificarOcupacao(String assento) {
        for (AssentoVoo a : this.assentos) {
            if (a.getCodigo().equalsIgnoreCase(assento)) {
                return a.isOcupado(); // Significa true porque o método ocupar setou como true;
            }
        }
        // MINHA LÓGICA
//        for (int i = 0; i < this.assentos.size(); i++) {
//            AssentoVoo a = this.assentos.get(i);
//            if (assento.equalsIgnoreCase(a.getLugar())) {
//                return a.isOcupado(); // Significa true porque o método ocupar setou como true;
//            }
//        }
        return false;
    }


    @Override
    public int quantidadeLivre() {
        int qtddAssentoLivre = 0;
        for (AssentoVoo a : this.assentos) {
            if (!a.isOcupado()) {
                qtddAssentoLivre++;
            }
        }
        return qtddAssentoLivre;
    }

    @Override
    public void mostrarAssentos() {

    }

    @Override
    public Assento getAssento(String assento) {
        for (AssentoVoo a : this.assentos) {
            if (a.getCodigo().equalsIgnoreCase(assento)) {
                return a;
            }
        }
        return null;
    }

    public Assento getAssento(String assento, ClasseAssentoVoo classe) {
        for (AssentoVoo a : this.assentos) {
            if (a.getCodigo().equalsIgnoreCase(assento) && a.getClasse().equals(classe)) {
                return a;
            }
        }
        return null;
    }


    // Getters & Setters

    public ArrayList<AssentoVoo> getAssentos() {
        return assentos;
    }

    public void setAssentos(ArrayList<AssentoVoo> assentos) {
        this.assentos = assentos;
    }
}
