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

    // basic line
    if (str.equals("") || str.length() == 1) {
      return str;
    }
    
    // recursion 1
    if (str.charAt(0) == str.charAt(1)) {
      return str.charAt(0) + "*" + str.substring(1);
    }

    // recursion 2
    else {
      return str.charAt(0) + pairStar(str.substring(1));
    }
  }


}
