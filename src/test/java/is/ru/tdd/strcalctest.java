package tdd.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class strcalctest {
 @Test
 public void testEmptyString() {
  assertEquals(0, Calculator.add(""));
 }
 @Test
 public void testOneNum() {
  assertEquals(2, Calculator.add("2"));
 }
 @Test
 public void testTwoNum() {
  assertEquals(13, Calculator.add("5,8"));
 }
 @Test
 public void testThreeNum() {
  assertEquals(15, Calculator.add("4,5,6"));
 }
}
