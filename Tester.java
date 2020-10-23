import java.util.Arrays;

public class Tester {

  public static void main(String[] args) {
    sumTester();
    largestTester();
    sumRowsTester();
    largestInRowsTester();
    sum2DTester();
  }

  public static void sumTester() {
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
        System.out.println("sum function failed test at index: " + test);
      }
    }
  }

  public static void largestTester() {
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
        System.out.println("largest function failed test at index: " + test);
      }
    }
  }

  public static void sumRowsTester() {
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
        System.out.println("sumRows function failed test at index: " + test);
      }
    }
  }

  public static void largestInRowsTester() {
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
        System.out.println("largestInRows function failed test at index: " + test);
      }
    }
  }

  public static void sum2DTester() {
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
        System.out.println("sums2D function failed test at index: " + test);
      }
    }
  }

}
