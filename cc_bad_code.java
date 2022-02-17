package cc_homework_2;

import java.util.LinkedList; import java.util.EmptyStackException; import java.util.Random; import java.time.format.DateTimeFormatter; import java.time.*;
/* Create a linked list that contains time
 * test with random int first
 */
public class cc_bad_code{
  public static void main(String [] args){
  //initialize linked list
  LinkedList stackedList = new LinkedList();
  //testing(stackedList); 
  getTime(stackedList);
  }
  /*
  public static void testing(LinkedList stackedList){
    Random rand = new Random();
    int limit = 100;
  int isFull =0;
  //while linked list items is less than 10 fill with random numbers (redundant comment)
  while(isFull<10){
  isFull++;
  //generate random number
  stackedList.add(rand.nextInt(limit));
  };
  System.out.println(stackedList);
  }
  // added just now ()
  */
  
  public static void getTime(LinkedList timeList){
    int stackLimit = 0;
    while(stackLimit<10){
    LocalTime time = LocalTime.now();
    //System.out.println(time);
    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    String currentTime = time.format(timeFormatter);
    timeList.add(currentTime);
    stackLimit++;
    };
    System.out.println(timeList);
  }
}