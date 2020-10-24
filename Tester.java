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
    isColMagicTester();
    isLocationMagicTester();
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
      {{1, 3, 5}, {9}}
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
    int[][][][] sumRowsTestArrsAndAnswer = {                                    //formatting is {test matrix, answer array}
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
      {// matrix and answer array array pair
        {//test matrix
          {1, 0, 12, -1},
          {7, -2, 2, 1},
          {-5,-2, 2, -9}
        },//test matrix end
        {{12, 8, -14}}
      },//matrix and answer array array pair end
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
      }, //test matrix + answer array answer pair end
      {// matrix and answer array array pair
        {//test matrix
          {1, 0, 12, -1},
          {7, -2, 2, 1},
          {-5,-2, 2, -9}
        },//test matrix end
        {{12, 7, 2}}
      },//matrix and answer array array pair end
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
      {// matrix and answer array array pair
        {//test matrix
          {1, 0, 12, -1},
          {7, -2, 2, 1},
          {-5,-2, 2, -9}
        },//test matrix end
        {{6}}
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
      { //test matrix + answer array array pair.
        {//test matrix
          {1, 0, 12, -1},
          {7, -2, 2, 1},
          {-5, -2, 2, -9}
        },//test matrix end
        {{3, -4, 16, -9}}//answer array. It's inside another array like the previous answers to compensate for the extra dimension.
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
    int[][][] isRowMagicTestArrs = {
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
      },
      {//index 8
        {1, 2, 3, 4},
        {2, 3, 4, 1},
        {3, 4, 1, 2}
      },
      {//index 9
        {1, -2, -1, 20},
        {2, 3, -1, -9},
        {3, 4, -1, -3},
        {4, 5, 13, 2}
      },
      {//index 10
        {1, 1, 1},
        {2, 2, 2},
        {3, 3, 3}
      }
    };

    boolean[] isRowMagicTestAnswers = {
      true,
      true,
      true,
      true,
      true,
      true,
      false,
      false,
      true,
      false,
      false,
    };

    for (int test = 0; test < isRowMagicTestArrs.length; test++) {
      if (ArrayOps.isRowMagic(isRowMagicTestArrs[test]) == isRowMagicTestAnswers[test]) {
        System.out.println("isRowMagic function passed test at index: " + test);
      } else {
        errorMessage();
        System.out.println("isRowMagic function failed test at index: " + test);
      }
    }
  }

  public static void isColMagicTester() {
    System.out.println("\n isColMagic Function Test \n");
    int[][][] isColMagicTestArrs = {
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
      },
      {//index 8
        {1, -2, -1, 20},
        {2, 3, -1, -9},
        {3, 4, -1, -3},
        {4, 5, 13, 2}
      },
      {//index 9
        {1, 2, 3, 4},
        {2, 3, 4, 1},
        {3, 4, 1, 2},
      },
      {//index 10
        {1, 1, 1},
        {2, 2, 2},
        {3, 3, 3}
      }
    };

    boolean[] isColMagicTestAnswers = {
      true,
      true,
      true,
      true,
      false,
      false,
      false,
      true,
      true,
      false,
      true
    };

    for (int test = 0; test < isColMagicTestArrs.length; test++) {
      if (ArrayOps.isColMagic(isColMagicTestArrs[test]) == isColMagicTestAnswers[test]) {
        System.out.println("isColMagic function passed test at index: " + test);
      } else {
        errorMessage();
        System.out.println("isColMagic function failed test at index: " + test);
      }
    }
  }

  public static void isLocationMagicTester() {
    System.out.println("\n isLocationMagic Function Test \n");
    int[][][][] isLocationMagicTestArrs = {                                     //tests are nested inside of master array, and inside each test array is an array with the matrix and an array with the input coords.
      {//test array 0
        {//matrix
          {2, 4, 2},
          {2, 2, 2}
        },
        {//other inputs
          {0, 1}
        }
      },
      {//test array 1
        {//matrix
          {2, 4, 2},
          {2, 2, 2}
        },
        {//other inputs
          {1, 1}
        }
      },
    };

    boolean[] isLocationMagicTestAnswers = {
      false,
      true,
    };

    for (int test = 0; test < isLocationMagicTestArrs.length; test++) {
      int[][][] currentTest = isLocationMagicTestArrs[test];
      if (ArrayOps.isLocationMagic(currentTest[0], currentTest[1][0][0], currentTest[1][0][1]) == isLocationMagicTestAnswers[test]) {
        System.out.println("isLocationMagic function passed test at index: " + test);
      } else {
        errorMessage();
        System.out.println("isLocationMagic function failed test at index: " + test);
      }
    }
    isLocationMagicTesterSudoku();
  }

  public static void isLocationMagicTesterSudoku() {
    System.out.println("\n isLocationMagic Function Test but Sudoku \n");       //due to how a sudoku board is set up, all rows and columns contain the same digits and thus have the same sum. All positions on a sudoku board should evaluate as true for isLocationMagic.
    int[][] sudokuBoard = {
      {5, 3, 4, 6, 7, 8, 9, 1, 2},
      {6, 7, 2, 1, 9, 5, 3, 4, 8},
      {1, 9, 8, 3, 4, 2, 5, 6, 7},
      {8, 5, 9, 7, 6, 1, 4, 2, 3},
      {4, 2, 6, 8, 5, 3, 7, 9, 1},
      {7, 1, 3, 9, 2, 4, 8, 5, 6},
      {9, 6, 1, 5, 3, 7, 2, 8, 4},
      {2, 8, 7, 4, 1, 9, 6, 3, 5},
      {3, 4, 5, 2, 8, 6, 1, 7, 9}
    };

    boolean failed = false;

    for (int row = 0; row < 9; row++) {
      for (int column = 0; column < 9; column++) {
        if (ArrayOps.isLocationMagic(sudokuBoard, row, column) == true) {
          System.out.println("Sudoku board point evaluated correctly at x: " + (column + 1) + " | y: " + (row + 1));
        } else {
          errorMessage();
          System.out.println("Sudoku board point evaluated incorrectly at x: " + (column + 1) + " | y: " + (row + 1));
          failed = true;
        }
      }
    }
    if (failed) {
      System.out.println("Sudoku test was failed somewhere.");
    }else {
      System.out.println("Sudoku test fully succeded.");
    }
  }

}
