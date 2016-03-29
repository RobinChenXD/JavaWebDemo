import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=0;
        int num=0;
        num=sc.nextInt();
        long a,b,c=0;
        while(i++<num){
            a=sc.nextLong();
            b=sc.nextLong();
            c=sc.nextLong();
            if(a+b>c){
                System.out.println("Case #"+i+": true");
            }else{
                System.out.println("Case #"+i+": false");
            }
        }
    }
}
