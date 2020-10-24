import java.util.Arrays;

public class ariesHoTestCases {
  public static void main(String[] args) {
    int[] testme = {1, 4, 2, 3};
    int[][] testme2 = {{1, 2, 3, 4, 5},
                       {5, 5},
                       {4, 3, 2, 1}};
    int[][] testrectangle = {{2, 4, 6, 7},
                            {4, 5, 7, 6},
                            {1, 2, 3, 4}};
    int[][] testmerectmagic = {{1, 2, 3, 4},
                              {4, 3, 2, 1},
                              {0, 7, 3, 0}};
    int[][] testmagic = {{2, 4, 6, 7},
                        {6, 4, 2, 1},
                        {1, 1, 1, 1}};
    int[][] magic = {{1, 2, 4, 3},
                    {2, 5, 7, 3},
                    {3, 6, 0, 9},
                    {4, 6, 2, 1}};
    System.out.println(ArrayOps.sum(testme)); //10
    System.out.println(ArrayOps.largest(testme)); //4
    System.out.println(Arrays.toString(ArrayOps.sumRows(testme2))); //[15, 10, 10]
    System.out.println(Arrays.toString(ArrayOps.largestInRows(testme2))); //[5, 5, 4]
    System.out.println(ArrayOps.sum(testme2)); //35
    System.out.println(Arrays.toString(ArrayOps.sumCols(testrectangle))); //[7, 11, 16, 17]
    System.out.println(ArrayOps.isRowMagic(testmerectmagic)); //true
    System.out.println(ArrayOps.isRowMagic(testrectangle)); //false
    System.out.println(ArrayOps.isColMagic(testmerectmagic)); //false
    System.out.println(ArrayOps.isColMagic(testmagic)); //true
    System.out.println(ArrayOps.isLocationMagic(magic, 0, 0)); //true
    System.out.println(ArrayOps.isLocationMagic(magic, 3, 2)); //true
    System.out.println(ArrayOps.isLocationMagic(magic, 1, 2)); //false
  }
}
