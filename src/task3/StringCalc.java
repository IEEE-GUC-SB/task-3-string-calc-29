package task3;

public class StringCalc {

	public int Add(String string) {
		String[] nums = new String[2];
		nums = string.split(",");
		return Integer.parseInt(nums[0])+Integer.parseInt(nums[1]);
	}

}
