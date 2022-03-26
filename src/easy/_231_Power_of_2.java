package easy;

public class _231_Power_of_2 {
    public boolean isPowerOfTwo(int n) {
        int i = -1;
        while(true){
            i ++;
            double num = Math.pow(2,i);
            if(num < n){
                continue;
            }else if(num == n){
                return true;
            }else{
                return false;
            }
        }
    }
}
