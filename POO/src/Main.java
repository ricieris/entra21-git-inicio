import classes.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("=MENU:=");
        System.out.println("(1) X-Salada");
        System.out.println("(2) X-Burger");
        System.out.println("(3) X-Misto Quente");
        System.out.println("(4) Hot Dog");
        System.out.println("(5) Mini Pizza (Só Calabresa)");
        System.out.println();
        System.out.print("Digite sua opção: ");
        int escolha = scan.nextInt();
        Lanche lanche = null;

        switch (escolha) {
            case 1:
                lanche = new XSalada();
                break;

            case 2:
                lanche = new XBurger();
                break;

            case 3:
                lanche = new MistoQuente();
                break;

            case 4:
                lanche = new HotDog();
                break;

            case 5:
                lanche = new MiniPizza();
                break;

            default:
                System.err.println("Escolha uma opção válida!");
        }
        if (escolha == 1 || escolha == 2) {
            System.out.print("Informe se o lanche será aberto (S = Sim / N = Não): ");
            scan.nextLine();
            String aberto = scan.nextLine();
            ((XBurger) lanche).aberto = aberto.equalsIgnoreCase("S");
        } else if (escolha == 5) {
            System.out.print("Informe se a mini pizza terá borda recheada (S = Sim / N = Não): ");
            scan.nextLine();
            String bordaRecheada = scan.nextLine();
            MiniPizza miniPizza = ((MiniPizza) lanche);
            ((MiniPizza) lanche).bordaRecheada = bordaRecheada.equalsIgnoreCase("S");
            if (((MiniPizza) lanche).bordaRecheada) {
                System.out.println("Digite o sabor da borda recheada");
                String bordaSabor = scan.nextLine();
                ((MiniPizza) lanche).bordaSabor = bordaSabor;

            }

        }
        System.out.print("Informe o valor do(a) "+lanche.tipo+": R$");
        lanche.valor = scan.nextDouble();
        lanche.montarComanda();
    }
}
