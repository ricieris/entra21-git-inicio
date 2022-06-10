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
            e.adicionarItem(escolhendoQualItem());
            if (i == 4) {
                break;
            }


            // escolhendoQualItem();
        }
    }

    private static Item escolhendoQualItem() {


        System.out.println("==== Itens ====");
        System.out.println("(1) DVD");
        System.out.println("(2) Livro");
        System.out.println();
        System.out.print("Digite sua opção: ");
        int escolha = scan.nextInt();
        scan.nextLine(); //sempre será utilizado ao ler a escolha
        Item item = null;

        //Escolha do usuário e criação de qual tipo de item será
        switch (escolha) {
            case 1:
                item = new DVD();
                break;

            case 2:
                item = new Livro();
                break;
        }

        if (item instanceof DVD) {
            System.out.print("Digite o título do item: ");
            ((DVD) item).setTitulo(scan.nextLine());
            System.out.print("Digite o gênero do item: ");
            ((DVD) item).setGenero(scan.nextLine());
            System.out.print("Digite o valor do item: ");
            ((DVD) item).setValor(scan.nextDouble());
            //Talvez aqui vá a avaliação mas não sei então não fiz
            System.out.print("Digite o diretor do item: ");
            ((DVD) item).setDiretor(scan.nextLine());
            System.out.print("Digite a duração do item: ");
            ((DVD) item).setDuracao(scan.nextDouble());
            System.out.print("Digite o ano de lançamento do item: ");
            ((DVD) item).setAnoLancamento(scan.nextInt());

        } else {
            System.out.print("Digite o título do item: ");
            ((Livro) item).setTitulo(scan.nextLine());
            System.out.print("Digite o gênero do item: ");
            ((Livro) item).setGenero(scan.nextLine());
            System.out.print("Digite o valor do item: ");
            ((Livro) item).setValor(scan.nextDouble());
            scan.nextLine();
            //Talvez aqui vá a avaliação mas não sei então não fiz
            System.out.print("Digite o autor do item: ");
            ((Livro) item).setAutor(scan.nextLine());
            System.out.print("Digite a quantidade de páginas do item: ");
            ((Livro) item).setAnoPublicacao(scan.nextInt());
            System.out.print("Digite a edição do item: ");
            ((Livro) item).setEdicao(scan.nextInt());

        }
        return item;

    }
}

//        Livro l = new Livro();
//        l.setTitulo("Harry Potter e a Autora Transfóbica");
//        l.avaliar();
//        l.avaliar();
//        l.avaliar();
//        System.out.println(l.getTotalRating());