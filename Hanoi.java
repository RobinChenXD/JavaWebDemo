import java.util.*;
 
public class Hanoi {
    static int state = 0;
    static int res = -1;
    public static int chkStep(int[] arr, int n) {
        state = 0;
        res = -1;
         
        boolean f = true;
        for(int i = 0; i < n; i++)
            if(arr[i] != 1) f = false;
        if(f) return 0;
             
        int[] ft = new int[n];
        for(int i = 0; i < n; i++)
            ft[i] = 1;
        put(ft, arr, n, 1,2,3);
        return res;
    }
    public static void put(int[] ft, int[] arr, int n, int from, int mid, int to){
        if(res > 0) return;
        if(n == 1){
            move(ft, arr, n, to);
        }else{
            put(ft, arr, n-1, from, to, mid);
            move(ft, arr, n, to);
            put(ft, arr, n-1, mid, from, to);
        }
    }
     
    public static void move(int[] ft, int[] arr, int no, int to){
        state++;
        ft[no-1] = to;
        for(int i = 0; i < arr.length; i++){
            if(ft[i] != arr[i]) return;
        }
        res = state;
    }
}
