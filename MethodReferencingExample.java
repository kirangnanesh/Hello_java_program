import java.util.Arrays;
import java.util.List;

class StringUtils {
  static int compareStrings(String str1, String str2) {
    return str1.compareTo(str2);
  }
}

public class MethodReferencingExample {
  public static void main(String[] args) {
    List<String> words = Arrays.asList("Java", "Method", "Reference", "Example");

    //Using lambda expressions for sorting strings
    words.sort((str1,str2) -> StringUtils.compareStrings(str1, str2));
    System.out.println("Words sorted using lamda expression: " + words);

    //Using method reference for sorting strings
    words.sort(StringUtils::compareStrings);
    System.out.println("Sorted using method reference: " + words);
  }
}