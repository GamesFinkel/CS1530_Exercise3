import org.junit.Test;
import static org.junit.Assert.*;

import finkel.ex3;

public class Exampleprob{

  @Test
  public void testTri0(){
    assertEquals(ex3.tri(0),0);
  }
  @Test
  public void testTri5(){
    assertEquals(ex3.tri(5),15);
  }
  @Test
  public void testTri77(){
    assertEquals(ex3.tri(77),3003);
  }

  @Test
  public void testLC0(){
    assertEquals(ex3.LC(0),1);
  }
  @Test
  public void testLC5(){
    assertEquals(ex3.LC(5),16);
  }
  @Test
  public void testLC25(){
    assertEquals(ex3.LC(25),326);
  }
}
