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
        scan.nextLine(); //sempre será utilizado
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
        if (lanche instanceof Sanduiche) {
            //adicionais
            System.out.print("Informe se o lanche terá adicionais (S = Sim / N = Não): ");
            String adicionais = scan.nextLine();
            if (adicionais.equalsIgnoreCase("S")) {
                //adicionar os adicionais
                for (int i = 0; i < 10; i++) {
                    //pedir os adicionais
                    System.out.print("Informe o adicional: ");
                    ((Sanduiche) lanche).adicionarAdicional(scan.nextLine());
                    System.out.print("Deseja adicionar mais algum adicional? (S = Sim / N = Não): ");
                    String parada = scan.nextLine();
                    if (parada.equalsIgnoreCase("N")) {
                        break;
                    }
                }
            }
            if (lanche instanceof XBurger) {
                System.out.print("Informe se o lanche será aberto (S = Sim / N = Não): ");
                String aberto = scan.nextLine();
                ((XBurger) lanche).aberto = aberto.equalsIgnoreCase("S");
            }
        } else {
            System.out.print("Informe se a mini pizza terá borda recheada (S = Sim / N = Não): ");
            String bordaRecheada = scan.nextLine();
            MiniPizza miniPizza = ((MiniPizza) lanche);
            miniPizza.bordaRecheada = bordaRecheada.equalsIgnoreCase("S");
            if (bordaRecheada.equalsIgnoreCase("S")){
                System.out.print("Digite o sabor da borda recheada: ");
                miniPizza.bordaSabor = scan.nextLine();
            }
        }
        System.out.print("Informe o valor do(a) " + lanche.tipo + ": R$");
        lanche.valor = scan.nextDouble();
        lanche.montarComanda();
    }
}