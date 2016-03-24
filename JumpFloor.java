public class JumpFloor {
    public int JumpFloor(int target) {
        if(target<=0){
            return -1;
        }else if(target==1||target==2){
            return target;
        }else{
            int target1=1;
            int target2=2;
            int sum=0;
            for(int i=2;i<target;i++){
                sum=target1+target2;
                target1=target2;
                target2=sum;
            }
            return sum;
            
        }
    }
}
