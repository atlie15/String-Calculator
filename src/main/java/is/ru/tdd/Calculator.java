package tdd.stringcalculator;

import java.util.ArrayList;

public class Calculator {
 private static ArrayList<Integer> num;
 public static int add (String numbers){
  if (numbers == "")
   return 0;
  else{
   num = new ArrayList<Integer>();
   parse(numbers);
   checkNeg();
   return sum();
  }
 }

 private static void checkNeg() {
 ArrayList<Integer> negs = new ArrayList<Integer>();
 
 for (int x : num)
  if (x < 0)
   negs.add(x);
 
 if (negs.size() > 0)
  throw new IllegalArgumentException("Negatives not allowed: " + negs);
}

private static int sum(){
  int total = 0;
  for (int x : num){
   if (x < 1000)
    total += x;
  }
  return total;
 }

 private static void parse(String input){
  String in = input.replaceAll("[\\n]+", ",");
  
  for(String x : in.split(","))
   num.add(Integer.parseInt(x));
 }
}
