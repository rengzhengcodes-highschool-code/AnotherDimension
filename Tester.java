import java.util.Arrays;

public class Tester {

  public static void main(String[] args) {
    sumTester();
    largestTester();
    sumRowsTester();
    largestInRowsTester();
    sum2DTester();
    colsToRowsTester();
    sumColsTester();
    isRowMagicTester();
  }

  public static void errorMessage() {
    for (int i = 0; i < 3; i++) {
      System.out.println("ERROR");
    }
  }

  public static void sumTester() {
    System.out.println("\n sum Function Test \n");
    int[][][] sumTestArrsAndAnswer = {                                          //formatting is {testArray, {answer}}
      {{}, {0}},
      {{0}, {0}},
      {{1, 2, 3, 4, 5}, {15}},
      {{-1, 1, 3}, {3}},
    };

    for (int test = 0; test < sumTestArrsAndAnswer.length; test++) {
      if (ArrayOps.sum(sumTestArrsAndAnswer[test][0]) == sumTestArrsAndAnswer[test][1][0]) {
        System.out.println("sum function passed test at index: " + test);
      } else {
        errorMessage();
        System.out.println("sum function failed test at index: " + test);
      }
    }
  }

  public static void largestTester() {
    System.out.println("\n largest Function Test \n");
    int[][][] largestTestArrsAndAnswer = {                                      //formatting is {testArray, {answer}}
      {{0}, {0}},
      {{-1}, {-1}},
      {{1}, {1}},
      {{0, -2, -1}, {0}},
      {{1, 2, 3, 4, 5}, {5}},
      {{-1, 1, 3}, {3}},
      {{-1, -2, -5, 0}, {0}}
    };

    for (int test = 0;test < largestTestArrsAndAnswer.length ; test++) {
      if (ArrayOps.largest(largestTestArrsAndAnswer[test][0]) == largestTestArrsAndAnswer[test][1][0]) {
        System.out.println("largest function passed test at index: " + test);
      } else {
        errorMessage();
        System.out.println("largest function failed test at index: " + test);
      }
    }
  }

  public static void sumRowsTester() {
    System.out.println("\n sumRowTester Function Test \n");
    int[][][][] sumRowsTestArrsAndAnswer = {                                     //formatting is {test matrix, answer array}
      { //test matrix + answer array array pair.
        {//test matrix
          {},
          {0},
          {1, 2, 3, 4, 5},
          {-1, 1, 3}
        },//test matrix end
        {{0, 0, 15, 3}}//answer array. It's inside another array like the previous answers to compensate for the extra dimension.
      }, //test matrix + answer array answer pair end
      {//test matrix + answer array array pair
        {//test matrix
          {},
        },//test matrix end
        {{0}}
      }, //test matrix + answer array answer pair sumTestArrsAndAnswer
      {//test matrix + answer array array pair
        {//test matrix
          {0},
        },//test matrix end
        {{0}}
      }, //test matrix + answer array answer pair sumTestArrsAndAnswer
    };

    for (int test = 0; test < sumRowsTestArrsAndAnswer.length; test++) {
      if (Arrays.equals(ArrayOps.sumRows(sumRowsTestArrsAndAnswer[test][0]), sumRowsTestArrsAndAnswer[test][1][0])) {
        System.out.println("sumRows function passed test at index: " + test);
      } else {
        errorMessage();
        System.out.println("sumRows function failed test at index: " + test);
      }
    }
  }

