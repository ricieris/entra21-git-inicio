import classes.cliente.Cliente;
import classes.lanches.*;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Cliente cl = new Cliente();
        System.out.print("Informe o nome do cliente: ");
        cl.setNome(in.nextLine());
        while (true) {
            cl.getPedido().adicionarLanche(montarLanche());
            System.out.println("Deseja mais um lanche (S = Sim / N = Não): ");
            if (in.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
        System.out.println("Cliente: " + cl.getNome());
        cl.getPedido().imprimirComanda();
    }

    private static Lanche montarLanche() {
        System.out.println("=MENU:=");
        System.out.println("(1) X-Salada");
        System.out.println("(2) X-Burger");
        System.out.println("(3) X-Misto Quente");
        System.out.println("(4) Hot Dog");
        System.out.println("(5) Mini Pizza");
        System.out.println("(6) Pizza");
        System.out.println();
        System.out.print("Digite sua opção: ");
        int escolha = in.nextInt();  //sempre será utilizado ao ler a escolha
        in.nextLine();
        Lanche lanche = null;

        //Escolha do usuário e criação de qual tipo de lanche será
        switch (escolha) {
            case 1:
                lanche = new XSalada();
                break;
            case 2:
                lanche = new XBurguer();
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
            case 6:
                lanche = new Pizza();
                break;
            default:
                System.err.println("Escolha uma opção válida!");
        }
        lanche.montarDetalhesLanche(in);
        System.out.print("Informe o valor do(a) " + lanche.getTipo() + ": R$");
        lanche.setValor(in.nextDouble());
        in.nextLine();
        return lanche;
    }
}