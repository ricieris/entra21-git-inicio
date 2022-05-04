import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args)  {exe15();}

    public static void exe15() {
        //Variaveis
        int valor1;
        int valor2;
        int maiorvalor;
        Scanner scan = new Scanner(System.in);

        //Entrada
        System.out.print("Digite o primeiro valor: ");
        valor1 = scan.nextInt();
        System.out.print("Digite o segundo valor: ");
        valor2 = scan.nextInt();

        //Processamento
        //System.out.println Math.max(valor1, valor2); poderia ser dessa forma
        if (valor1 > valor2) {
            maiorvalor = valor1;
        } else {
            maiorvalor = valor2;
        }

        //Saída
        System.out.println("O maior valor é "+maiorvalor);
    }
}