import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        exe03();
    }

    public static void exe03() {

        Scanner in = new Scanner(System.in);
        System.out.print("Informe a base: ");
        double base = in.nextDouble();
        System.out.print("Informe a altura: ");
        double altura = in.nextDouble();
        double area = base * altura;
        double perimetro = base * 2 + altura * 2;
        System.out.printf("A área é: %.2f\n", area);
        System.out.printf("O perímetro é: %.2f", perimetro);


    }
}
