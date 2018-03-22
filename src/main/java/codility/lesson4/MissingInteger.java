package codility.lesson4;

public class MissingInteger {

    public static int solution(int[] A) {
        // write your code in Java SE 8
        boolean allNegative = true;
        boolean[] numbers = new boolean[A.length + 1];

        for (int i = 0; i < A.length; i++) {
            int number = A[i];
            if (number > 0 && number < A.length) {
                allNegative = false;
                numbers[number] = true;
            }
        }

        if (allNegative) {
            return 1;
        } else {
            for (int i = 1; i < numbers.length; i++) {
                if (!numbers[i]) {
                    return i;
                }
            }
            return A.length + 1;
        }
    }
}
