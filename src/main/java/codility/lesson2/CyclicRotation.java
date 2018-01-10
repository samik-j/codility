package codility.lesson2;

public class CyclicRotation {

    public static int[] solution(int[] A, int K) {
        // write your code in Java SE 8

        if (K == 0 || A.length == 0) {
            return A;
        }

        for (int j = 0; j < K; j++) {
            int temp1 = A[A.length - 1];
            int temp2 = 0;

            for (int i = 0; i < A.length; i++) {
                temp2 = A[i];
                A[i] = temp1;
                temp1 = temp2;
            }
        }
        return A;
    }
}
