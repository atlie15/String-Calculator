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
 @Test
 public void testNewLine() {
  assertEquals(6, Calculator.add("1\n2,3"));
 }
 @Test
 public void testNegatives() {
  try{
   Calculator.add("2,-4,3,-5");
  }
  catch(final IllegalArgumentException ex){
   assertEquals("Negatives not allowed: [-4, -5]", ex.getMessage());
  }
 }
 @Test
 public void testBigNum() {
  assertEquals(13, Calculator.add("1\n2,10,1337"));
 }
 @Test
 public void testDelim() {
  assertEquals(3, Calculator.add("//;\n1;2"));
 }
}
