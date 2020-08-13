import java.util.Arrays;

public class MatrixRowColumn0 {

    //page 48 -1.7 -
    public static void main(String args[]) {
        int[] one = {1, 4, 2};
        int[] two = {5, 5,0};
        int[] three = {0, 1, 2};
        int[][]input = new int[3][3];
        input[0] = one;
        input[1] = two;
        input[2] = three;
        System.out.println(Arrays.deepToString(input));
        System.out.println(Arrays.deepToString(matrixZero(input)));
    }

    public static int[][] matrixZero(int[][] input) {
        int len = input.length;
        int wid = input[0].length;
        int[] cols = new int[wid];
        int[] rows = new int[len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < wid; j++) {
                if (input[i][j] == 0) {
                    cols[j] = 1;
                    rows[i] = 1;
                }
            }
        }
        for (int i = 0; i < len; i++)
        {
            for (int j = 0; j < wid; j++)
            {
                if (cols[j] == 1 || rows[i] == 1)
                {
                    input[i][j] = 0;
                }
            }
        }
        return input;
    }
}
