package codility.lesson3;

public class FrogJump {

    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int jumps = (Y - X) / D;

        if(X + jumps * D < Y) {
            return jumps + 1;
        }
        return jumps;
    }
}
