public class ArrayOps {

  public static int sum(int[] arr) {
    int total = 0;
    for (int index = 0; index < arr.length; index++) {
      total += arr[index];
    }
    return total;
  }

  public static int largest(int[] arr) {
    int largest = arr[0];

    for (int index = 1; index < arr.length; index++) {
      if (arr[index] > largest) {
        largest = arr[index];
      }
    }

    return largest;
  }

  public static int[] sumRows(int[][] matrix) {
    int[]sums = new int[matrix.length];

    for (int row = 0; row < matrix.length; row++) {
      sums[row] = sum(matrix[row]);
    }

    return sums;
  }

  public static int[] largestInRows(int[][] matrix) {
    int[] largests = new int[matrix.length];

    for (int row = 0; row < matrix.length; row++) {
      largests[row] = largest(matrix[row]);
    }

    return largests;
  }

  public static  int sum(int[][] arr) {
    int[] sumOfRows = sumRows(arr);
    int sum = 0;

    for (int index = 0; index < arr.length; index++) {
      sum += sumOfRows[index];
    }

    return sum;
  }

}
