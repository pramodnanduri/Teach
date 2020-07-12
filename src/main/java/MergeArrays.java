import java.util.Arrays;

/**
 * TC: O(n).
 * SC: O(a+b) + 3O(1) = O(a+b).
 */
public class MergeArrays {

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 6, 7};
        int[] b = {3, 5, 9};
        System.out.println(Arrays.toString(new MergeArrays().merge(a, b)));
    }

    // a is 100 , b is 200
    int[] merge(int[] a, int[] b) {

        int[] c = new int[a.length + b.length];

        int i = 0; //O(1)
        int j = 0; //O(1)
        int k = 0; //O(1)

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else {
                c[k] = b[j];
                j++;
                k++;
            }
        }

        //Edge case.
        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }
        return c;
    }
}
