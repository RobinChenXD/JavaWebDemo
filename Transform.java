   /*
 *解题思路:
 * 分析该问题，这道题的本质是要对整个矩阵进行旋转90度，所以我们只要考虑矩阵中的每个元素旋转后的位置即可找出特点，
 * 拿一个元素（最外圈的第一个）为例，它旋转后位于最右侧的位置，同时最右侧位置的元素到最右下的位置，最右下的元素到最左下的位置
 * 最左下的元素到第一个元素的位置
 *
 * 所以通过分析可以设置四个变量分别代表每一圈的上下左右上限left,right,top,down
 * 然后用一个临时变量temp存储旋转一个元素时要被覆盖的元素，
 * 这样旋转完一圈中的第一行的元素（其他元素元素跟着对应旋转），即完成了一圈的旋转
 * 通过分析可得在对在旋转第一行的对应的第i个元素时，其余位置的元素旋转覆盖循序如下：
 * 右:[i + top][right]
 * 下:[down][right-i]
 * 左:[down - i][left]
 * 上(即第一行的元素):[top][i + left]
 */
public int[][] transformImage(int[][] mat, int n) {
    // write code here
    if(n <= 0)
    {
        return mat;
    }
     
    int left = 0,right = n - 1,top = 0, down = n - 1;
    int temp = mat[0][0],temp1;
     
     
    while(top < down && left < right)
    {
        for(int i = 0; i < right - top; i++)
        {//right - top 防止每一圈进行了多旋转
            //旋转覆盖右侧元素
            temp = mat[i + top][right];
            mat[i + top][right] = mat[top][i + left];
             
            //旋转覆盖下侧元素
            temp1 = mat[down][right - i];
            mat[down][right - i] = temp;
             
            //旋转覆盖左侧元素
            temp = mat[down - i][left];
            mat[down - i][left] = temp1;
             
            //覆盖第一行元素
            mat[top][i + left] = temp;
        }
         
        //再向内一圈旋转
        top++;
        down--;
        left++;
        right--;
    }
     
    return mat;
}
