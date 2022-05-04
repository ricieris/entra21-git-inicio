import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        exe09();
    }

    public static void exe09() {
        //Variaveis
        double GrausFahrenheit;
        double GrausCelsius;
        Scanner scan = new Scanner(System.in);

        //Entrada
        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        GrausFahrenheit = scan.nextDouble();

        //Processamento
        GrausCelsius = ((GrausFahrenheit - 32)* 5 / 9);

        //Saída
        System.out.println("O valor correspondente em graus Celsius é: "+GrausCelsius);
    }
}

