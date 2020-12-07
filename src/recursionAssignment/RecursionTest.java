package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import recursionAssignment.Recursion;

public class RecursionTest{
    
  
    /**
     * An initial test
  
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
    */

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
    
    // add more tests
    
  
    
}
