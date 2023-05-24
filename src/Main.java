import java.util.Date;
import java.util.Scanner;

public class Main {

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Date current = new Date();// для ввывода актуальной даты

    System.out.println("\n" + "...  Добро пожаловать в Ваш список задач  ...");
    System.out.println("\n" + "... Сегодня " + current + " ...");
    System.out.println("\n" + "==============  Список Задач  ===============");
    System.out.println("\n" + "1.Вывести все задачи ");
    System.out.println("2.Добавить задачу");
    System.out.println("3.Сохранить задачи в файл");
    System.out.println("4.Удалить задачу");
    System.out.println("5.Выйти" + "\n");
    System.out.print("Выберите действие (1-5): " + "\n");
  }
}
