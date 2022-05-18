import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        exe13();
    }

    public static void exe13() {
        //Variaveis
        int qtddmaca;
        double custo;
        Scanner scan = new Scanner(System.in);

        //Entrada
        System.out.print("Digite a quantidade de maçãs compradas: ");
        qtddmaca = scan.nextInt();

        //Processamento
        if (qtddmaca >= 12) {
            custo = qtddmaca * 1.00;
        } else {
            custo = qtddmaca * 1.30;
        }

        //Saída
        System.out.printf("O valor da compra é: R$%.2f", custo);
    }
}