import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args)  {exe14();}

        public static void exe14() {
        //Variaveis
        int anoatual;
        int anonascimento;
        int resultado;
        Scanner scan = new Scanner(System.in);

            //Entrada
            System.out.print("Digite o ano atual: ");
            anoatual = scan.nextInt();
            System.out.println("Digite o ano de nascimento: ");
            anonascimento = scan.nextInt();

            //Processamento
            resultado = (anoatual - anonascimento);
            if (resultado >= 18) {
                //Saída
                System.out.println("Está apto a votar esse ano.");
            } else {
                System.out.println("Não está apto a votar esse ano.");
            }
    }
}
