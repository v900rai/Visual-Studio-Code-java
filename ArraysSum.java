public class ArraysSum {
  public static void main(String[] args) {
    int sum = 0;
    int arr[] = new int[] { 10, 12, 1, 3, 7 };
    for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];

    }
    System.out.println(sum);
  }

}
