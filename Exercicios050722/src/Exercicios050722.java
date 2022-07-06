import java.util.Scanner;

public class Exercicios050722 {

    public static void main(String[] args) {

    }

    public boolean makeBricks() {
        int small;
        int big;
        int goal;
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o tamanho da fileira desejada: ");
        goal = in.nextInt();

        System.out.print("Digite a quantidade de tijolos pequenos: ");
        small = in.nextInt();

        System.out.print("Digite a quantidade de tijolos grandes: ");
        big = in.nextInt();

        if ((small*1) + (big*5) >= goal){
            System.out.print("Deu certo");
        } else {
            System.out.print("Não foi suficiente");
        }
        return true;
    }
}
