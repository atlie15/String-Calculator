package tdd.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class strcalctest {
 @Test
 public void testEmptyString() {
  assertEquals(0, Calculator.add(""));
 }
}
