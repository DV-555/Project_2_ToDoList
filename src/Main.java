import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

  private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy HH:mm");

  public static void main(String[] args) {

    Map<Date, String> todoMap = new TreeMap<>();

    Scanner scanner = new Scanner(System.in);
    Date current = new Date();// для вывода актуальной даты

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
// =>создать toDoList.txt, res.directory, todo.txt
    switch (choice) {
      case 1:
        printTasks(
            todoMap);// создать метод printTasks, который выводит список задач из toDoList.txt
        break;
      case 2:
        addTask(todoMap, scanner);//создать метод addTask, чтобы добавить новую задачу
        break;
      case 3:
        // method saveTaskToFile,сохранить новую задачу в файле
      case 4: //method removeTask
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

  public static void addTask(Map<Date, String> todoMap, Scanner scanner) {
    System.out.print("Введите дату и время выполнения задачи (dd.MM.yyyy HH:mm): ");
    String dateString = scanner.nextLine();
    Date date;
    try {
      date = DATE_FORMAT.parse(dateString);
    } catch (Exception e) {
      System.out.println("Неверный формат даты и времени.");
      return;
    }
    System.out.println("\n" + "Введите задачу: ");
    String task = scanner.nextLine();
    todoMap.put(date, task);
    System.out.println("Задача успешно добавлена.");
  }


}

