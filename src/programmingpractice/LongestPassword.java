package programmingpractice;

import java.util.*;

public class LongestPassword {
     public int solution(String S){
         String[] words = S.split("\\s+");
         int maxLength=-1;
         for(int i=0; i< words.length ; i++){
            boolean isAlphaNumeric = words[i] != null && words[i].chars().allMatch(Character::isLetterOrDigit);
            if(isAlphaNumeric && words[i].length()%2!=0){
                long numeric = words[i].chars().filter(Character::isDigit).count();
                long letters = words[i].chars().filter(Character::isLetter).count();
                
                if(numeric%2!=0 && letters%2==0){
                    maxLength = Math.max(words[i].length(), maxLength);
                }
            }
         }
         
         return maxLength;
     }
}
