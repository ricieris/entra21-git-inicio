import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        exe04();
    }

    public static void exe04() {

        int DiasNoAno = 365;
        int DiasNoMes = 30;
        int dias;
        int meses;
        int anos;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe sua idade em anos, meses e dias a seguir.");
        System.out.print("Anos: ");
        anos = leitor.nextInt();

        System.out.print("Meses: ");
        meses = leitor.nextInt();

        System.out.print("Dias: ");
        dias = leitor.nextInt();

        dias += anos * DiasNoAno + meses * DiasNoMes;

        System.out.println("Você já viveu " + dias + " dias aproximadamente.");
    }

}