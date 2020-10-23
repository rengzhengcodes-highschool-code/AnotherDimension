public class Tester {

  public static void main(String[] args) {
    sumTester();
  }

  public static void sumTester() {
    int[][][] sumTestArrsAndAnswer = {
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
}
