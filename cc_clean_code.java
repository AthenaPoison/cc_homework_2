package cc_homework_2;

import java.util.LinkedList;
import java.util.EmptyStackException;
import java.util.Random;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class cc_clean_code{
    public static void getTime(LinkedList timeList){
      int stackLimit = 0;
      while(stackLimit <10){
        LocalTime time = LocalTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String currentTime = time.format(timeFormatter);
        timeList.add(currentTime);
        stackLimit++;
      };
      System.out.println(timeList);
    }
    
    public static boolean testList(LinkedList numberList, boolean tested){
      Random rand = new Random();
      int limit = 100;
      int stackLimit = 0;
      while(stackLimit<0){
        stackLimit++;
        numberList.add(rand.nextInt(limit));
      };
      tested = true;
      System.out.println("Stack tested: "+ numberList);
      return tested;
    }
    
    public static void main(String [] args){
        LinkedList myList = new LinkedList();
        //
        boolean tested = true;
        if (tested){
          getTime(myList);
        } else{
          tested = testList(myList, tested);
        }
    }
}