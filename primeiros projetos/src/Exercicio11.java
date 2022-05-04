import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {exe11();}

    public static void exe11() {
        //Variaveis
        double valor;
        Scanner scan = new Scanner(System.in);

        //Entrada
        System.out.print("Digite um valor: ");
        valor = scan.nextDouble();

        //Processamento
        if(valor > 10) {
            //Saída
            System.out.println("O valor é maior que 10.");
        } else {
            System.out.println("O valor é menor que 10.");
        }
    }
}


