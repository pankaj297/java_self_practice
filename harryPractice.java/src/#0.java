import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

          class Pankaj0 {
            public static void main(String[] args) {
                LocalDateTime myDateObj = LocalDateTime.now();
                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

                String formattedDate = myDateObj.format(myFormatObj);
                System.out.println("TimeLive-Date: " + formattedDate);

            }
        }