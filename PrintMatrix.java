//顺时针打印矩阵数组的数据
import java.util.ArrayList;
public class PrintMatrix{
  public Array<Integer>printMatrix(int[][] array){
    ArrayList<Integer>result=new ArrayList<Integer>();
    if(array.length==0){
      return result;
    }
    int n=array.length,m=array[0].length;
    if(m==0){
      return result;
    }
    int layers=(Math.min(n,m)-1)/2+1;
    for(int i=0;i<layers;i++){
      for(int k=i;k<m-i;k++){result.add(array[i][k]);}
      for(int j=i+1;j<n-i;j++){result.add(array[j][m-i]);}
      for(int k=m-i-2;(k>=i)&&(n-i-1!=i);k--){result.add(array[n-i-1][k]);}
      for(int j=n-i-2;(j>i)&&(m-i-1!=i);j--){result.add(array[j][i]);}
    }
    return result;
  }
}

      
