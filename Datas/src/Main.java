import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {

        DateTimeFormatter dataQueEuGosto = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(dataQueEuGosto.format(LocalDateTime.now()));

        DateTimeFormatter dataQueEuGosto1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH' horas, 'mm 'minutos e 'ss' segundos.'");
        System.out.println(dataQueEuGosto1.format(LocalDateTime.now()));

        LocalDateTime inicio = LocalDateTime.of(2022,7,7,8,30,20);
        LocalDateTime fim = LocalDateTime.of(2022,7,7,17,40,20);

       // Duration bet = Duration.between(inicio, fim).minusHours(1)...;

    }
}