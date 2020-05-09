import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public static void main(String[] args) {
        int[] nums = new int[]{2,4,7,11};
        int target = 9;
        try {
            System.out.println(Arrays.toString(twoSums(nums,target)));
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public static int[] twoSums(int[] nums, int target) {
        /**   
         * Brute Force Approach
        for (int i = 0; i < nums.length; i++) {
		    for (int j = 0; j< nums.length; j++) {
			    if ((i != j) && (nums[i] + nums[j] == target )) {
                    return new int[]{i,j};
			    }
		    }
        }
        throw new IllegalArgumentException("No two sum Soul");
        */

        /**  One pass Map */
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum Solution");
    }

}
