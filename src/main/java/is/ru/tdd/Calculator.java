package tdd.stringcalculator;

public class Calculator {
 public static int add (String numbers){ 
  if (numbers == "")
   return 0;
  else{
   String[] num = parse(numbers);
   return sum(num);
  }
 }

 private static int sum(String[] input){
  int total = 0;
  for (String num : input){
   total += Integer.parseInt(num);
  }
  return total;
 }

 private static String[] parse(String input){
  input = input.replace("\n", ",");
  return input.split(",");
 }
}
