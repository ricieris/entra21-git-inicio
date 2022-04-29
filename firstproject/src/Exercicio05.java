import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        exe05();
    }

    public static void exe05() {
        //Variáveis
        double totaleleitores;
        double brancosenulos;
        double votosvalidos;
        double porcentagembrancosenulos;
        double porcentagemvotosvalidos;
        Scanner scan = new Scanner(System.in);

        //Entrada
        System.out.print("Digite o numero total de eleitores: ");
        totaleleitores = scan.nextInt();
        System.out.print("Digite o total de votos brancos e nulos: ");
        brancosenulos = scan.nextInt();

        //Processamento
        votosvalidos = totaleleitores-brancosenulos;
        porcentagembrancosenulos = ((brancosenulos * 100) / totaleleitores);
        porcentagemvotosvalidos = ((votosvalidos * 100) / totaleleitores);

        //Saida
        System.out.println("O total de votos válidos é de: "+votosvalidos);
        System.out.println("O percentual de votos válidos é: "+porcentagemvotosvalidos+"%");
        System.out.print("O percentual de votos brancos e nulos é: "+porcentagembrancosenulos+"%");

    }


}
