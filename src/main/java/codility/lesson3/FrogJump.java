package codility.lesson3;

public class FrogJump {

    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        if((Y - X) % D == 0) {
            return (Y - X) / D;
        }
        return (Y - X) / D + 1;
    }
}
