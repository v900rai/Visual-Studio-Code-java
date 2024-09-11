package ARRAYSINJAVA;

import java.util.Scanner;

/**
 * FindTheTargetElement
 */
public class FindTheTargetElement {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    int target = scn.nextInt();

    for (int i = 0; i < arr.length; i++) {
      if (target == arr[i]) {
        System.out.println(i);
        return;
      }
    }
    System.out.println(-1);

  }

}
