import classes.DVD;
import classes.Item;
import classes.Livro;
import classes.estante.Estante;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static Estante e = new Estante(5);

    public static void main(String[] args) {
        System.out.println("=====LIVRARIA=====");
        System.out.println("=Estante Virtual=");
        while (true) {
            System.out.println();
            System.out.println("Informe sua opção:");
            System.out.println("(1) Adicionar item na estante");
            System.out.println("(2) Buscar item na estante");
            System.out.println("(3) Remover item da estante");
            System.out.println("(4) Mostrar itens da estante");
            System.out.println("(0) Sair");
            int escolha = scan.nextInt();
            scan.nextLine();
            switch (escolha) {
                case 1:
                    adicionarItem();
                    break;
                case 2:
                    buscarItem();
                    break;
                case 3:
                    removerItem();
                    break;
                case 4:
                    mostrarItens();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            if(escolha==0){
                System.out.print("Obrigado por usar a estante virtual!");
                break;
            }
        }
        /*while (true) {
            System.out.print("Deseja avaliar algum item? Se sim, diga sua posição,\nsenão, digite 0: ");
            int pos = in.nextInt();
            in.nextLine();
            if (pos == 0) {
                break;
            }
            e.getItems()[pos - 1].avaliar();
            System.out.print("Nota média: ");
            System.out.println(e.getItems()[pos - 1].getTotalRating());
        }*/
    }

    public static void adicionarItem() {
        Item item;
        System.out.println("===Adicionando um item===");
        System.out.println("Informe sua opção:");
        System.out.println("(1) DVD");
        System.out.println("(2) Livro");
        int objeto = scan.nextInt();
        if (objeto == 1) {
            item = new DVD();
            System.out.println("==Você escolheu adicionar um DVD==");
            System.out.print("Informe o título: ");
            item.setTitulo(scan.nextLine());
            System.out.print("Informe o gênero: ");
            item.setGenero(scan.nextLine());
            System.out.print("Informe o valor: R$");
            item.setValor(scan.nextDouble());
            scan.nextLine();
            System.out.print("Informe o ano de lançamento: ");
            ((DVD) item).setAnoLancamento(scan.nextInt());
            scan.nextLine();
            System.out.print("Informe o nome do(s) diretor(es) (separado por vírgula, enter para confirmar): ");
            ((DVD) item).setDiretor(scan.nextLine());
            System.out.print("Informe a duração: ");
            ((DVD) item).setDuracao(scan.nextDouble());
            scan.nextLine();
            if(!e.adicionarItem(item)){
                System.out.println("O item não foi adicionado!");
            }
        } else if (objeto == 2) {
            item = new Livro();
            System.out.println("==Você escolheu adicionar um LIVRO==");
            System.out.print("Informe o título: ");
            item.setTitulo(scan.nextLine());
            System.out.print("Informe o gênero: ");
            item.setGenero(scan.nextLine());
            System.out.print("Informe o valor: R$");
            item.setValor(scan.nextDouble());
            scan.nextLine();
            System.out.print("Informe o autor: ");
            ((Livro) item).setAutor(scan.nextLine());
            System.out.print("Informe o ano de publicação: ");
            ((Livro) item).setAnoPublicacao(scan.nextInt());
            scan.nextLine();
            System.out.print("Informe a quantidade de páginas: ");
            ((Livro) item).setQtdePaginas(scan.nextInt());
            scan.nextLine();
            System.out.print("Informe a edição: ");
            ((Livro) item).setEdicao(scan.nextInt());
            scan.nextLine();
            if(!e.adicionarItem(item)){
                System.out.println("O item não foi adicionado!");
            }
        }
    }

    public static void buscarItem() {
        System.out.println("===Buscando um item===");
        System.out.print("Informe o título da obra: ");
        String titulo = scan.nextLine();
        int contador = 1;
        for (Item i : e.getItens()) {
            if (i != null && i.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                System.out.println("=======================");
                System.out.println("Posição na estante: " +contador);
                System.out.println("Título: " + i.getTitulo());
                System.out.println("Gênero: " + i.getGenero());
                System.out.println("Valor: R$" + i.getValor());
                if (i instanceof DVD) {
                    System.out.print("Ano de lançamento: ");
                    System.out.println(((DVD) i).getAnoLancamento());
                    System.out.print("Diretor: ");
                    System.out.println(((DVD) i).getDiretor());
                    System.out.print("Duração: ");
                    System.out.println(((DVD) i).getDuracao());
                } else if (i instanceof Livro) {
                    System.out.print("Autor: ");
                    System.out.println(((Livro) i).getAutor());
                    System.out.print("Ano de publicação: ");
                    System.out.println(((Livro) i).getAnoPublicacao());
                    System.out.print("Quantidade de Páginas: ");
                    System.out.println(((Livro) i).getQtdePaginas());
                    System.out.print("Edição: ");
                    System.out.println(((Livro) i).getEdicao());
                }
                System.out.println("=======================");
                System.out.println("(1) Avaliar '" + i.getTitulo() + "'");
                System.out.println("(2) Ver as avaliações de '" + i.getTitulo() + "'");
                System.out.println("(3) Voltar ao menu");
                System.out.print("Escolha: ");
                int escolha = scan.nextInt();
                scan.nextLine();
                if (escolha == 1) {
                    i.avaliar();
                    break;
                } else if (escolha == 2) {
                    i.getAvaliacoes();
                    break;
                } else {
                    break;
                }
            }
            contador++;
        }
        if(contador==5){
            System.out.println("Item não encontrado!");
        }
    }

    public static void removerItem() {
        System.out.println("===Removendo um item===");
        System.out.print("Qual o título da obra que deseja remover: ");
        String titulo = scan.nextLine();
        for (int i = 0; i < e.getCapMaxima(); i++) {
            if (e.getItens()[i] != null && e.getItens()[i].getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                e.getItens()[i] = null;
                System.out.println("Obra removida!");
                break;
            }
            if (i == 4) {
                System.out.println("A obra não existe na estante!");
            }
        }
    }

    public static void mostrarItens() {
        int contador = 1;
        for (Item i : e.getItens()) {
            if (i != null) {
                System.out.println("=======================");
                System.out.println("Posição na estante: " + contador);
                System.out.println("Título: " + i.getTitulo());
                System.out.println("Gênero: " + i.getGenero());
                System.out.println("Valor: R$" + i.getValor());
                if (i instanceof DVD) {
                    System.out.print("Ano de lançamento: ");
                    System.out.println(((DVD) i).getAnoLancamento());
                    System.out.print("Diretor: ");
                    System.out.println(((DVD) i).getDiretor());
                    System.out.print("Duração: ");
                    System.out.println(((DVD) i).getDuracao());
                } else if (i instanceof Livro) {
                    System.out.print("Autor: ");
                    System.out.println(((Livro) i).getAutor());
                    System.out.print("Ano de publicação: ");
                    System.out.println(((Livro) i).getAnoPublicacao());
                    System.out.print("Quantidade de páginas: ");
                    System.out.println(((Livro) i).getQtdePaginas());
                    System.out.print("Edição: ");
                    System.out.println(((Livro) i).getEdicao());
                }
                System.out.println("=======================");
            }
        }
    }
}
//import classes.DVD;
//import classes.Item;
//import classes.Livro;
//import classes.estante.Estante;
//
//import java.util.Scanner;
//
//public class Main {
//    public static Scanner scan = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        Estante e = new Estante(5);
//        for (int i = 0; i < 5; i++) {
//            //  e.adicionarItem(adicionandoUmItem());
//            if (i == 4) {
//                break;
//            }
//            System.out.print("Deseja adicionar mais um item (S = Sim / N = Não): ");
//            if (scan.nextLine().equalsIgnoreCase("N")) {
//                break;
//                // escolhendoQualItem();
//            }
//        }
//    }
//
//    private static void adicionarItem(Estante e) {
//        if (e.estanteCheia()) {
//            System.err.print("Sua estante está cheia! Não é possível adicionar mais nada.");
//        } else {
//            Item i = null;
//            int escolha = 0;
//            while (escolha < 1 || escolha > 2) {
//                System.out.println("Sobre item que deseja adicionar, digite ");
//                System.out.println("1 para DVD");
//                System.out.println("2 para Livro");
//                escolha = scan.nextInt();
//                if (escolha < 1 || escolha > 2) {
//                    System.err.print("Erro! Selecione uma opção válida.");
//                }
//            }
//            scan.nextLine();
//            if (escolha == 1) {
//                i = new Livro();
//            } else {
//                i = new DVD();
//            }
//            System.out.print("Digite o título: ");
//            i.setTitulo(scan.nextLine());
//            System.out.print("Digite o gênero: ");
//            i.setGenero(scan.nextLine());
//            System.out.print("Digite o valor: ");
//            i.setValor(scan.nextDouble());
//            scan.nextLine();
//            if (i instanceof Livro) {
//                Livro l = ((Livro) i);
//                System.out.print("Digite o autor: ");
//                l.setAutor(scan.nextLine());
//                System.out.print("Digite a quantidade de páginas: ");
//                l.setAnoPublicacao(scan.nextInt());
//                System.out.print("Digite a edição: ");
//                l.setEdicao(scan.nextInt());
//                scan.nextLine();
//            } else {
//                DVD dvd = ((DVD) i);
//                System.out.print("Digite o diretor: ");
//                dvd.setDiretor(scan.nextLine());
//                System.out.print("Digite o ano de lançamento: ");
//                System.out.print("Digite a duração: ");
//                dvd.setDuracao(scan.nextInt());
//            }
//            if (!e.adicionarItem(i)) {
//                System.err.print("Não foi possível adicionar o item na estante.");
//            } else {
//                System.out.println("Item adicionado com sucesso!");
//            }
//        }
//    }
//
//
//}