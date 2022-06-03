import classes.lanches.*;

import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        montarLanche();
    }

    private static void montarLanche() {
        System.out.println("=MENU:=");
        System.out.println("(1) X-Salada");
        System.out.println("(2) X-Burger");
        System.out.println("(3) X-Misto Quente");
        System.out.println("(4) Hot Dog");
        System.out.println("(5) Mini Pizza");
        System.out.println("(6) Pizza");
        System.out.println();
        System.out.print("Digite sua opção: ");
        int escolha = scan.nextInt();
        scan.nextLine(); //sempre será utilizado ao ler a escolha
        Lanche lanche = null;

        //Escolha do usuário e criação de qual tipo de lanche será
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
            case 6:
                lanche = new Pizza();
                break;
            default:
                System.err.println("Escolha uma opção válida!");
        }

        //Se o lanche escolhido for algum relacionado ao Sanduíche ele poderá ter adicionais, então fará o seguinte
        if (lanche instanceof Sanduiche) {
            //informando se terá adicionais
            System.out.print("Informe se o lanche terá adicionais (S = Sim / N = Não): ");
            String adicionais = scan.nextLine();
            if (adicionais.equalsIgnoreCase("S")) {
                //adicionando os adicionais (limitado a 10)
                for (int i = 0; i < 10; i++) {
                    //pedir os adicionais para o usuário
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
                ((XBurger) lanche).setAberto(aberto.equalsIgnoreCase("S"));
            }
        } else {
            System.out.println("Informe o sabor da pizza: ");
            System.out.println("(1) 4 Queijos");
            System.out.println("(2) Calabresa");
            System.out.println("(3) Frango com catupiry");
            System.out.println("(4) Marguerita");
            System.out.println("(5) Portuguesa");
            int sabor = scan.nextInt();
            scan.nextLine();
            MiniPizza miniPizza = ((MiniPizza) lanche);
            switch (sabor) {
                case 1:
                    miniPizza.adicionarSaborEIngredientes("4 Queijos");
                    break;

                case 2:
                    miniPizza.adicionarSaborEIngredientes("Calabresa");
                    break;

                case 3:
                    miniPizza.adicionarSaborEIngredientes("Frango com catupiry");
                    break;

                case 4:
                    miniPizza.adicionarSaborEIngredientes("Marguerita");
                    break;

                case 5:
                    miniPizza.adicionarSaborEIngredientes("Portuguesa");
                    break;
                default:
                    System.err.println("Escolha um sabor válido");
            }

            if (lanche instanceof Pizza) {
                System.out.println("Informe o tamanho da pizza");
                System.out.println("(XS) Broto");
                System.out.println("(SM) Pequena");
                System.out.println("(MD) Média");
                System.out.println("(LG) Grande");
                System.out.println("(XL) Família");
                ((Pizza) lanche).setTamanho(scan.nextLine().toUpperCase());
            }

            System.out.print("Informe se terá borda recheada (S = Sim / N = Não): ");
            String bordaRecheada = scan.nextLine();
            miniPizza.setBordaRecheada(bordaRecheada.equalsIgnoreCase("S"));
            if (bordaRecheada.equalsIgnoreCase("S")) {
                System.out.print("Digite o sabor da borda recheada: ");
                miniPizza.setBordaSabor(scan.nextLine());
            }
        }
        System.out.print("Informe o valor do(a) " + lanche.getTipo() + ": R$");
        lanche.setValor(scan.nextDouble());
    }
}