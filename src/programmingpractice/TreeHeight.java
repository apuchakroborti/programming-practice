package programmingpractice;


public class TreeHeight {
    public int solution(Tree T){
        if(T==null)return -1;
        return maxLength(T);
    }
    int maxLength(Tree T){
        if(T==null){
            return -1;
        }
        int leftTree=maxLength(T.l);
        int rightTree=maxLength(T.r);
        return Math.max(leftTree, rightTree)+1;
    }
}
