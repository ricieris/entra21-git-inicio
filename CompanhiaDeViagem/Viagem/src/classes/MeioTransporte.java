package classes;

public interface MeioTransporte {

    public boolean verificarOcupacao(String verificar);

    public int quantidadeLivre();

    public void mostrarAssentos();

    public Assento getAssento (String assento);
}
