import java.util.Scanner;

import static java.lang.System.in;

public class PairProgrammingCodigoMorse {

    public static void main(String[] args) {

        //Variaveis
        int funcao;
        Scanner scan = new Scanner(in);

        /*System.out.println("Digite 1 para decodificar código morse ou 2 para codificar algo para código morse:");
        funcao = scan.nextInt();*/

        String codigoMorse;
        String[] morseQuebrado = new String[100];
        System.out.println("VOCÊ ESCOLHEU DECODIFICAR");
        System.out.print("Digite o código morse separando as letras com '=' e os espaços com '*': ");
        codigoMorse = scan.nextLine();
        morseQuebrado = codigoMorse.split("=");
        //Até acima está certo


        String frase;
        for (int i = 0; i < morseQuebrado.length; i++) {
            String caractereDecodificado = morseQuebrado[i];
            if (caractereDecodificado.equals(".-")) {
                caractereDecodificado = "a";

            }
            System.out.println("É: " + caractereDecodificado);
        }
    }
}

        //System.out.println("O código morse é: " + morseQuebrado[4]); //isso era um teste pra saber se o array tava funcionando