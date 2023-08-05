
interface MyInterface {
  void abstractMethod();

  default void defaultMethod() {
    System.out.println("This is a default method.");
  }
}

class MyClass implements MyInterface {
  @Override
  public void abstractMethod() {
    System.out.println("Abstract method is implemented in MyClass.");
  }
}

public class DefaultMethodExample {
  public static void main(String[] args) {
    MyClass myclass = new MyClass();

    //Calling the a  bstract and default method from the implemented class
    myclass.abstractMethod();
    myclass.defaultMethod();

  }
  
}
