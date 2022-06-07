package classes.lanches;

public class XBurger extends Sanduiche {

    private boolean aberto;

    public XBurger() {

        this.adicionarIngrediente("Hambúrguer");
        this.adicionarIngrediente("Queijo");
        this.adicionarIngrediente("Presunto");
        this.adicionarIngrediente("Pão");

        this.setTipo("X-BURGUER");

    }


    //Getters & Setters
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public boolean isAberto() {
        return this.aberto;
    }
}