  public static void largestInRowsTester() {
    System.out.println("\n largestInRows Function Test \n");
    int[][][][] largestInRowsTestArrsAndAnswer = {
      { //test matrix + answer array array pair.
        {//test matrix
          {0},
          {-1},
          {1},
          {0, -2, -1},
          {1, 2, 3, 4, 5},
          {-1, 1, 3},
          {-1, -2, -5, 0}
        },//test matrix end
        {{0, -1, 1, 0, 5, 3, 0}}//answer array. It's inside another array like the previous answers to compensate for the extra dimension.
      }, //test matrix + answer array answer pair end
      {//test matrix + answer array array s
        {//test matrix
          {0}
        },//test matrix end
        {{0}} //answer array.
      } //test matrix + answer array answer pair end
    };

    for (int test = 0; test < largestInRowsTestArrsAndAnswer.length; test++) {
      if (Arrays.equals(ArrayOps.largestInRows(largestInRowsTestArrsAndAnswer[test][0]), largestInRowsTestArrsAndAnswer[test][1][0])) {
        System.out.println("largestInRows function passed test at index: " + test);
      } else {
        errorMessage();
        System.out.println("largestInRows function failed test at index: " + test);
      }
    }
  }

  public static void sum2DTester() {
    System.out.println("\n sum2D Function Test \n");
    int[][][][] sum2DTesterArrsAndAnswer = {
      {// matrix and answer array array pair
        {//test matrix
          {},
          {0},
          {1, 2, 3, 4, 5},
          {-1, 1, 3}
        },//test matrix end
        {{18}}
      },//matrix and answer array array pair end
      {// matrix and answer array array pair
        {//test matrix
          {},
        },//test matrix end
        {{0}}
      },//matrix and answer array array pair end
      {// matrix and answer array array pair
        {//test matrix
          {1},
          {0},
          {1, 2, 3, 4, 5},
          {-1, 1, 3}
        },//test matrix end
        {{19}}
      },//matrix and answer array array pair end
    };

    for (int test = 0; test < sum2DTesterArrsAndAnswer.length; test++) {
      if (ArrayOps.sum(sum2DTesterArrsAndAnswer[test][0]) == sum2DTesterArrsAndAnswer[test][1][0][0]) {
        System.out.println("sums2D function passed test at index: " + test);
      } else {
        errorMessage();
        System.out.println("sums2D function failed test at index: " + test);
      }
    }
  }

  public static void colsToRowsTester() {
    System.out.println("\n colsToRows Function Test \n");
    int[][][][] colsToRowsTestArrsAndAnswer = {
      { //test matrix + answer array array pair.
        {//test matrix
          {1, 3, 4, 5, 6, -10, 1},
          {4, 5, 5, 4, 3, 2, 3},
        },//test matrix end
        {//answer matrix
          {1, 4},
          {3, 5},
          {4, 5},
          {5, 4},
          {6, 3},
          {-10, 2},
          {1, 3}
        }//answer array. It's inside another array like the previous answers to compensate for the extra dimension.
      }, //test matrix + answer array answer pair end
      { //test matrix + answer array array pair.
        {//test matrix
          {1},
        },//test matrix end
        {//answer matrix
          {1},
        }//answer matrix end
      }, //test matrix + answer array answer pair end
      { //test matrix + answer array array pair.
        {//test matrix
          {},
        },//test matrix end
        {//answer matrix
          {},
        }//answer matrix end
      }, //test matrix + answer array answer pair end
      { //test matrix + answer array array pair.
        {//test matrix
          {},
          {},
        },//test matrix end
        {//answer matrix
          {},
        }//answer matrix end
      }, //test matrix + answer array answer pair end
      { //test matrix + answer array array pair.
        {//test matrix
          {-1, 0, 3, 4, 5},
        },//test matrix end
        {//answer matrix
          {-1},
          {0},
          {3},
          {4},
          {5}
        }//answer matrix end
      }, //test matrix + answer array answer pair end
      { //test matrix + answer array array pair.
        {//test matrix
          {-1},
          {0},
          {3},
          {4},
          {5}
        },//test matrix end
        {//answer matrix
          {-1, 0, 3, 4, 5},
        }//answer matrix end
      }, //test matrix + answer array answer pair end
    };

    for (int test = 0; test < colsToRowsTestArrsAndAnswer.length; test++) {
      if (Arrays.deepEquals(ArrayOps.colsToRows(colsToRowsTestArrsAndAnswer[test][0]), colsToRowsTestArrsAndAnswer[test][1])) {
        System.out.println("colsToRows function passed test at index: " + test);
      } else {
        errorMessage();
        System.out.println("colsToRows function failed test at index: " + test);
      }
    }
  }

