package tdd.stringcalculator;

public class Calculator {
 public static int add (String numbers){ 
  if (numbers == "")
   return 0;
  else{
   return sum(numbers.split(","));
  }
 }

 private static int sum(String[] input){
  int total = 0;
  for (String num : input){
   total += Integer.parseInt(num);
  }
  return total;
 }
}
