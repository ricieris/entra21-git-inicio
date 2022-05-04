import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        //Variaveis
        Scanner scan = new Scanner(System.in);
        int valor;
        int i;

        //Entrada e início do processamento
        do {
            System.out.print("Digite qual tabuada deseja saber: ");
            valor = scan.nextInt();
            if (valor != 0) {
                //Processamento e saída (quando zero for informado finaliza)
                    for (i = 0; i <= 10; i++) {
                        System.out.println(i * valor);
                    }
            }
        } while (valor != 0);
    }
}