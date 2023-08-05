

@FunctionalInterface
interface MyFunction {
  int performOperation(int a, int b);
}
public class CustomFunctionalInterfaceExample {
  public static void main(String[] args) {
  MyFunction addFunction = (a,b) -> a + b;
  MyFunction subtractFunction = (a,b) -> a - b;
  MyFunction multiplyFunction = (a,b) -> a * b;

  int resultAdd = addFunction.performOperation(5, 3);
  int resultSubtraction = subtractFunction.performOperation(5, 3);
  int resultMultiply = multiplyFunction.performOperation(5, 3);

  System.out.println("Addition: " + resultAdd);
  System.out.println("Subtraction: " +resultSubtraction);
  System.out.println("Multiplicaitotn: " + resultMultiply);
}
}

