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

  public static int sum(int[][] arr) {
    int[] sumOfRows = sumRows(arr);
    int sum = 0;

    for (int index = 0; index < arr.length; index++) {
      sum += sumOfRows[index];
    }

    return sum;
  }

  public static int[][] colsToRows(int[][] matrix) {
    int[][] colsAsRows = new int[matrix[0].length][matrix.length];

    if (matrix[0].length != 0) {
      for (int row = 0; row < matrix.length; row++) {
        for (int column = 0; column < matrix[0].length; column++) {
          colsAsRows[column][row] = matrix[row][column];
        }
      }
    } else {
      int[][] emptyIntArray = {{}};
      return emptyIntArray;
    }

    return colsAsRows;
  }

  public static int[] sumCols(int[][] matrix) {                                 //function doesn't work if empty array in columns (so {{}} ) doesn't work.
    return sumRows(colsToRows(matrix));
  }

  public static boolean isRowMagic(int[][] matrix) {
    int[] rowSums = sumRows(matrix);

    for (int index = 1; index < rowSums.length; index++) {
      if (rowSums[0] != rowSums[index]) {
        return false;
      }
    }

    return true;
  }

  public static boolean isColMagic(int[][] matrix) {
    return isRowMagic(colsToRows(matrix));
  }

  public static boolean isLocationMagic(int[][] matrix, int row, int col) {
    return sumRows(matrix)[row] == sumCols(matrix)[col];
  }

}
