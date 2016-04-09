import java.util.*;

public class CheckSame {
    public boolean checkSam(String stringA, String stringB) {
        // write code here
        int lenA = stringA.length();
        int lenB = stringB.length();
        if(lenA != lenB){
            return false;
        }
        int[] strA = new int[256];
        int[] strB = new int[256];
        for(int i = 0; i < lenA; i++){
            strA[(stringA.charAt(i))]++;
            strB[(stringB.charAt(i))]++;
        }
        for(int i = 0; i < 256; i++){
            if(strA[i]!=strB[i]){
                return false;
            }
        }
        return true;
    }
}
