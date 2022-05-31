package classes;

public class XBurger extends Sanduiche {

    private boolean aberto;

    public XBurger() {

        this.adicionarIngrediente("Hambúrguer");
        this.adicionarIngrediente("Queijo");
        this.adicionarIngrediente("Presunto");
        this.adicionarIngrediente("Pão");

        this.setTipo("X-BURGUER");

    }

    @Override
    public void montarComanda() {
        super.montarComanda();
        if (this.isAberto()) {
            System.out.println("------LANCHE ABERTO");
            System.out.println("=======================");
        }
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public boolean isAberto() {
        return this.aberto;
    }
}

