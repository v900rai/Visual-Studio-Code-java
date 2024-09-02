package PatternInJava;

public class StarPattern {
  public static void main(String args[]) {
    int nums = 5;
    for (int i = 1; i <= nums; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(" *");
      }
      System.out.println();
    }

  }

}
