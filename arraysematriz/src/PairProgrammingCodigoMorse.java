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
        System.out.println("VOCÊ ESCOLHEU DECODIFICAR");
        System.out.print("Digite o código morse separando as letras com '|' e os espaços com '*': ");
        codigoMorse = scan.nextLine();
        String morseDecifrado = codigoMorse;

        //Até acima está certo

        morseDecifrado = codigoMorse.replace(".-|", "a").replace("-...|", "b").replace("-.-.", "c").replace("-..", "d").replace(".", "e").replace("..-.", "f").replace("--.","g").replace( "....", "h").replace("..","i").replace(".---", "j").replace("-.-", "k").replace(".-..", "l").replace("--", "m").replace("-.", "n").replace("---","o").replace(".--.", "p").replace( "--.-", "q").replace(".-.", "r").replace("...", "s").replace("-","t").replace("..-", "u").replace("...-","v").replace(".--","w").replace("-..-","x").replace("-.--","y").replace("--..", "z");



        System.out.println("É: " + morseDecifrado);
    }
}

        //System.out.println("O código morse é: " + morseQuebrado[4]); //isso era um teste pra saber se o array tava funcionando