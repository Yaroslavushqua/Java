package DZ_1;
import java.time.LocalDateTime;
import java.util.Scanner;
public class DZ_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Твое имя: ");
        String name = iScanner.nextLine();

        int hour = LocalDateTime.now().getHour();
        String text;

        if ((hour >= 5) && (hour < 12)) text = "Доброе утро, ";
        else if ((hour >= 12) && (hour < 18)) text = "Добрый день, ";
        else if ((hour >= 18) && (hour < 23)) text = "Добрый вечер, ";
        else text = "Доброй ночи, ";

        System.out.printf("%s %s", text, name);
        iScanner.close();
}
}