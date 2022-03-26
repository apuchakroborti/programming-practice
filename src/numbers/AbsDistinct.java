package numbers;
import java.util.*;
public class AbsDistinct {
     public int solution(int[] A){
         Set<Integer> set = new HashSet<Integer>();
         for(int val:A){
             set.add(Math.abs(val));
         }
         return set.size();
     }
}