  public static void sumColsTester() {
    System.out.println("\n sumCols Function Test \n");
    int[][][][] sumColsTestArrsAndAnswer = {
      { //test matrix + answer array array pair.
        {//test matrix
          {1, 3, 4, 5, 6, -10, 1},
          {4, 5, 5, 4, 3, 2, 3},
        },//test matrix end
          {{5, 8, 9, 9, 9, -8, 4}}//answer array. It's inside another array like the previous answers to compensate for the extra dimension.
      }, //test matrix + answer array answer pair end
      { //test matrix + answer array array pair.
        {//test matrix
          {1},
        },//test matrix end
          {{1}}//answer array. It's inside another array like the previous answers to compensate for the extra dimension.
      }, //test matrix + answer array answer pair end
      { //test matrix + answer array array pair.
        {//test matrix
          {},
        },//test matrix end
          {{0}}//answer array. It's inside another array like the previous answers to compensate for the extra dimension.
      }, //test matrix + answer array answer pair end
      { //test matrix + answer array array pair.
        {//test matrix
          {},
          {},
        },//test matrix end
        {{0}}//answer array. It's inside another array like the previous answers to compensate for the extra dimension.
      }, //test matrix + answer array answer pair end
      { //test matrix + answer array array pair.
        {//test matrix
          {-1, 0, 3, 4, 5},
        },//test matrix end
        {{-1, 0, 3, 4, 5}}//answer array. It's inside another array like the previous answers to compensate for the extra dimension.
      }, //test matrix + answer array answer pair end
      { //test matrix + answer array array pair.
        {//test matrix
          {-1},
          {0},
          {3},
          {4},
          {5}
        },//test matrix end
        {{11}}//answer array. It's inside another array like the previous answers to compensate for the extra dimension.
      }, //test matrix + answer array answer pair end
    };

    for (int test = 0; test < sumColsTestArrsAndAnswer.length; test++) {
      if (Arrays.equals(ArrayOps.sumCols(sumColsTestArrsAndAnswer[test][0]), sumColsTestArrsAndAnswer[test][1][0])) {
        System.out.println("sumCols function passed test at index: " + test);
      } else {
        errorMessage();
        System.out.println("sumCols function failed test at index: " + test);
      }
    }
  }

  public static void isRowMagicTester() {
    System.out.println("\n isRowMagic Function Test \n");
    int[][][] isRowMagicArrs = {
      {//index 0
        {0,0,0,0,0},
        {0,0,0,0,0}
      },
      {//index 1
        {}
      },
      {//index 2
        {0}
      },
      {//index 3
        {10}
      },
      {//index 4
        {1, 23, 2}
      },
      {//index 5
        {1, 2, 3, 4},
        {-2, 3, 4, 5},
        {-1, -1, -1, 13},
        {20, -9, -3, 2}
      },
      {//index 6
        {1, 2, 32, 4},
        {-82, 763, 43, 95},
        {-21, 231, -54351, 123},
        {2230, -39, -23, 2443}
      },
      {//index 7
        {1},
        {2},
      }
    };

    boolean[] isRowMagicAnswers = {
      true,
      true,
      true,
      true,
      true,
      true,
      false,
      false,
    };

    for (int test = 0; test < isRowMagicArrs.length; test++) {
      if (ArrayOps.isRowMagic(isRowMagicArrs[test]) == isRowMagicAnswers[test]) {
        System.out.println("sumCols function passed test at index: " + test);
      } else {
        errorMessage();
        System.out.println("sumCols function failed test at index: " + test);
      }
    }
  }

}
