package classes.lanches;

public class Pizza extends MiniPizza {

    private String tamanho;

    public Pizza() {
        this.setTipo("PIZZA");
    }


    //Getters & Setters
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return this.tamanho;
    }
}