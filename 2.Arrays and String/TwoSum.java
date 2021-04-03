import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /*   Input: nums = [2,7,11,15], target = 9
       Output: [0,1]
       Output: Because nums[0] + nums[1] == 9, we return [0, 1].*/
/*    Input: nums = [3,2,4], target = 6
    Output: [1,2]*/
    public static void main(String args[]) {
        int[] nums = {2, 5, 5, 11};
        int target = 10;
        //System.out.println(Arrays.toString(twoSumWithForLoop(nums, target)));
        System.out.println(Arrays.toString(twoSumWithHashTableOptimized(nums, target)));
    }

    public static int[] twoSumWithForLoop(int[] nums, int target) {
        int[] result = new int[2];
        boolean isFound = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++)
                if (!isFound && (nums[i]) + (nums[j]) == target) {
                    result[0] = i;
                    result[1] = j;
                    isFound = true;
                }
        }
        return result;
    }

    public static int[] twoSumWithCleanerCode(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] twoSumWithHashTable(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int j = 0; j < nums.length; j++) {
            int numberToFind = target - nums[j];
            if(map.containsKey(numberToFind) && map.get(numberToFind)!=j)
            {
                return new int[] {j,map.get(numberToFind)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static int[] twoSumWithHashTableOptimized(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");

    }

}
