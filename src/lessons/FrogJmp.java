package lessons;
public class FrogJmp {
    public int solution(int X, int Y, int D){
        int remainingDistance = Y - X;
        int steps = (int) Math.ceil(remainingDistance/(double)D);
        return steps;
    }
}
