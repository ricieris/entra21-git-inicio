public class Exercicio03 {
    public static void main(String[] args) {
        //Variaveis
        String[] palavras = {"abc", "def", "ghi"};
        char letraproibida = 'a';
        boolean achou = false;
        //Processamento
        for (String palavra : palavras) {
            for (int i = 0; i <= palavra.length(); i++) {
                achou = palavra.charAt(i) == letraproibida;
                if (achou) {
                    break;
                }
            }
        }
        //Saida
        if (achou) {
            System.out.println("Encontrou letra proibida");
        } else {
            System.out.println("Não encontrou letra proibida");
        }
    }
}