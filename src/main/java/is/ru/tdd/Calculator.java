package tdd.stringcalculator;

import java.util.ArrayList;

public class Calculator {

 private static ArrayList<Integer> num;
 private static String delim;
 
 public static int add (String numbers){
  if (numbers == "")
   return 0;
  else{
   num = new ArrayList<Integer>();
   String adjusted = adjustDelim(numbers);
   parse(adjusted);
   checkNeg();
   return sum();
  }
 }

 private static String adjustDelim(String numbers) {
  if (numbers.startsWith("//")){
   delim = numbers.substring(2, numbers.indexOf('\n'));
   numbers = numbers.substring(numbers.indexOf('\n') + 1);
  }

  return numbers;
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
  for (int x : num)
   if (x < 1001)
    total += x;
   return total;
 }

 private static void parse(String input){
  String in = input.replaceAll("[\\n" + delim + "]+", ",");

  for(String x : in.split(","))
   num.add(Integer.parseInt(x));
 }
}
