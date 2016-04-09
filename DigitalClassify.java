//给定一系列正整数，请按要求对数字进行分类，并输出以下5个数字：
//A1 = 能被5整除的数字中所有偶数的和；
//A2 = 将被5除后余1的数字按给出顺序进行交错求和，即计算n1-n2+n3-n4...；
//A3 = 被5除后余2的数字的个数；
//A4 = 被5除后余3的数字的平均数，精确到小数点后1位；
//A5 = 被5除后余4的数字中最大数字。 

//关键是保留一位小数和最后不留空格，一开始没看清，一直格式错误
import java.text.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int m = 0,count = 0,count1= 0;
        float sum3 = 0;
        int sum1 = 0,sum2 = 0,max= 0;
        DecimalFormat df = new DecimalFormat("#.0");
        int[] work = new int[num];
        for(int n=0;n<num;n++){
            work[n] = sc.nextInt();
        }
        for(int n=0;n<num;n++){
            if(work[n]%10 == 0){
                sum1+=work[n];
            }else if(work[n]%5 == 1){
                sum2+=Math.pow(-1,m)*work[n];
                m++;
            }else if(work[n]%5 == 2){
                count++;
            }else if(work[n]%5 == 3){
                sum3+=work[n];
                count1++;
            }else if(work[n]%5 == 4){
                if(max<work[n]){
                    max = work[n];
                }
            }
        }
        if(sum1 == 0){
            System.out.print("N ");
        }else{
            System.out.print(sum1+" ");
        }
        if(sum2 == 0){
            System.out.print("N ");
        }else{
            System.out.print(sum2+" ");
        }
        if(count == 0){
            System.out.print("N ");
        }else{
            System.out.print(count+" ");
        }
        if(sum3 == 0){
            System.out.print("N ");
        }else{
            double result = 0;
            result =(double)sum3/count1;
            System.out.print(df.format(result)+" ");
        }
        if(max == 0){
            System.out.print("N");
        }else{
            System.out.print(max);
        }
    }
}
