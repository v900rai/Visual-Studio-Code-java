package SearchingInJava;

public class LinearSearch {
  public static void main(String args[]) {
    int arr[] = new int[] { 10, 20, 30, 40, 50 };
    int target = 40;
    boolean found = false; // Added a flag to track if the target is found

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        System.out.println("Found the element: " + arr[i] + " index ..." + i);
        found = true; // Set the flag to true if the target is found
        break;
      }
    }

    if (!found) {
      System.out.println("Element not found");
    }
  }
}
