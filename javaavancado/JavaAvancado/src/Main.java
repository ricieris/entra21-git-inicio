import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ex3();
    }

    public static void ex1() {
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
//        for (int i = 0; i < inteiros.size(); i++) {
//            if (i > 0 && i < inteiros.size()) {
//            }
//            System.out.println(inteiros.get(i));
//            }
    }


    public static void ex2() {
        //Pedir para o usuário informar valores inteiros até que seja infromado 0
        // Quando for informado 0, mostrar os valores que o usuário digitou
        //Mostrar a soma dos numeros pares e dos numeros impares;
        //Mostrar a media de todos os valores informados;
//        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
//        arr.add(new ArrayList<>());
//        arr.add(new ArrayList<>());
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


    public static void ex3() {
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
}
