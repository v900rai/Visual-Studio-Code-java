package StackInJava;

import java.util.*;

public class firstStackProgram {
  public static void main(String[] args) {
    Stack<String> spoorts = new Stack<>();
    spoorts.push("Cricket");
    spoorts.push("Footbal");
    spoorts.push("Tennis");
    System.out.println("myStack : " + spoorts);
    String element = spoorts.pop();
    System.out.println(element);
    System.out.println("myStack : " + spoorts);
  }

}
