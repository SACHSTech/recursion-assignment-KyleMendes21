package recursionAssignment;

public class Recursion {

  public static int count7(int n) {

    //Basics Line
    if (n == 0) {
      return 0;
    }
    // recursion line 1
    if (n % 10 == 7) {
      return 1 + count7(n / 10);
    }

    // recursion line 2
    else {
      return count7(n / 10);
    }
  }

  public static String pairStar(String str) {

    if (str.equals("") || str.length() == 1) {
      return str;
    }

    return str;
  }


}
