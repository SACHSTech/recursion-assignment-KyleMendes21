package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import recursionAssignment.Recursion;

public class RecursionTest{
    
  
    /**
     * An initial test
    */
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


    
    // add more tests
    
  
    
}
