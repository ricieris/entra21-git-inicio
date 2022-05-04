import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {
        exe18();
    }

    public static void exe18() {
        //Variaveis
        double salariohora;
        double horastrabalhadas;
        double salariofinal;
        double horasextras;
        double valorextra;
        Scanner scan = new Scanner(System.in);

        //Entrada
        System.out.print("Digite o valor por hora do colaborador: ");
        salariohora = scan.nextDouble();
        System.out.print("Digite as horas trabalhadas pelo colaborador no mês: ");
        horastrabalhadas = scan.nextDouble();

        //Processamento
        if ((horastrabalhadas/4) <= 40 ) {
            salariofinal = horastrabalhadas * salariohora;
        } else {
            horasextras = (horastrabalhadas-160);
            valorextra = (horasextras*1.5)*10;
            salariofinal = ((horastrabalhadas - horasextras) * salariohora) + valorextra;
        }

        //Saida
        System.out.println("O salário final..........."+salariofinal);

    }
}