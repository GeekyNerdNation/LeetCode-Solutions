public class TwoSum_BruteForce {

	public static void main(String[] args) {

		TwoSum_BruteForce objTwoSum = new TwoSum_BruteForce();

		int[] nums = { 2 };
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

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return null;
	}
}
