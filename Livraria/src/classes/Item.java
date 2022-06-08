package classes;

import classes.avaliacao.Avaliacao;

import java.util.Scanner;

public abstract class Item {
    private String titulo;
    private String genero;
    private double valor;
    private Avaliacao[] avaliacoes = new Avaliacao[30];

    public void avaliar() {
        Scanner scan = new Scanner(System.in);
        Avaliacao a = new Avaliacao();
        System.out.println("Informe o nome do avaliador: ");
        a.setNome(scan.nextLine());
        System.out.println("Informe a nota de 0 a 10: ");
        a.setRating(scan.nextDouble());
        scan.nextLine();
        System.out.println("Diga mais sobre o que achou: (opcional)");
        a.setFeedback(scan.nextLine());
        for (int i = 0; i < getAvaliacoes().length; i++) {
            if (getAvaliacoes()[i] == null) {
                getAvaliacoes()[i] = a;
                break;
            }
        }
    }

    public double getTotalRating() {
        //TODO
        double somaTotal = 0;
        int contadorDeRating = 0;
        for (Avaliacao a : getAvaliacoes()) {
            if (a != null) {
                somaTotal += a.getRating();
                contadorDeRating++;
            }
        }
        return somaTotal / contadorDeRating;
    }


    //Getters & Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Avaliacao[] getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(Avaliacao[] avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
}
