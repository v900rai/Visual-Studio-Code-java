package PatternInJava;

public class ReversStrarr {
  public static void main(String[] args) {
    // Revres program
    for (int i = 1; i <= 5; i++) {
      for (int j = 5; j >= i; j--) {
        System.out.print(" * ");
      }
      System.out.println();
    }
  }

}
