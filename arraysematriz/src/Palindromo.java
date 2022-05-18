import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {

        String palavra;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a palavra a ser analisada: ");
        palavra = scan.nextLine();

        String revertendo = "";
        for (int i = palavra.length()-1; i >= 0; i--) {
            revertendo += palavra.charAt(i);
        }

        if (revertendo.equals(palavra)) {
            System.out.println("A palavra " + palavra + " é um palíndromo.");

        } else {
            System.out.println("A palavra " + palavra + " é um palíndromo.");
        }

    }
}