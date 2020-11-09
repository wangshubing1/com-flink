import java.util.HashMap;
import java.util.Map;

/**
 * @Author: king
 * @Date: Create in 2020/10/16
 * @Desc: TODO
 */
public class LeetCode {
    public static void main(String[] args) {
        int[] nums={2,7,11,15,16,23};
        int target =27;
        System.out.println(twoSum(nums,target));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        for(int n=0; n<nums.length; n++){
            int x = nums[n];
            for(int i=n+1; i<nums.length; i++){
                int h = x + nums[i];
                if(target == h){
                    System.out.println("源数组中和为：[ " + target + " ] 的两个数为 :  " + nums[n] + " + " + nums[i]);
                    System.out.println("他们的数组下标分别为： " + n + "         " +  i);
                    a[0] = n;
                    a[1] = i;
                }
            }
        }
        return a;
    }
}
