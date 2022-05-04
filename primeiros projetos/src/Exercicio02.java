import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        exe02();
    }

    public static void exe02() {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor");
        int numero = in.nextInt();
        System.out.println(--numero);

    }
}