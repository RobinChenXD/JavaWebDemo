import java.util.*;
 
public class Zipper {
    public String zipString(String iniString) {
        // write code here
        if(iniString==null||iniString.trim().length()==0){
            return "";
        }
        StringBuilder sb=new StringBuilder();
        char[] iniStr=iniString.toCharArray();
        char pre=iniStr[0];
        int count=1;
        for(int i=1;i<iniStr.length;i++){
            if(pre==iniStr[i]){
                count++;
            }else{
                sb.append(pre+""+count);
                pre=iniStr[i];
                count=1;
            }
        }
        sb.append(pre+""+count);
        if(sb.toString().length()>=iniString.length()){
            return iniString;
        }
        return sb.toString();
    }
}
