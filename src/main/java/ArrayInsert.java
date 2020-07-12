import java.util.ArrayList;
import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {
        int[] A = new int[]{3, 4, 5, 7, 8, 0, 0};
        new ArrayInsert().insert(A, 3, 6);
    }

    void insert(int[] A, int x, int value) {
        boolean start = false;
        int y = 0;
        for (int i = 0; i < A.length; i++) {
            if (i == x) {
                y = A[i];
                A[i] = value;
                start = true;
            } else {
                if (start) {
                    int z = y;
                    y = A[i];
                    A[i] = z;
                } else {
                    A[i] = A[i];
                }
            }

        }
        System.out.println(Arrays.toString(A));
    }
}
