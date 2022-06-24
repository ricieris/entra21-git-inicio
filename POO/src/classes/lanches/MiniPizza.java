package classes.lanches;

public class MiniPizza extends Lanche {

    private boolean bordaRecheada;
    private String bordaSabor;
    private String sabor;

    public MiniPizza() {

        //Ingredientes padrão
        this.adicionarIngrediente("Massa");
        this.adicionarIngrediente("Massa de tomate");
        this.adicionarIngrediente("Mozzarella");

        this.setTipo("MINI PIZZA");
    }

    public void adicionarSaborEIngredientes(String sabor) {
        this.setSabor(sabor);
        switch (sabor) {
            case " 4 Queijos":
                this.adicionarIngrediente("Cheddar");
                this.adicionarIngrediente("Catupiry");
                this.adicionarIngrediente("Provolone");
                break;
            case "Calabresa":
                this.adicionarIngrediente("Calabresa");
                break;
            case "Frango com catupity":
                this.adicionarIngrediente("Frango");
                this.adicionarIngrediente("Catupiry");
                break;
            case "Marguerita":
                this.adicionarIngrediente("Tomate");
                this.adicionarIngrediente("Manjericão");
                break;
            case "Portuguesa":
                this.adicionarIngrediente("Presunto");
                this.adicionarIngrediente("Cebola");
                this.adicionarIngrediente("Ovo");
                break;
        }
    }




    //Getters & Setters
    public void setBordaRecheada(boolean bordaRecheada) {
        this.bordaRecheada = bordaRecheada;
    }

    public boolean isBordaRecheada() {
        return this.bordaRecheada;
    }

    public void setBordaSabor(String bordaSabor) {
        this.bordaSabor = bordaSabor;
    }

    public String getBordaSabor() {
        return this.bordaSabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getSabor() {
        return this.sabor;
    }
}