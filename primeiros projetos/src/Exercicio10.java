import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        exe10();
    }

    public static void exe10() {
        //Variaveis
        double nota1;
        double nota2;
        double nota3;
        double mediafinal;
        Scanner scan = new Scanner(System.in);

        //Entrada
        System.out.print("Digite a primeira nota do aluno: ");
        nota1 = scan.nextDouble();
        System.out.print("Digite a segunda nota do aluno: ");
        nota2 = scan.nextDouble();
        System.out.print("Digite a terceira nota do aluno: ");
        nota3 = scan.nextDouble();

        //Processamento
        mediafinal = (nota1 * 2 + nota2 * 3 + nota3 * 5)/10;

        //Saída
        System.out.print("A média final do aluno é: "+mediafinal);

    }
}
