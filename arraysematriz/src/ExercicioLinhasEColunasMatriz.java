import java.util.Scanner;

public class ExercicioLinhasEColunasMatriz {
    public static void main(String[] args) {
        int linhas;
        int colunas;

        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o número de linhas: ");
        linhas = scan.nextInt();
        System.out.print("Informe o número de colunas: ");
        colunas = scan.nextInt();

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
