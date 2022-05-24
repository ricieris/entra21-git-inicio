import classes.HotDog;
import classes.MistoQuente;
import classes.XBurger;
import classes.XSalada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("~MENU:~");
        System.out.println("(1) X-Salada");
        System.out.println("(2) X-Burger");
        System.out.println("(3) X-Misto Quente");
        System.out.println("(4) Hot Dog");
        System.out.println();
        System.out.print("Digite sua opção: ");
        int escolha = scan.nextInt();

        switch (escolha) {
            case 1:
                XSalada lanche = new XSalada();

                System.out.print("Informe o valor do X-Salada: R$");
                lanche.valor = scan.nextDouble();

                System.out.print("Informe se o lanche será aberto (S = Sim / N = Não): ");
                scan.nextLine();
                String aberto = scan.nextLine();
                lanche.aberto = aberto.equalsIgnoreCase("S");
                lanche.montarComanda();
            break;

            case 2:
                XBurger lanche2 = new XBurger();

                System.out.print("Informe o valor do X-Burger: R$");
                lanche2.valor = scan.nextDouble();

                System.out.print("Informe se o lanche será aberto (S = Sim / N = Não): ");
                scan.nextLine();
                String aberto2 = scan.nextLine();
                lanche2.aberto = aberto2.equalsIgnoreCase("S");
                lanche2.montarComanda();
            break;

            case 3:
                MistoQuente lanche3 = new MistoQuente();
                System.out.print("Informe o valor do Misto Quente: R$");
                lanche3.valor = scan.nextDouble();
                lanche3.montarComanda();
                break;

            case 4:
                HotDog lanche4 = new HotDog();
                System.out.print("Informe o valor do Hot Dog: R$");
                lanche4.valor = scan.nextDouble();
                lanche4.montarComanda();
                break;

            default:
                System.err.println("Escolha uma opção válida!");
        }
    }
}
