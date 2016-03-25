//输入某整数，输出二进制表示的1的个数
public class NumberOf1{
    public int NumberOf1(int n) {
		int count = 0;
        while(n!= 0){
            count++;
            n = n & (n - 1);
         }
        return count;
    }
}
