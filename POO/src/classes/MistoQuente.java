package classes;

public class MistoQuente extends Sanduiche {
    public MistoQuente() {

        this.adicionarIngrediente("Queijo");
        this.adicionarIngrediente("Presunto");
        this.adicionarIngrediente("Pão");

        this.tipo = "MISTO QUENTE";
    }
}

