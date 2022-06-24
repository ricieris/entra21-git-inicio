package classes.lanches;

import java.util.Scanner;

public class Pizza extends MiniPizza{
    private String tamanho;

    public Pizza() {
        this.setTipo("PIZZA");
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return this.tamanho;
    }

    @Override
    public void mostrarDetalhesComanda() {
        super.mostrarDetalhesComanda();
        System.out.println("Tamanho: " + this.getTamanho());
    }

    @Override
    public void montarDetalhesLanche(Scanner in) {
        super.montarDetalhesLanche(in);
        System.out.println("Informe o tamanho da pizza");
        System.out.println("(XS) Broto");
        System.out.println("(SM) Pequena");
        System.out.println("(MD) Média");
        System.out.println("(LG) Grande");
        System.out.println("(XL) Família");
        this.setTamanho(in.nextLine().toUpperCase());
    }
}
