import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        exe07();
    }

    public static void exe07() {
        //Variáveis
        double custofabrica;
        double porcentagemdistribuidor = 28;
        double aumentodistribuidor;
        double porcentagemtimposto = 45;
        double aumentoimposto;
        double custofinal;
        Scanner scan = new Scanner(System.in);

        //Entrada
        System.out.print("Digite o custo de fábrica do automóvel: ");
        custofabrica = scan.nextDouble();

        //Processamento
        aumentodistribuidor = (porcentagemdistribuidor * custofabrica / 100);
        aumentoimposto = (porcentagemtimposto * custofabrica / 100);
        custofinal = (custofabrica + aumentodistribuidor + aumentoimposto);

        //Saída
        System.out.println("O custo final do automóvel para o consumidor é: "+custofinal);
    }
}