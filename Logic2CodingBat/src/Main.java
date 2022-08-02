import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ex01();

    }

    public static void ex01() {
        boolean resultado = true;
        String str = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Digite:");
        str = in.nextLine();

        if (!str.contains("xyz")) {
            resultado = false;
        }
        if (str.contains(".xyz")){
            resultado = false;
        }

        System.out.println("Resultado: " + resultado);

        boolean resultado = false;

        if (str == "xyz") {
            resultado = true;
        }

        if (str.contains("xyz")
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                if (i - 1 > 0) {
                    if (str.charAt(i - 1) != '.') {
                        if (i + 1 < str.length()) {
                            if (str.charAt(i + 1) == 'y') {
                                if (i + 2 < str.length()) {
                                    if (str.charAt(i + 2) == 'z') {
                                        resultado = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return resultado;
    }
    }

    public static void ex02() {
        String a = "";
        String b = "";
        Scanner in = new Scanner(System.in);
        boolean resultado = false;

        System.out.println("Digite A: ");
        a = in.nextLine();
        System.out.println("Digite B: ");
        b = in.nextLine();

        if (a.length() < b.length()) {
            if (b.contains(a)) {
                resultado = true;
            }
        }
        if (a.length() > b.length()) {
            if (a.contains(b)) {
                resultado = true;
            }
        }
        if (a.length() < b.length()) {
            if (b.contains(a)) {
                for (int i = b.length(); i > 0; i--) {
                    for (int j = a.length(); j > 0; j--) {
                        if (a.charAt(j - 1) == b.charAt(i - 1)) {
                            resultado = true;
                        } else {
                            resultado = false;
                        }
                    }
                }
            }
        }
        if (a.length() > b.length()) {
            if (a.contains(b)) {
                for (int i = a.length(); i > 0; i--) {
                    for (int j = b.length(); j > 0; j--) {
                        if (b.charAt(j - 1) == a.charAt(i - 1)) {
                            resultado = true;
                        } else {
                            resultado = false;
                        }
                    }
                }
            }
        }
    }
}

