public class ArrayOps {

  public static int sum(int[] arr) {
    int total = 0;
    for (int index = 0; index < arr.length; index++) {
      total += arr[index];
    }
    return total;
  }

  public static  int largest(int[] arr) {
    int largest = arr[0];

    for (int index = 1; index < arr.length ; index++) {
      if (arr[index] > largest) {
        largest = arr[index];
      }
    }

    return largest;
 }

}
