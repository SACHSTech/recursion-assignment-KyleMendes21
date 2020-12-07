package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import recursionAssignment.Recursion;

public class RecursionTest{
    
  
    // count7 Testing
    @Test
    public void Test11(){
      assertEquals(0, Recursion.count7(0)); 
    }

    @Test
    public void Test12(){
      assertEquals(1, Recursion.count7(7)); 
    }

    @Test
    public void Test13(){
      assertEquals(2, Recursion.count7(77)); 
    }

    @Test
    public void Test14(){
      assertEquals(2, Recursion.count7(717)); 
    }

    @Test
    public void Test15(){
      assertEquals(0, Recursion.count7(123)); 
    }

    @Test
    public void Test16(){
      assertEquals(5, Recursion.count7(71717177)); 
    }

    // pairStar Testing
    @Test
    public void Test21(){
      assertEquals("", Recursion.pairStar(""));  
    }

    @Test
    public void Test22(){
      assertEquals("x*x", Recursion.pairStar("xx"));  
    }

    @Test
    public void Test23(){
      assertEquals("yx*x", Recursion.pairStar("yxx"));  
    }

    @Test
    public void Test24(){
      assertEquals("hel*lo", Recursion.pairStar("hello"));  
    }

    @Test
    public void Test25(){
      assertEquals("y*yx*x", Recursion.pairStar("yyxx"));   
    }

    @Test
    public void Test26(){
      assertEquals("a*a*a*a", Recursion.pairStar("aaaa"));  
    }

    // stringClean Testing
    @Test
    public void Test31(){
      assertEquals("a", Recursion.stringClean("a"));   
    }

    @Test
    public void Test32(){
      assertEquals("a", Recursion.stringClean("aa"));   
    }

    @Test
    public void Test33(){
      assertEquals("ao", Recursion.stringClean("aao"));   
    }

    @Test
    public void Test34(){
      assertEquals("yza", Recursion.stringClean("yyzzza"));   
    }

    @Test
    public void Test35(){
      assertEquals("abcd", Recursion.stringClean("abbbcdd"));   
    }

    @Test
    public void Test36(){
      assertEquals("helo", Recursion.stringClean("hello"));   
    }
    
    // add more tests
    
  
    
}
