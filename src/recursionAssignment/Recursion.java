package recursionAssignment;

/**
* TDD and Recursion Assignment
* @author: K. Mendes
*
*/
public class Recursion {

  /**
  * Counts how many 7's are in the number the user entered
  *
  * @param int n: the number that will be checked for 7
  * @return the number of 7's in the number given
  * @author K. Mendes
  */  
  public static int count7(int n) {

    // Base case
    // If the number is 0 then 0 wil be returned
    if (n == 0) {
      return 0;
    }
    
    // If the rightmost digit is 7 then it will calculate how many times 7 appears in the number by dividing it by 10
    if (n % 10 == 7) {
      return 1 + count7(n / 10);
    }

    // If the rightmost digit is not 7 then it will calculate how many times 7 appears by dividing the number by 10
    else {
      return count7(n / 10);
    }
  }

  /**
  * Adds an asterisk between two letters that are the same in a word
  *
  * @param String str: The word that will be checked for double letters
  * @return The word with an asterisk between the double letters
  * @author K. Mendes
  */  
  public static String pairStar(String str) {

    // Base case
    // It will return str if the string is empty or only has 1 letter in it
    if (str.equals("") || str.length() == 1) {
      return str;
    }

    // If two characters side by side are the same it will add an asterisk between them
    if (str.charAt(0) == str.charAt(1)) {
      return str.charAt(0) + "*" + pairStar(str.substring(1));
    }

    // If there is no double characters nothing will change
    else {
      return str.charAt(0) + pairStar(str.substring(1));
    }
  }

  /**
  * Condenses the double letters with just one of the letters
  *
  * @param String str: string that will be checked for any double letters
  * @return A string with no double letters
  * @author K. Mendes
  */  
  public static String stringClean(String str) {

    // Base case
    // If the string has less than two letters it will return the string
    if (str.length() < 2) {
      return str;
    }

    // If two characters are the same then it will return only one of the characters
    if (str.charAt(0) == str.charAt(1)) {
      return stringClean(str.substring(1));
    }

    // If there are no double characters then it will return the letter with leave two letters together  
    else {
      return str.charAt(0) + stringClean(str.substring(1));
    }
  }


}
