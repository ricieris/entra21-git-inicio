import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        exe12();
    }

    public static void exe12() {
        //Variaveis
        double numero;
        Scanner scan = new Scanner(System.in);

        //Entrada
        System.out.print("Digite um número: ");
        numero = scan.nextDouble();

        //Processamento e saída
        if (numero >= 0) {
            System.out.println("O número "+numero+" é positivo.");
        } else {
            System.out.println("O número "+numero+" é negativo.");
        }
    }
}