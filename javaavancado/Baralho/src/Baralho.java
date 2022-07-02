import java.util.ArrayList;
import java.util.Collections;

public class Baralho {
    private ArrayList<Carta> cartas = new ArrayList<>();

    Baralho() {
        for (Naipe n : Naipe.values()) {
            int valorCarta = 1;
            for (ValorCarta vc : ValorCarta.values()) {
                Carta c = new Carta();
                c.setValor(vc);
                c.setNaipe(n);
                c.setValorReal(valorCarta);
                cartas.add(c);
                valorCarta++;
            }
        }
        shuffle();
    }


    public void shuffle() {
        Collections.shuffle(this.cartas);
    }

    public Carta getFromTop(Carta carta) {
        return this.cartas.remove(0);
    }

    public Carta getFromBottom(Carta carta) {
        return this.cartas.remove(this.cartas.size()-1);
    }

    public Carta searchCard(Naipe naipe, ValorCarta valor) {
        //TODO
        return null;
        //
        // return this.cartas.stream().filter(carta -> naipe.equals(carta.getNaipe()) && valor.equals(carta.getValor()))
    }

    public Carta searchCard(Naipe naipe, int valorReal) {
        //TODO
        return null;
    }


    // Getters & Setters

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }
}
