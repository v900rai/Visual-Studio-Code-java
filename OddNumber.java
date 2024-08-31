public class OddNumber {
  public static void main(String[] args) {
    int num = 19;
    for (int i = 1; i <= num; i++) {
      if (num % i != 0) {
        System.out.println("Odd number " + num);
      } else {
        System.out.println("Even number");
      }

    }
  }

}
