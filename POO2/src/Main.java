import classes.Tarefa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Tarefa tar = new Tarefa();
        System.out.println(tar.getUuid());
        System.out.println("Informe a tarefa a ser feita");
        tar.setNome(scan.nextLine());
        System.out.println("Informe a descrição da tarefa: ");
        tar.setDescricao(scan.nextLine());

        System.out.println(tar.getUuid());
        System.out.println("A tarefa é: " + tar.getNome());
        System.out.println(tar.getDescricao());
    }
}

