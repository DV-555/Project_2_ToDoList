import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class ToDoTask {

  private static final String SEP = " : ";
  public String date;
  public String toDoTask;

  public ToDoTask(String date, String toDoTask) {
    this.date = date;
    this.toDoTask = toDoTask;
  }


  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getToDoTask() {
    return toDoTask;
  }

  public void setToDoTask(String toDoTask) {
    this.toDoTask = toDoTask;
  }

  public static void printToDoList() throws IOException {
    File file = new File("toDo.txt");
    BufferedReader br = new BufferedReader(new FileReader(file));
    String line;
    while ((line = br.readLine()) != null) {
      System.out.println(line);
    }
  }

  public static void addToDoList(File filename, BufferedReader bufferedReader)
      throws IOException {
    File file = new File("toDo.txt");
    FileWriter FileWriter = new FileWriter(file, true);
    BufferedWriter bufferedWriter = new BufferedWriter(FileWriter);
    System.out.println("вы желаете записать новые задачи: ");
    System.out.println("Дата : ");
    String newDate = bufferedReader.readLine();
    System.out.println("Новая задача: ");
    String newTask = bufferedReader.readLine();
    bufferedWriter.write(newDate + " : " + newTask);
    bufferedWriter.write("\n");
    bufferedWriter.close();
    printToDoList();
    System.out.println("Задача успешно добавлена.");
  }

  public static void removeTask() throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    Set< String> map = new HashSet<>();
    System.out.println("Вы желаете удалить одну из задач : ");
    printToDoList();
    System.out.println("Введите дату :");
    String data = bufferedReader.readLine();
    System.out.println("Введите задачу :");
    String task = bufferedReader.readLine();
    map.add(data+": "+task);
    System.out.println(map);

    File file = new File("toDo.txt");
    String newLine = bufferedReader.readLine();
    BufferedReader br = new BufferedReader(new FileReader(file));

  }



  public static void toExit() {
    System.out.println("Удачи, до свидaния!");
  }
}