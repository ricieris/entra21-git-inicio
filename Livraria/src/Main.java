import classes.DVD;
import classes.Item;
import classes.Livro;
import classes.estante.Estante;

import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Estante e = new Estante(5);
        for (int i = 0; i < 5; i++) {
            //  e.adicionarItem(adicionandoUmItem());
            if (i == 4) {
                break;
            }
            System.out.print("Deseja adicionar mais um item (S = Sim / N = Não): ");
            if (scan.nextLine().equalsIgnoreCase("N")) {
                break;
                // escolhendoQualItem();
            }
        }
    }

    private static void adicionarItem(Estante e) {
        if (e.estanteCheia()) {
            System.err.print("Sua estante está cheia! Não é possível adicionar mais nada.");
        } else {
            Item i = null;
            int escolha = 0;
            while (escolha < 1 || escolha > 2) {
                System.out.println("Sobre item que deseja adicionar, digite ");
                System.out.println("1 para DVD");
                System.out.println("2 para Livro");
                escolha = scan.nextInt();
                if (escolha < 1 || escolha > 2) {
                    System.err.print("Erro! Selecione uma opção válida.");
                }
            }
            scan.nextLine();
            if (escolha == 1) {
                i = new Livro();
            } else {
                i = new DVD();
            }
            System.out.print("Digite o título: ");
            i.setTitulo(scan.nextLine());
            System.out.print("Digite o gênero: ");
            i.setGenero(scan.nextLine());
            System.out.print("Digite o valor: ");
            i.setValor(scan.nextDouble());
            scan.nextLine();
            if (i instanceof Livro) {
                Livro l = ((Livro) i);
                System.out.print("Digite o autor: ");
                l.setAutor(scan.nextLine());
                System.out.print("Digite a quantidade de páginas: ");
                l.setAnoPublicacao(scan.nextInt());
                System.out.print("Digite a edição: ");
                l.setEdicao(scan.nextInt());
                scan.nextLine();
            } else {
                DVD dvd = ((DVD) i);
                System.out.print("Digite o diretor: ");
                dvd.setDiretor(scan.nextLine());
                System.out.print("Digite o ano de lançamento: ");
                System.out.print("Digite a duração: ");
                dvd.setDuracao(scan.nextInt());
            }
            if (!e.adicionarItem(i)) {
                System.err.print("Não foi possível adicionar o item na estante.");
            } else {
                System.out.println("Item adicionado com sucesso!");
            }
        }
    }


}