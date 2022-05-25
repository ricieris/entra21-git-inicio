package classes;

public class MiniPizza extends Lanche {

    public boolean bordaRecheada;
    public String bordaSabor;

    public MiniPizza() {

        this.adicionarIngrediente("Massa");
        this.adicionarIngrediente("Massa de tomate");
        this.adicionarIngrediente("Queijo");
        this.adicionarIngrediente("Calabresa");
        this.adicionarIngrediente("Cebola");
        this.adicionarIngrediente("Orégano");

        this.tipo = "MINI PIZZA";
    }

    @Override
    public void montarComanda() {
        super.montarComanda();
        if (this.bordaRecheada) {
            System.out.println("------COM BORDA RECHEADA \n SABOR: "+this.bordaSabor);
            System.out.println();
            System.out.println("=======================");
        }
    }
}