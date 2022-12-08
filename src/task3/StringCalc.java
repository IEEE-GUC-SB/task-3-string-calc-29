package task3;

public class StringCalc {

	public int Add(String string) {
		String[] delimters = string.split("\n");
		String[] nums = string.split("[\n|,]");
		if(string.charAt(0)=='/') {
			String[] del = delimters[0].split("/");
			nums = delimters[1].split(del[del.length-1]);
		}
		
		int sum = 0;
		for(int i=0;i<nums.length;i++) {
			sum+= Integer.parseInt(nums[i]);
		}
		return sum;
	}

}
