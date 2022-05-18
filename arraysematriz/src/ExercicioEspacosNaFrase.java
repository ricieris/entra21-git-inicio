import java.util.Scanner;

public class ExercicioEspacosNaFrase {
    public static void main(String[] args) {
        //Variaveis
        String frase;
        int contador = 0;
        Scanner scan = new Scanner(System.in);

        //Entrada
        System.out.print("Digite uma frase: ");
        frase = scan.nextLine();

        //Processamento
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contador = contador + 1;
            }
        }
        //Saida
        System.out.println("A quantidade de espaços na frase digitada é: " + contador);
    }
}