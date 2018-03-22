package codility.lesson4;

import java.util.*;

public class FrogRiverOne {

    // time complexity O(n*2)
    public int solution(int X, int[] A) {
        List<Integer> positionsTaken = new ArrayList<Integer>();

        for (int i = 0; i < A.length; i++) {
            if (!positionsTaken.contains(A[i])) {
                positionsTaken.add(A[i]);
            }
            if (positionsTaken.size() == X) {
                return i;
            }
        }

        return -1;
    }

    // time complexity O(n)
    public int solution2(int X, int[] A) {
        Set<Integer> positionsTaken = new HashSet<Integer>();

        for (int i = 0; i < A.length; i++) {
            if (positionsTaken.add(A[i])) {
                if (positionsTaken.size() == X) {
                    return i;
                }
            }
        }

        return -1;
    }
}
