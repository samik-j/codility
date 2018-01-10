package codility.lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TapeEquilibrium {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int sumOfAll = 0;

        for (int a : A) {
            sumOfAll += a;
        }

        List<Integer> differences = new ArrayList<>();
        int sumToP = 0;

        for (int P = 1; P < A.length; P++) {
            sumToP += A[P - 1];

            differences.add(Math.abs(sumToP - (sumOfAll - sumToP)));
        }

        return Collections.min(differences);
    }
}
