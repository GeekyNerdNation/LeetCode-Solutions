package TwoSum;

import java.util.HashMap;

public class TwoSum_HashMap {

	public static void main(String[] args) {

		TwoSum_HashMap objTwoSum = new TwoSum_HashMap();

		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		int[] result = objTwoSum.twoSum(nums, target);

		if (result != null && result.length == 2) {
			System.out.println("Indices of the two numbers which add up to target:");
			System.out.println(String.valueOf(result[0]) + " " + String.valueOf(result[1]));
		} else {
			System.out.print("Something went wrong!");
		}
	}
	
	public int[] twoSum(int[] nums, int target) {

		HashMap<Integer, Integer> numsHashMap = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int anotherElement = target - nums[i];
			if (numsHashMap.containsKey(anotherElement)) {
				return new int[] { numsHashMap.get(anotherElement), i };
			}
			numsHashMap.put(nums[i], i);
		}
		return null;
	}
}
