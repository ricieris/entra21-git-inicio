package classes.lanches;

public class MistoQuente extends Sanduiche{

    public MistoQuente() {
        this.adicionarIngrediente("Presunto");
        this.adicionarIngrediente("Queijo");
        this.adicionarIngrediente("Pão");
        this.setTipo("MISTO QUENTE");
    }
}
