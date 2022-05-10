import java.util.Scanner;

public class FatorialDeUmNumero {

    public static void main(String[] args) {

        //Variaveis
        int numero;
        int fatorial = 1;
        Scanner scan = new Scanner(System.in);

        //Entrada
        System.out.print("Informe um número para saber seu fatorial: ");
        numero = scan.nextInt();

        //Processamento
        if (numero == 0) {
            fatorial = 0;
        } else {
            for (int n = numero; n > 0; n--) {
                fatorial *= n;
            }
        }
        //Saida
        System.out.println("Fatorial do " + numero + " é = " + fatorial);
    }
}
