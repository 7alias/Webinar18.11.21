import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class FormatterDateTime {

    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm:ss");
        String formatDateTime = LocalDateTime.now().format(dateTimeFormatter);
        System.out.println(formatDateTime);


        String now = "22-03-28 14:29:13";

        LocalDateTime formatDateTime1 = LocalDateTime.parse(now, dateTimeFormatter);

        System.out.println(formatDateTime1);
        System.out.println(formatDateTime1.plusHours(2));

    }

}
