//搜狐实习生笔试题 求两个字符串的编辑距离  
import java.util.Scanner;
public class StringEdit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		System.out.println(editDistance(str1,str2));
	}
	private static int min(int a, int b){
        return a < b ? a : b;
    }
	private static int editDistance(String str1, String str2) {
		// TODO Auto-generated method stub
		int lenStr1=str1.length();
        int lenStr2=str2.length();
        int[][] edit=new int[lenStr1][lenStr2];
        for(int i=0;i<lenStr1;i++){
            edit[i][0]=i;
        }
        for(int j=0;j<lenStr2;j++){
            edit[0][j]=j;
        }
        
        for(int i=1;i<lenStr1;i++){
            for(int j=1;j<lenStr2;j++){
                edit[i][j]=min(edit[i-1][j]+1,edit[i][j-1]+1);
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    edit[i][j]=min(edit[i][j], edit[i-1][j-1]);
                }else{
                    edit[i][j]=min(edit[i][j], edit[i-1][j-1]+1);
                }
            }
        }
        
        return edit[lenStr1-1][lenStr2-1];
		
	}

}
