package classes.pedido;

import classes.lanches.*;

import java.util.ArrayList;

public class Pedido {

    private ArrayList<Lanche> lanches = new ArrayList<>();

    public void imprimirComanda() {

        for (Lanche l : this.getLanches()) {
            if (l != null) {
                if (l instanceof MiniPizza) {
                    MiniPizza mp = ((MiniPizza) l); // aqui é criado uma variável conventendo o lanche inteiro em Mini Pizza, pra ficar mais legível.
                    System.out.println();
                    System.out.println("=====" + mp.getTipo() + " = " + mp.getSabor() + "=====");
                    if (mp.isBordaRecheada()) {
                        System.out.println("------COM BORDA RECHEADA \n SABOR: " + mp.getBordaSabor());
                        System.out.println("=======================");
                    }
                    if (l instanceof Pizza) {
                        System.out.println("Tamanho: " + ((Pizza) l).getTamanho());
                    }
                } else {
                    System.out.println();
                    System.out.println("=====" + l.getTipo() + "=====");
                }
                if (l instanceof XBurger) {
                    if (((XBurger) l).isAberto()) {
                        System.out.println("------LANCHE ABERTO");
                        System.out.println("=======================");
                    }
                }
                System.out.printf("VALOR: R$%.2f\n", l.getValor());
                System.out.println();
                System.out.println("=INGREDIENTES=");
                for (String ingrediente : l.getIngredientes()) {
                        System.out.println(ingrediente);
                    }
                }
                System.out.println("=======================");
                if (l instanceof Sanduiche) {
                    Sanduiche s = (Sanduiche) l;
                    if (s.getAdicionais()[0] != null) {
                        System.out.println("=ADICIONAIS=");
                        for (String adicional : s.getAdicionais()) {
                            if (adicional != null) {
                                System.out.println(adicional);

                            }
                        }
                        System.out.println("=======================");
                    }
                }
            }

        System.out.printf("Valor total do pedido: R$%.2f\n", this.calcularValorTotal());
    }


    public double calcularValorTotal() {
        double vlrTotal = 0;
        for (Lanche l : this.getLanches()) {
            vlrTotal += l.getValor();
        }
        return vlrTotal;
    }

    public void adicionarLanche(Lanche lanche) {
        this.lanches.add(lanche);
    }


    //Getters & Setters

    public ArrayList<Lanche> getLanches() {
        return this.lanches;
    }
}
