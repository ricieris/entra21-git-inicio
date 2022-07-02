import classes.EMenu;
import classes.EMenuItem;
import classes.avaliacao.Avaliacao;
import classes.guardados.Estante;
import classes.itens.DVD;
import classes.itens.Item;
import classes.itens.Livro;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Estante e = new Estante(5);
        boolean loop = true;
        while (loop) {
            EMenu opcao = escolherOpcao();
            switch (opcao) {
                case SAIR -> loop = false;
                case ADICIONAR_ITEM -> adicionarItem(e);
                case BUSCAR_ITEM -> buscarItemETratarRetorno(e);
                case REMOVER_ITEM -> removerItem(e);
                case MOSTRAR_ITENS -> mostarItens(e);
                default -> System.out.println("Opção não implementada!");
            }
        }
        System.out.println("Programa finalizado!");
    }

    public static EMenu escolherOpcao() {
        EMenu escolha = null;
        while (escolha == null) {
            System.out.println("Selecione uma opção");
            for (EMenu menu : EMenu.values()) {
                System.out.printf("(%d) - %s\n", menu.getValorOpcao(), menu.getDescricao());
            }
            escolha = EMenu.getByValorOpcao(in.nextInt());
            in.nextLine();
            if (escolha == null) {
                System.err.println("Selecione uma opção válida!");
            }
        }
        return escolha;
    }

    // Adicionar item na estante
    public static void adicionarItem(Estante e) {
        if (e.estanteCheia()) {
            System.err.println("Sua estante está cheia! Não é possível adicionar mais itens!");
        } else {
            Item i = null;
            int escolha = -1;
            while (escolha < 0 || escolha > 1) {
                System.out.print("Informe o item que deseja adicionar (0 - Livro / 1 - DVD): ");
                escolha = in.nextInt();
                if (escolha < 0 || escolha > 1) {
                    System.err.println("Selecione uma opção válida");
                }
            }
            in.nextLine();
            if (escolha == 0) {
                i = new Livro();
            } else {
                i = new DVD();
            }
            System.out.print("Informe o título: ");
            i.setTitulo(in.nextLine());
            System.out.print("Informe o gênero: ");
            i.setGenero(in.nextLine());
            System.out.print("informe o valor: R$");
            i.setValor(in.nextDouble());
            in.nextLine();
            i.montarDetalhes(in);
            if (!e.adicionarItem(i)) {
                System.err.println("Não foi possível adicionar o item na estante!");
            } else {
                System.out.println("Item adicionado com sucesso!");
            }
        }
    }

    public static void buscarItemETratarRetorno(Estante e) {
        System.out.print("Informe o título para busca: ");
        Item i = e.buscarItem(in.nextLine());
        if (i == null) {
            System.err.println("O título buscado não existe na estante!");
        } else {
            EMenuItem escolha = null;
            while (escolha == null) {
                System.out.println(i.getTitulo() + " encontrado! Ações disponíveis: ");
                for (EMenuItem item : EMenuItem.values()) {
                    System.out.printf("(%d) %s\n", item.getValorOpcao(), item.getDescricao());
                }
                //escolha = EMenuItem.valueOf(in.nextLine());
                //escolha = EMenuItem.getByValorOpcao(in.nextInt());
                if (escolha == null) {
                    System.err.println("Selecione uma opção válida");
                }
            }
            in.nextLine();
            switch (escolha) {
                case VOLTAR -> System.out.println("Retornando...");
                case VER_AVALIACOES -> mostarAvaliacoes(i);
                case AVALIAR_ITEM -> i.avaliar();
                default -> System.out.println("Não implementado ainda.");
            }
        }
    }

    public static void mostarAvaliacoes(Item i) {
        for (Avaliacao a : i.getAvaliacoes()) {
            if (a != null) {
                System.out.println("Autor: " + a.getNome());
                System.out.println("avaliação: " + a.getRating());
                System.out.println("Comentário: ");
                System.out.println(a.getFeedback());
                System.out.println("--------------------");
            }
        }
        System.out.println("Classificação final: " + i.getTotalRating());
    }

    public static void removerItem(Estante e) {
        if (e.quantidadeItens() == 0) {
            System.err.println("Não é possível remover itens de uma estante vazia!");
        } else {
            int posicao = -1;
            while (posicao < 0 || posicao > e.getCapMaxima()) {
                System.out.print("Informe a posição do item para remover: ");
                posicao = in.nextInt();
                if (posicao < 0 || posicao > e.getCapMaxima()) {
                    System.err.println("Selecione uma opção válida!");
                }
            }
            in.nextLine();
            Item i = e.removerItem(posicao);
            if (i != null) {
                System.out.println("Item " + i.getTitulo() + " removido!");
            }
        }
    }

    public static void mostarItens(Estante e) {
        if (e.quantidadeItens() == 0) {
            System.out.println("Estante vazia!");
        } else {
            for (int i = 0; i < e.getCapMaxima(); i++) {
                Item item = e.getItens().get(i);
                if (item != null) {
                    System.out.println("[" + i + "] " + item.getTitulo() + " (" + item.getGenero() + ")");
                }
            }
        }
    }
}