package recursionAssignment;

public class Recursion{

  public static int count7(int n) {

    //Basics Line
    if (n == 0) {
      return 0;
    
    // recursion line 1
    }else if (n % 10 == 7) {
      return 1 + count7(n / 10);
    }

    return 0;
  }

}
