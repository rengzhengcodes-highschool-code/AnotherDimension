public class Tester {

  public static void main(String[] args) {
    sumTester();
    largestTester();
  }

  public static void sumTester() {
    int[][][] sumTestArrsAndAnswer = {                                          //formatting is {testArray, {answer}}
      {{}, {0}},
      {{0}, {0}},
      {{1, 2, 3, 4, 5}, {15}},
      {{-1, 1, 3}, {3}},
    };

    for (int test = 0;test < sumTestArrsAndAnswer.length ; test++) {
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

}
