//给定两个字符串s1,s2,请返回bool值代表s2是否由s1旋转而成
import java.util.*;

public class ReverseEqual {
    public boolean checkReverseEqual(String s1, String s2) {
        // write code here
        if(s1.length() == 0||s2.length() == 0){
            return false;
        }
        String s = s1 + s1;
        if(s.indexOf(s2) == -1){
            return false;
        }
        return true;
    }
}
