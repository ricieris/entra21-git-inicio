import classes.ChecklistItem;
import classes.ListaTarefas;
import classes.Tarefa;

import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Informe a quantidade de tarefas da lista: ");
        ListaTarefas lt = new ListaTarefas(scan.nextInt());
        scan.nextLine();
        System.out.print("Informe um nome para a lista de tarefas: ");
        lt.setNomeLista(scan.nextLine());
        while (true) {
            Tarefa t = criartarefa();
            if (!lt.adicionarTarefa(t)) {
                System.err.println("Impossível adicionar tarefa!");
                break;
            }
            System.out.println("Deseja adicionar mais tarefas? (S/N)");
            String add = scan.nextLine();
            if (add.equalsIgnoreCase("N")) {
                break;
            }
        }
    }


    public static Tarefa criartarefa() {
        Tarefa t = new Tarefa();
        System.out.print("Informe o nome da tarefa: ");
        t.setNome(scan.nextLine());
        System.out.print("Informe a descrição da tarefa: ");
        t.setDescricao(scan.nextLine());
        System.out.print("Ordem da tarefa: ");
        t.setOrdem(scan.nextInt());
        scan.nextLine();
        System.out.print("Tarefa tem checklist? (S/N)");
        String checklist = scan.nextLine();
        if (checklist.equalsIgnoreCase("S")) {
            System.out.print("Informe o tamanho da checklist: ");
            t.criarChecklist(scan.nextInt());
            scan.nextLine();
            while (true) {
                ChecklistItem item = new ChecklistItem();
                System.out.print("Informe um nome para o item: ");
                item.setNomeCheck(scan.nextLine());
                System.out.print("Informe uma descrição para o item: ");
                item.setDescricaoCheck(scan.nextLine());
                t.adicionarChecklistItem(item);
                System.out.println("deseja adicionar mais itens? (S/N)");
                String add = scan.nextLine();
                if (add.equalsIgnoreCase("N")) {
                    break;
                }
            }
        }
        return t;
    }
}

