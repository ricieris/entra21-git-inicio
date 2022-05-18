import java.util.Scanner;

public class SomaDeUmNroDeUmAteEle {

    public static void main(String[] args) {
        //Variaveis
        int numero;
        int soma = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número a ser somado com seus antecessores: ");
        numero = scan.nextInt();

        //Processamento
        for (int i = 1; i <= numero; i++) {
            soma += i;
        }

        System.out.println("Soma =" + soma);
    }
}

//while (numero > 0) {
//soma += numero;
//numero--;
//sout"soma="+soma
