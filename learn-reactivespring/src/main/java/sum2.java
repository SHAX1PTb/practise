import java.util.Arrays;

public class sum2 {

    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;

        Arrays.sort(nums);

        int low = 0;
        int high = nums.length -1;

        while(low<high){

            if(nums[low] + nums[high] == target ){
                System.out.println(nums[low] + ":" + nums[high]);
            }

            if(nums[low] + nums[high] < target){
                low++;
            } else {
                high --;
            }

        }
    }
}
