package programmingpractice;

public class TennisTournament {
    public int solution(int P, int C){
        if(P<2)return 0;
        int totalPlayers=C*2;
        if(P>=totalPlayers){
            return C;
        }
        int match=0;
        match=P/2;
        
         return match;
    }
}
