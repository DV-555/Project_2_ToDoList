import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
  private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy HH:mm");

  public static void main(String[] args){

    Map<Date, String> todoMap = new TreeMap<>();


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

    int choice = scanner.nextInt();

    switch (choice) {
      case 1:
        printTasks(todoMap);// создать метод printTasks, каторый выводит список задач из toDoList.txt
        // =>создать toDoList.txt, res.directory, todo.txt
        break;
      case 2://создать метод addTask, чтобы добавить новую задачу
        break;
      case 3: // metod saveTaskToFile,сохронить новую задачу в файле
      case 4: //metod removeTask
      case 5: //exit
    }
  }
  private static void printTasks(Map<Date, String> todoMap) {
    if (todoMap.isEmpty()) {
      System.out.println("Список задач пуст.");
      return;
    }

    System.out.println("\n" + "Все задачи:" + "\n");

    for (Map.Entry<Date, String> entry : todoMap.entrySet()) {
      String task = entry.getValue();
      Date date = entry.getKey();
      System.out.println(DATE_FORMAT.format(date) + "  :  " + task);
    }
  }
}
