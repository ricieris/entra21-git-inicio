package classes.lanches;

import java.util.Scanner;

public class XBurguer extends Sanduiche{
    private boolean aberto;

    public XBurguer() {
        this.adicionarIngrediente("Hambúrguer");
        this.adicionarIngrediente("Presunto");
        this.adicionarIngrediente("Queijo");
        this.adicionarIngrediente("Pão");
        this.setTipo("X-BURGUER");
    }

    public boolean isAberto() {
        return this.aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    @Override
    public void mostrarDetalhesComanda() {
        super.mostrarDetalhesComanda();
        if (this.isAberto()) {
            System.out.println("------LANCHE ABERTO");
            System.out.println("=======================");
        }
    }

    @Override
    public void montarDetalhesLanche(Scanner in) {
        super.montarDetalhesLanche(in);
        System.out.println("Informe se o lanche será aberto (S = Sim / N = Não): ");
        String aberto = in.nextLine();
        this.setAberto(aberto.equalsIgnoreCase("S"));
    }
}