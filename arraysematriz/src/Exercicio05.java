import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        //Variaveis
        int quantidadepalavras;
        Scanner scan = new Scanner(System.in);

        //Entrada
        System.out.print("Digite a quantidade de palavras a serem digitadas: ");
        quantidadepalavras = scan.nextInt();
        String[] palavras = new String[quantidadepalavras];
        for (int i = 0; i < quantidadepalavras; i++) ; {
            System.out.print("Informe a palavra: ");
            palavras[i] = scan.next();
        }
        String palavrafinal = "";
        for (int i = 0; i <palavras.length; i++); {
            if (i == 0) {
                palavrafinal += palavras[i]
            }
        }
    }
}