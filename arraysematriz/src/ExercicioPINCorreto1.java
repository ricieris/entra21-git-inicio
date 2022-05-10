import java.util.Scanner;

public class ExercicioPINCorreto1 {

    public static void main(String[] args) {
        double senhaCorreta = 91352;
        double senha;
        int tentativas = 3;
        Scanner scan = new Scanner(System.in);

        while (tentativas > 0) {
            System.out.print("Digite a senha de acesso de usuário: ");
            senha = scan.nextDouble();
            if (senha == senhaCorreta) {
                System.out.println("Acesso autorizado");
                break;
            }
            tentativas--;
            if (tentativas == 0) {
                System.out.println("Acesso bloqueado por tentativas em excesso.");
            } else {
                System.out.println("Acesso negado. "+tentativas+" tentativas restantes. Digite a senha novamente: ");
            }
        }
    }
}