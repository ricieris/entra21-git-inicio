import java.util.Scanner;

public class AbreviacaoDeNome {

    public static void main(String[] args) {
        //Variaveis
        String nome;
        String[] nomequebrado;
        Scanner scan = new Scanner(System.in);

        //Entrada
        System.out.print("Digite o nome completo a ser abreviado: ");
        nome = scan.nextLine();

        //Processamento e Saida
        nomequebrado = nome.split(" ");

        System.out.println("A abreviação do nome "+nome+" é:");
        for (String letra : nomequebrado) {
                    System.out.print(letra.substring(0, 1) + ". ");
        }
    }
}