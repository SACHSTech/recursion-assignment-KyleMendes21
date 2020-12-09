package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import recursionAssignment.Recursion;

/**
* TDD and Recursion Assignment Testing
* @author: K. Mendes
*
*/
public class RecursionTest{
  
    // count7 Testing

    // Test when there is no 7
    @Test
    public void Test11(){
      assertEquals(0, Recursion.count7(0)); 
    }

    // Test when there one 7
    @Test
    public void Test12(){
      assertEquals(1, Recursion.count7(7)); 
    }

    // Test when there is two sevens
    @Test
    public void Test13(){
      assertEquals(2, Recursion.count7(77)); 
    }

    // More complex testing
    @Test
    public void Test14(){
      assertEquals(2, Recursion.count7(717)); 
    }

    // More complex testing
    @Test
    public void Test15(){
      assertEquals(0, Recursion.count7(123)); 
    }

    // More complex testing
    @Test
    public void Test16(){
      assertEquals(5, Recursion.count7(71717177)); 
    }

    // pairStar Testing

    // Test when the string is empty
    @Test
    public void Test21(){
      assertEquals("", Recursion.pairStar(""));  
    }

    // Test when there are two x's
    @Test
    public void Test22(){
      assertEquals("x*x", Recursion.pairStar("xx"));  
    }

    // Test when where are double letters and another letter present
    @Test
    public void Test23(){
      assertEquals("yx*x", Recursion.pairStar("yxx"));  
    }

    // More complex testing
    @Test
    public void Test24(){
      assertEquals("hel*lo", Recursion.pairStar("hello"));  
    }

    // More complex testing
    @Test
    public void Test25(){
      assertEquals("y*yx*x", Recursion.pairStar("yyxx"));   
    }

    // More complex testing
    @Test
    public void Test26(){
      assertEquals("a*a*a*a", Recursion.pairStar("aaaa"));  
    }

    // stringClean Testing

    // test when there is only one letter
    @Test
    public void Test31(){
      assertEquals("a", Recursion.stringClean("a"));   
    }

    // Test when there is one set of doubles
    @Test
    public void Test32(){
      assertEquals("a", Recursion.stringClean("aa"));   
    }
    
    // Test when there is one set of double and another letter present
    @Test
    public void Test33(){
      assertEquals("ao", Recursion.stringClean("aao"));   
    }
    
    // More complex testing
    @Test
    public void Test34(){
      assertEquals("yza", Recursion.stringClean("yyzzza"));   
    }

    // More complex testing
    @Test
    public void Test35(){
      assertEquals("abcd", Recursion.stringClean("abbbcdd"));   
    }

    // More complex testing
    @Test
    public void Test36(){
      assertEquals("helo", Recursion.stringClean("hello"));   
    }
    
    // add more tests
    
  
    
}
