import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        exe08();
    }

    public static void exe08() {
        //Variáveis
        double salariofixo;
        double totalcarrosvendidos;
        double valorporcarro;
        double comissao;
        double valortotalvendas;
        double porcentagemtotalvendas = 5;
        double salariofinal;

        Scanner scan = new Scanner(System.in);

        //Entrada
        System.out.println("Digite o salário fixo do colaborador: ");
        salariofixo = scan.nextDouble();
        System.out.println("Digite o total de carros vendidos: ");
        totalcarrosvendidos = scan.nextDouble();
        System.out.println("Digite o valor recebido por carro vendido: ");
        valorporcarro = scan.nextDouble();
        System.out.println("Digite o valor total das vendas: ");
        valortotalvendas  = scan.nextDouble();

        //Processamento
        comissao = ((totalcarrosvendidos * valorporcarro) +(valortotalvendas * porcentagemtotalvendas / 100));
        salariofinal = comissao + salariofixo;

        //Saída
        System.out.println("O salário final é: "+salariofinal);
    }
}