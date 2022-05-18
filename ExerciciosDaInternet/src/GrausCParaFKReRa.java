import java.util.Scanner;

public class GrausCParaFKReRa {

    public static void main(String[] args) {
        //Variaveis
        double Celsius;
        double Fahreinheit;
        double Kelvin;
        double Reaumur;
        double Rankine;
        Scanner scan = new Scanner(System.in);

        //Entrada
        System.out.print("Para saber a temperatura em F, K, Re e Ra. Digite em graus Celsius a seguir: ");
        Celsius = scan.nextDouble();

        //Processamento
        Fahreinheit = Celsius * 1.8 + 32;
        Kelvin = Celsius + 273.15;
        Reaumur = Celsius * 0.8;
        Rankine = Celsius * 1.8 + 32 + 459.67;

        //Saída
        System.out.println(Celsius+"ºC são:");
        System.out.println(Fahreinheit+" em Graus Fahrenheit.");
        System.out.println(Kelvin+" em Graus Kelvin.");
        System.out.printf(Reaumur+"em Graus Reaumur.\n");
        System.out.println(Rankine+" em Graus Rankine.");
    }
}
