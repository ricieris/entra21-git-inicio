import classes.ListaTarefas;
import classes.Tarefa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Informe aquantidade de tarefas da lista: ");
        ListaTarefas lt = new ListaTarefas(scan.ne)

        Scanner scan = new Scanner(System.in);

        public static Tarefa criartarefa() {
            Tarefa t = new Tarefa();
            System.out.println(t.getUuid());
            System.out.println("Informe a tarefa a ser feita");
            t.setNome(scan.nextLine());
            System.out.println("Informe a descrição da tarefa: ");
            t.setDescricao(scan.nextLine());
            System.out.println("Informe a ordem da tarefa: ");
            t.setOrdem(scan.nextInt());
            System.out.println("Tarefa tem checklist? (S/N)");
            String checklist = scan.nextLine();
            System.out.println("Informe o tamanho da checklist: ");
            if (checklist.equalsIgnoreCase("S")) {
                t.criarChecklist(scan.nextInt());
                scan.nextLine();
                while (true) {

                }
            }
            scan.nextLine();
            return t;
        }
    }
}

