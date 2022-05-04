import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        exe17();
    }

    public static void exe17() {
        //Variaveis
        int horainicio;
        int horafim;
        int duracao;
        Scanner scan = new Scanner(System.in);

        //Entrada
        System.out.print("Digite o horário de início da partida de xadrez: ");
        horainicio = scan.nextInt();
        System.out.print("Digite o horário de término da partida de xadrez");
        horafim = scan.nextInt();

        if (horafim > horainicio) {
            duracao = horafim - horainicio;
        } else {
            duracao = (24 - horainicio) + horafim;
        }

        //Saida
        System.out.println("A duração da partida de xadrez foi de "+duracao+" horas.");
    }
}