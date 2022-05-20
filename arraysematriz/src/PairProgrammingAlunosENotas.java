import java.util.Scanner;

public class PairProgrammingAlunosENotas {

    public static void main(String[] args) {


        //Variáveis fixas
        int quantidadeAlunos;
        int quantidadeQuestoes;
        Scanner scan = new Scanner(System.in);

        //Entrada de dados principais (quantidade de alunos e de questões)
        System.out.print("Informe a quantidade de alunos da turma: ");
        quantidadeAlunos = scan.nextInt();
        scan.nextLine();
        System.out.print("Informe a quantidade de questões da prova: ");
        quantidadeQuestoes = scan.nextInt();
        scan.nextLine();

        //Entrada do gabarito (resposta de cada questão)
        System.out.println();
        System.out.println("GABARITO \nInforme as respostas corretas de cada uma das " + quantidadeQuestoes + " questões.");

        String [] matrizQuestoes = new String [quantidadeQuestoes];
        for (int i = 0; i < quantidadeQuestoes; i++) {
            int questao = i+1;
            System.out.print("Informe a resposta da questão " + questao + ": ");
            String respostaCorreta = scan.nextLine();
            matrizQuestoes[i] = respostaCorreta;
        }

        //Entrada do nome do aluno em repetição enquanto a condição abaixo for verdade
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("\nEscreva o nome do aluno: ");
            String nomeAluno = scan.nextLine();
            int acertos = 0;

        //Entrada das respostas do aluno (da condição anterior) em repetição com a nova condição abaixo
            for (int j = 0; j < quantidadeQuestoes; j++) {
                int questao = j+1;
                System.out.print("Informe a resposta do aluno para a questão " + questao + ": ");
                String respostaAluno = scan.nextLine();
                if (respostaAluno.equals(matrizQuestoes[j])) {
                    acertos++;

                }
            }
            //Cálculo da nota
            double valorDeCadaQuestao = (10.0 / quantidadeQuestoes);
            double nota = valorDeCadaQuestao * acertos;

            //Saída (acertos e nota)
            System.out.println("O aluno acertou: " + acertos + " questões");
            System.out.printf("A nota do aluno "+ nomeAluno + " é: %.2f", nota);
            System.out.println();
            System.out.println();
        }
    }
}