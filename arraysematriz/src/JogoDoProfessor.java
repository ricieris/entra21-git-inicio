import java.util.Scanner;

public class JogoDoProfessor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a abrevição de classe com 3 caracteres: ");
        String classe = scan.next().toUpperCase();
        if (classe.length() != 3) {
            System.out.println("Não é a abreviação válida de alguma classe.");
            } else {
            switch (classe) {
                case "WHM", "SCH", "AST", "SAG":
                    System.out.println("É Healer!");
                    break;

                case "PLD", "WAR", "DKN", "GNB":
                    System.out.println("É Tank!");
                    break;

                case "MNK", "DRG", "NJA", "SMR", "RPR", "BRD", "MCK", "DNC", "BLM", "SMN", "RDM", "BEM":
                    System.out.println("É DPS!");
                    break;

                default:
                    System.out.println("Não é uma classe válida.");
                    break;
            }
        }
    }
}
