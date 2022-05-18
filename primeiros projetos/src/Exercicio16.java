import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        exe16();
    }

    public static void exe16() {
        //Variaveis
        int valor1;
        int valor2;
        int maiorvalor;
        int menorvalor;
        Scanner scan = new Scanner(System.in);

        //Entrada
        System.out.print("Digite o primeiro valor: ");
        valor1 = scan.nextInt();
        System.out.print("Digite o segundo valor: ");
        valor2 = scan.nextInt();

        //Processamento
        if (valor1 > valor2) {
            maiorvalor = valor1;
            menorvalor = valor2;
        } else {
            maiorvalor = valor2;
            menorvalor = valor1;
        }
        //Saida
        System.out.println("Os valores em ordem crescente são: "+menorvalor+" e "+maiorvalor+".");
    }
}
