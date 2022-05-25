package classes;

public class XBurger extends Lanche {

    public boolean aberto;

    public XBurger() {

        this.adicionarIngrediente("Hambúrguer");
        this.adicionarIngrediente("Queijo");
        this.adicionarIngrediente("Presunto");
        this.adicionarIngrediente("Pão");

        this.tipo = "X-BURGER";

    }

    @Override
    public void montarComanda() {
        super.montarComanda();
        if (this.aberto) {
            System.out.println("------LANCHE ABERTO");
            System.out.println("=======================");
        }
    }
}
