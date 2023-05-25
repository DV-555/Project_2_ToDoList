import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Welcome {

  public static void welcome() {
    try {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      File file = new File("toDo.txt");
      boolean running = true;
      while (running) {
        System.out.println("=============================================");
        System.out.println("\n" + "1.Вывести все задачи ");
        System.out.println("2.Добавить задачу");
        System.out.println("3.Удалить задачу");
        System.out.println("4.Выйти" + "\n");
        System.out.print("Выберите действие (1-4): " + "\n");
        // что бы сделать выбор нужен switch
        int choice = Integer.parseInt(bufferedReader.readLine());
        switch (choice) {
          case 1:
            ToDoTask.printToDoList();
            break;
          case 2:
            ToDoTask.addToDoList(file, bufferedReader);
            break;
          case 3:
            ToDoTask.removeTask();
            break;
          case 4:
            ToDoTask.toExit();
            running = false;
            break;
          default:
            System.out.println("вы сделали не верный ввод !");
            break;
        }
      }
    } catch (IOException e) {
      System.out.println("Ошибка при вводе " + e.getMessage());
    }
  }
}