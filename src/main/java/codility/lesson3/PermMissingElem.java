package codility.lesson3;

public class PermMissingElem {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int sumOfA = 0;
        int sum = 0;

        for (int a : A) {
            sumOfA += a;
        }

        for (int i = 1; i <= A.length + 1; i++) {
            sum += i;
        }

        return sum - sumOfA;
    }
}
