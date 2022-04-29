import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        exe06();
    }

    public static void exe06() {
        //Variáveis
        double salarioatual;
        double porcentagemaumento;
        double aumento;
        double salarionovo;
        Scanner scan = new Scanner(System.in);

        //Entrada
        System.out.println("Digite o salário atual do colaborador: ");
        salarioatual = scan.nextDouble();
        System.out.println("Digite o percentual de aumento salarial: ");
        porcentagemaumento = scan.nextDouble();

        //Processamento
        aumento = (porcentagemaumento * salarioatual / 100);
        salarionovo = salarioatual + aumento;

        //Saída
        System.out.println("O novo salario é: "+salarionovo);
    }
}
