package classes.veiculo;

import classes.Assento;
import classes.AssentoOnibus;
import classes.MeioTransporte;

import java.util.ArrayList;

public class Onibus implements MeioTransporte {

    private ArrayList<AssentoOnibus> assentos = new ArrayList<>();
    private boolean leito;

    public Onibus(int linhasCadeiras) {
        for (int i = 1; i <= 4 * linhasCadeiras; i++) {
            AssentoOnibus a = new AssentoOnibus();
            a.setLugar(String.valueOf(i));
            assentos.add(a);
        }
    }


    @Override
    public boolean verificarOcupacao(String assento) {
        //LÓGICA DO PROFESSOR
        for (AssentoOnibus a : this.assentos) {
            if (a.getLugar().equalsIgnoreCase(assento)) {
                return a.isOcupado(); // Significa true porque o método ocupar setou como true;
            }
        }
        // MINHA LÓGICA
//        for (int i = 0; i < this.assentos.size(); i++) {
//            AssentoOnibus a = this.assentos.get(i);
//            if (assento.equalsIgnoreCase(a.getLugar())) {
//                return a.isOcupado(); // Significa true porque o método ocupar setou como true;
//            }
//        }

        return false;
    }

    @Override
    public int quantidadeLivre() {
        int qtdeAssentosLivres = 0;
        for (AssentoOnibus a : this.assentos) {
            if (!a.isOcupado()) {
                qtdeAssentosLivres++;
            }
        }
        return qtdeAssentosLivres;
    }

    @Override
    public void mostrarAssentos() {
        for (int i = 0; i < this.assentos.size(); i++) {
            AssentoOnibus a = this.assentos.get(i);
            int numero = 0;
            numero = Integer.parseInt(a.getLugar());

            if (a.isOcupado()) {
                System.out.print("[XX]");
            } else {
                if (numero <= 9) {
                    System.out.print("[0" + a.getLugar() + "]");
                } else {
                    System.out.print("[" + a.getLugar() + "]");
                }
            }
            if (numero % 4 == 0) {
                System.out.println();
            } else if (numero % 2 == 0) {
                System.out.print(" || ");
            }

            /*if (numero <= 9) {
                if (numero % 2 != 0) {
                    if (a.isOcupado()) {
                        System.out.print("[XX]");
                    } else {
                        System.out.print("[0" + a.getLugar() + "]");
                    }

                } else if (numero % 4 != 0) {
                    if (a.isOcupado()) {
                        System.out.print("[XX] || ");
                    } else {
                        System.out.print("[0" + a.getLugar() + "] || ");
                    }
                } else {
                    if (a.isOcupado()) {
                        System.out.print("[XX] \n");
                    } else {
                        System.out.print("[0" + a.getLugar() + "]\n");
                    }
                }
                ////////////////////////////////
            } else {
                if (numero % 4 != 0 && numero % 2 != 0) {
                    if (a.isOcupado()) {
                        System.out.print("[XX]");
                    } else {
                        System.out.print("[" + a.getLugar() + "]");
                    }

                } else if (numero % 4 != 0 && numero % 2 == 0) {
                    if (a.isOcupado()) {
                        System.out.print("[XX] || ");
                    } else {
                        System.out.print("[" + a.getLugar() + "] || ");
                    }

                } else if (numero % 4 == 0) {
                    if (a.isOcupado()) {
                        System.out.print("[XX] \n");
                    } else {
                        System.out.print("[" + a.getLugar() + "]\n");
                    }
                }
            }*/
        }
    }

    @Override
    public Assento getAssento(String assento) {
        for (AssentoOnibus a : this.assentos) {
            if (a.getLugar().equalsIgnoreCase(assento)) {
                return a;
            }
        }
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
