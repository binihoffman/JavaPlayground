public class MergeSort {

    //https://www.geeksforgeeks.org/merge-sort/
    //[12, 11, 13, 5, 6, 7]
    public void sort(int[] array, int left, int right)
    {
        if (left < right)
        {
            int mid = (right + left) / 2;
            sort(array, left, mid);
            sort(array, mid + 1, right);

            merge(array, left, mid, right);
        }
    }

    private void merge(int[] array, int left, int mid, int right)
    {
        //sizes of 2 subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        //Create temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        //copy data to temp arrays
        for (int i = 0; i < n1; i++)
        {
            L[i] = array[left+i];
        }
        for (int j = 0; j < n2; j++)
        {
            R[j] = array[mid+1+j];
        }
        //merge the temp arrays
        int i = 0, j = 0;
        //initial index of merged subarray
        int k = left;
        while ((i < n1 && j < n2))
        {
            if (L[i] <= R[j])
            {
                array[k] = L[i];
                i++;
            }
            else
            {
                array[k] = R[j];
                j++;
            }
            k++;
        }
        //copy rest of element of L
        while (i < n1)
        {
            array[k] = L[i];
            i++;
            k++;
        }

        //Copy rest of elements of R
        while (j < n2)
        {
            array[k] = R[j];
            j++;
            k++;
        }

    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method
    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length-1);

        System.out.println("\nSorted array");
        printArray(arr);
        //System.gc();
    }
}
