public class ArrayOps {

  public static int sum(int[] arr) {
    int total = 0;
    for (int index = 0;index < arr.length ; index++) {
      total += arr[index];
    }
    return total;
  }

}
