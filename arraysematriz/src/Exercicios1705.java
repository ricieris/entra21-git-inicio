import java.util.Scanner;

public class Exercicios1705 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        exe10();
    }


    public static void exe02() {
        //Entrada
        System.out.print("Digite alguma coisa: ");
        String algumaCoisa = scan.nextLine();
        System.out.print("Digite outra coisa: ");
        String outraCoisa = scan.nextLine();

        //Processamento e Saída
        if (algumaCoisa.equals(outraCoisa)) {
            System.out.println("São iguais!");
        } else if (algumaCoisa.equalsIgnoreCase(outraCoisa)) { //ignora as letras maiúsculas e minúsculas
            System.out.println("São iguais dependente de case.");
        } else {
            System.out.println("São diferentes.");
        }
    }

    public static void exe03() {
        //Entrada
        System.out.print("Digite alguma coisa: ");
        String algumaCoisa = scan.nextLine();
        System.out.print("Digite outra coisa: ");
        String outraCoisa = scan.nextLine();

        //Processamento e Saída
        if (algumaCoisa.contains(outraCoisa)) {
            System.out.println(outraCoisa + " faz parte de" + algumaCoisa + ".");
        } else if (outraCoisa.contains(algumaCoisa)) {
            System.out.println(algumaCoisa + " faz parte de" + outraCoisa + ".");
        } else {
            System.out.println("Nenhuma string faz parte da outra.");
        }

    }

    public static void exe04() {
        //Entrada
        System.out.print("Digite alguma coisa: ");
        String algumaCoisa = scan.nextLine();
        System.out.print("Digite outra coisa: ");
        String outraCoisa = scan.nextLine();

        //Processamento e Saída
        if (algumaCoisa.startsWith(outraCoisa)) {
            System.out.println(algumaCoisa + " começa com " + outraCoisa + ".");
        } else if (outraCoisa.startsWith(algumaCoisa)) {
            System.out.println(outraCoisa + " começa com " + algumaCoisa);
        } else {
            System.out.println("As strings não são prefixos uma da outra.");
        }
    }

    public static void exe05() {
        //Entrada
        System.out.print("Digite alguma coisa: ");
        String algumaCoisa = scan.nextLine();
        System.out.print("Digite outra coisa: ");
        String outraCoisa = scan.nextLine();

        //Processamento e Saída
        if (algumaCoisa.endsWith(outraCoisa)) {
            System.out.println(algumaCoisa + " termina com " + outraCoisa + ".");
        } else if (outraCoisa.endsWith(algumaCoisa)) {
            System.out.println(outraCoisa + " termina com " + algumaCoisa + ".");
        } else {
            System.out.println("As strings não são sufixos uma da outra.");
        }
    }

    public static void exe06() {
        //Entrada
        System.out.print("Digite alguma coisa: ");
        String algumaCoisa = scan.nextLine();
        System.out.print("Digite outra coisa: ");
        String outraCoisa = scan.nextLine();

        //Processamento e Saída
        int posicao = algumaCoisa.indexOf(outraCoisa);
        if (posicao != -1) {
            System.out.println("A string " + outraCoisa + " está na posição " + posicao + " dentro de " + algumaCoisa + ".");
        } else {
            System.out.println("A string " + outraCoisa + " não está dentro de " + algumaCoisa + ".");
        }
    }

    public static void exe07() {
        String palavraCriptografada = "lala#lwve#-rwgra22lalang!#<3";

        //Processamento
        String palavraDecifrada = palavraCriptografada.replace("lala", "i");
        palavraDecifrada = palavraDecifrada.replace("w", "o");
        palavraDecifrada = palavraDecifrada.replace("#", " ");
        palavraDecifrada = palavraDecifrada.replace("2", "m");
        palavraDecifrada = palavraDecifrada.replace("-", "p");

        //Saída
        System.out.println("A sentença criptografada é: " + palavraCriptografada);
        System.out.println("A sentença após ser decifrada é: " + palavraDecifrada);
    }

    public static void exe08() {
        //Entrada
        System.out.print("Digite quantos número deseja informar: ");
        int quantidade = scan.nextInt();
        int[] numeros = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Informe um número: ");
            numeros[i] = scan.nextInt(); //inserindo o número na posição i que vai aumentando até o fim da repetição
        }

        //Processamento
        int somaPares = 0;
        int somaImpares = 0;
        for (int valor : numeros) { //indo do início ao fim em todos os espaços do array;
            //  poderia ser (int i = 0; i < numeros.lenght; i++) /n int valor = numero [i]
            if (valor % 2 == 0) { //absoluto do valor   por 2 for 0;
                somaPares += valor;
            } else {
                somaImpares += valor;
            }
        }

        //Saída
        System.out.println("A soma dos valores pares é: " + somaPares);
        System.out.println("A soma dos valores impares é: " + somaImpares);
    }

    public static void exe09() {
        //Entrada
        System.out.print("Digite quantas palavras deseja informar: ");
        int quantidade = scan.nextInt();
        String[] palavras = new String[quantidade];
        scan.nextLine();
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Informe uma palavra: ");
            palavras[i] = scan.nextLine(); //inserindo o número na posição i que vai aumentando até o fim da repetição
        }

        //Processamento
        System.out.println("Informe um número de caracteres > 0 para remover as palavras com menos letras que ele: ");
        int numeroCorte = scan.nextInt();
        for (int i = 0; i < quantidade; i++) {
            if (palavras[i].length() < numeroCorte) {
                palavras[i] = null;
            }
        }

        //Saída
        for (String palavra : palavras) {
            if (palavra != null) {
                System.out.println(palavra);
            } /*else if (palavra == null){
                System.out.println(palavra);
            } */ //se quiser também mostrar onde as palavras foram apagadas;
        }
    }

    public static void exe10() {
        //Entrada
        System.out.print("Digite quantos número deseja informar nas duas listas: ");
        int quantidade = scan.nextInt();
        int[] lista1 = new int[quantidade];
        int[] lista2 = new int[quantidade];
        int[] listaFinal = new int[quantidade];

        //Processamento
        for (int i = 0; i < quantidade; i++) {
            System.out.print("LISTA 1\nInforme um número: ");
            lista1[i] = scan.nextInt(); //inserindo o número na posição i que vai aumentando até o fim da repetição
        }
        for (int i = 0; i < quantidade; i++) {
            System.out.print("LISTA 2\nInforme um número: ");
            lista2[i] = scan.nextInt(); //inserindo o número na posição i que vai aumentando até o fim da repetição
        }
        for (int i = 0; i < quantidade; i++) {
            for (int j = 0; j < quantidade; j++) {
                if (lista1[i] != lista2[j]) {
                    listaFinal[i] = lista1[i];
                }
            }
        }

        //Saída
        System.out.println("Lista de números repetidos entre lista 1 e 2:");
        for (int numero : listaFinal) {
            if (numero != 0) {
                System.out.println(numero);
            }
        }
    }
}