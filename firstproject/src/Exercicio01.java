public class Exercicio01 {

    public static void main(String[] args) {
        exe01();
    }

    public static void exe01() {

        int A = 10;
        int B = 20;
        int Reserva = 0;

        Reserva = A;
        A = B;
        B = Reserva;

        System.out.println(A);
        System.out.println(B);
    }
}
