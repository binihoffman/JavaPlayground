public class MatrixNumberOfPaths {

    //https://www.geeksforgeeks.org/count-possible-paths-top-left-bottom-right-nxm-matrix/
    public static void main (String[] args)
    {
        System.out.println(countNumberOfPaths(5,1));
        System.out.println(countNumberOfPaths(2,2));
        System.out.println(countNumberOfPaths(3,2));
    }

    public static int countNumberOfPaths(int n, int m)
    {
        if (n ==1 || m == 1)
            return 1;
        return (countNumberOfPaths(n-1, m) + countNumberOfPaths(n, m-1));
    }
}
