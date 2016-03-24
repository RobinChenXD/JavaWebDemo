//在二维数组中查找是否存在某个整数
public class FindIntInArray{
  public static boolean Find(int[][] array,int target){
    int rows=array.length;
    int columns=array[0].length;
    boolean flag=false;
    if(array!=null&&rows>0&&columns>0){
      int row=0;
      int col=columns-1;
      while(row<rows&&col>=0){
        if(array[row][col]<target){
          ++row;
        }else if(array[row][col]>target){
          --col;
        }else{
          flag=true;
          break;
        }
      }
    }
    return flag;
  }
}  
