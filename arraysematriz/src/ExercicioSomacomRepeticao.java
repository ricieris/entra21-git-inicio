import java.util.Scanner;

public class ExercicioSomacomRepeticao {
    public static void main(String[] args) {
        //Variaveis
        int valor;
        int soma = 0;
        int contador = 0;
        Scanner scan = new Scanner(System.in);

        while (contador < 5) {
            System.out.print("Digite um valor a ser somado: ");
            valor = scan.nextInt();
            contador++;
            soma = soma + valor;
        }
        System.out.print("A soma é: "+soma);
    }
}
//Correção
int soma2 = 0;
for (int i2 = 0; i2 <5; i2++){
        System.out.print("Digite um valor a ser somado: ");
        soma2 += scan.nextInt();
        System.out.print("A soma é: "+soma);
