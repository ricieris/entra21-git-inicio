import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ex04();
    }

    public static void ex01() {
        //Pedir pro usuário informar n números inteiros até ele digitar 0
        //quando ele digitar 0, mostrar a lista dos números digitados;
        ArrayList inteiros = new ArrayList();
        while (true) {
            System.out.print("Informe um número inteiro: ");
            int escolha = scan.nextInt();
            inteiros.add(escolha);
            if (escolha == 0) {
                break;
            }
        }
        System.out.println("===Valores informados===");
        System.out.println(inteiros);
    }


    public static void ex02() {
        //Pedir para o usuário informar valores inteiros até que seja infromado 0
        // Quando for informado 0, mostrar os valores que o usuário digitou
        //Mostrar a soma dos numeros pares e dos numeros impares;
        //Mostrar a media de todos os valores informados;

        ArrayList<Integer> inteiros = new ArrayList<>();
        while (true) {
            System.out.print("Informe um número inteiro (0 para parar): ");
            int escolha = scan.nextInt();
            if (escolha == 0) {
                break;
            }
            inteiros.add(escolha);
        }
        int somaPares = 0;
        int somaImpares = 0;
        for (int i = 0; i < inteiros.size(); i++) {
            int numero = inteiros.get(i);
            if (numero % 2 == 0) {
                somaPares += numero;
            } else if (numero % 2 != 0) {
                somaImpares += numero;
            }
        }
        double somaTotal = somaPares + somaImpares;
        double media = somaTotal / (inteiros.size() - 1);
        System.out.println("Os valores informados foram: " + inteiros);
        System.out.println("A soma dos pares é: " + somaPares);
        System.out.println("A soma dos pares é: " + somaImpares);
        System.out.println("A média total dos números é: " + media);
    }


    public static void ex03() {
        //o usuario informa varias palavras (String) até ele digitar SAIR.
        //o usuario informa um numero inteiro > 0;
        //Remover todas as palavras com menos caracteres que o informado.
        ArrayList<String> palavras = new ArrayList<>();
        while (true) {
            System.out.print("Informe palavaras a seguir (Digite SAIR para encerrar): ");
            String pal = scan.nextLine();
            if (pal.equalsIgnoreCase("Sair")) {
                break;
            }
            palavras.add(pal);
        }
        System.out.println(palavras);
        System.out.print("Informe um número: ");
        int limite = scan.nextInt();
        for (int i = 0; i < palavras.size(); i++) {
            if (palavras.get(i).length() < limite) {
                palavras.remove(i);
                i--;
            }
        }
        System.out.println("As palavras maiores ou iguais a " + limite + " caracteres são: ");
        System.out.println(palavras);
    }


    public static void ex04() {
        // EXPLICAÇÃO SOBRE HASHLIST MANUAL E
        // TAMBÉM COMO PRINTAR UM HASHLIST DE DUAS FORMAS

//        HashMap<String, Double> produtos = new HashMap<>();
//        produtos.put("Maçã", 2.6);
//        produtos.put("Banana", 0.4);
//        produtos.put("Abacate", 1.5);
//        System.out.print(produtos);
// Outra forma de imprimir a Hashlist;
//        for (String key : produtos.keySet()) {
//            System.out.println(key + " custa R$" + produtos.get(key));

        HashMap<String, Double> produtos = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        boolean executa = true;
        while (true) {
            System.out.println("===MENU===");
            System.out.println("(1) Cadastrar produto");
            System.out.println("(2) Buscar produto");
            System.out.println("(3) Remover produto");
            System.out.println("(4) Mostrar lista e valores dos produtos");
            System.out.println("(0) Sair");
            int escolha = scan.nextInt();
            scan.nextLine();
            switch (escolha) {
                case 0:
                    executa = false;
                    break;

                case 1:
                    System.out.print("Informe o nome do produto a ser cadastrado: ");
                    String chave = scan.nextLine().toLowerCase();
                    if (produtos.containsKey(chave)) {
                        System.out.print("Produto já existente, deseja atualizar o valor? (S = Sim / N = Não): ");
                        if (scan.nextLine().equalsIgnoreCase("N")) {
                            break;
                        }
                    }
                    System.out.print("Informe o valor do produto: R$");
                    double valor = scan.nextDouble();
                    produtos.put(chave, valor);
                    break;

                case 2:
                    if (produtos.isEmpty()) {
                        System.out.println("Não há produtos cadastrados.");
                    } else {
                        System.out.println("Informe o produto: ");
                        String busca = scan.nextLine().toLowerCase();
                        if (produtos.containsKey(busca)) {
                            System.out.println(busca + " - " + produtos.get(busca));
                        } else {
                            System.out.println("Produto " + busca + " não encontrado");
                        }
                    }

                case 3:
                    if (produtos.isEmpty()) {
                        System.out.println("Não há produtos cadastrados.");
                    } else {
                        System.out.println("Informe o produto: ");
                        String busca = scan.nextLine().toLowerCase();
                        if (produtos.containsKey(busca)) {
                            produtos.remove(busca);
                        } else {
                            System.out.println("Produto " + busca + " não encontrado");
                        }
                    }

                case 4:
                    for (String key : produtos.keySet()) {
                        System.out.println(key + " - R$" + produtos.get(key));
                    }
                    break;
                default:
                    System.err.println("Informe uma opção válida.");
                    break;
            }
        }
    }
}