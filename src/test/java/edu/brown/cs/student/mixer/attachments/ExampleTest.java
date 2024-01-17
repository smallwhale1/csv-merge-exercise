package edu.brown.cs.student.mixer.attachments;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/** Tests for the wire whip. */
public class ExampleTest {

  @Before
  public void setup() {}

  @After
  public void tearDown() {}

  /**
   * Doubles the integer passed in
   * @param x the integer to double
   * @return the doubled integer
   */
  public int doubleInteger(int x) {
    // TODO: Partner A should implement this function by returning x + x, and Partner B should return x * 2
    return 0;
  }

  @Test
  public void test() {
    assertEquals(doubleInteger(1), 2);
  }
}
