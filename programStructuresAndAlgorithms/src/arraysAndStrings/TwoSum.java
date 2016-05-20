package arraysAndStrings;

import java.util.HashMap;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution.
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * @author Devashri
 *
 */
public class TwoSum {

	//brute force approach
	public int[] twoSum(int[] nums, int target) {
        int[] arrayOfIndices = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                
            	if(i!=j){
                int sum = nums[i]+nums[j];
                if(sum==target){
                    arrayOfIndices[0]=i;
                    arrayOfIndices[1]=j;
                    break;
                }
                }
            }
        }
        
        return arrayOfIndices;
    }
	
	//one pass
	//complexity O(N)
	public int[] twoSumOnePass(int[] nums, int target) {
		HashMap<Integer,Integer> map = new HashMap<>();
		int[] result = new int[2];
		for(int i=0;i<nums.length;i++){
			int complement = target - nums[i];
			if(map.containsKey(complement)){
				result[0] = map.get(complement);
				result[1]=i;
			}
			map.put(nums[i], i);
		}
		return result;
	}
	
}
