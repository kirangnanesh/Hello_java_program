import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
  public static void main (String[] args){
  Map<String, Integer> studentGrades = new HashMap<>();

  studentGrades.put("Alice", 85);
  studentGrades.put("Bob", 90);
  studentGrades.put("Charlie", 78);

  int aliceGrade = studentGrades.get("Bob");
  System.out.println("Alice's grade: " + aliceGrade);

  }
}
