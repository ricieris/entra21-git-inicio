import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        exe19();
    }

    public static void exe19() {
        //Variaveis
        String nome;
        String genero;
        double altura;
        double pesoideal;
        Scanner scan = new Scanner(System.in);

        //Entrada
        System.out.print("Digite o nome: ");
        nome = scan.next();
        System.out.print("Digite a altura: ");
        altura = scan.nextDouble();
        System.out.println("Gênero, digite M para masculino e F para Feminino");
        genero = scan.next();

        //Processamento
        if (genero.equals("M")) {
            pesoideal = (72.7 * altura) - 58;
        } else {
            pesoideal = (62.1 * altura) - 44.7;
        }

        //Saida
        System.out.print("Peso ideal de "+nome+"é de "+pesoideal+"kg");
    }
}