package classes.lanches;

public class MistoQuente extends Sanduiche {
    public MistoQuente() {

        this.adicionarIngrediente("Queijo");
        this.adicionarIngrediente("Presunto");
        this.adicionarIngrediente("Pão");

        this.setTipo("MISTO QUENTE");;
    }
}

