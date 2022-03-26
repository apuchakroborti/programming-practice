package numbers;

import java.util.*;
//test cases
//1000000000, 1
//(3**9)*(2**14), M=(2**14)*(2**14)
public class ChocolatesByNumbers {
    public int solution(int N, int M){
        return N/getGcd(N, M);
    }
    int getGcd(int A, int B){
        if(A%B==0)return B;
        else return getGcd(B, A%B);
    }
}
