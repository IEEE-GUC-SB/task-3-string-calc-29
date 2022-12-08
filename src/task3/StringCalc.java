package task3;

public class StringCalc {

	public int Add(String string) {
		String[] nums = string.split(",");
		
		int sum = 0;
		for(int i=0;i<nums.length;i++) {
			sum+= Integer.parseInt(nums[i]);
		}
		return sum;
	}

}
