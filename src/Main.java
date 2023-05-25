import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

public class Main {


  public static void main(String[] args) throws ParseException, IOException {
    Date current = new Date();// для вывода актуальной даты
    System.out.println("=============================================");
    System.out.println("\n" + "...  Добро пожаловать в Ваш список задач  ...");
    System.out.println("\n" + "... Сегодня " + current + " ...");
    System.out.println("\n" + "==============  Список Задач  ===============");
    System.out.println();
    Welcome.welcome();
  }
}

