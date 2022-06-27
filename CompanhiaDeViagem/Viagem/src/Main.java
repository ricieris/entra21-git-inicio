import classes.Assento;
import classes.AssentoOnibus;
import classes.veiculo.Onibus;

public class Main {
    public static void main(String[] args) {
        Onibus o = new Onibus(7);
        o.getAssento("1").setOcupado(true);
        o.getAssento("6").setOcupado(true);
        o.getAssento("7").setOcupado(true);
        o.getAssento("8").setOcupado(true);
        o.getAssento("15").setOcupado(true);
        o.getAssento("16").setOcupado(true);
        o.mostrarAssentos();
    }
}
