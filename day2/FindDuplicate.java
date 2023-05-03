package week1.day2;

public class FindDuplicate {

	public static void main(String[] args) {
		
		int nums[] = {2,5,7,7,5,9,2,3};
		int numLen = nums.length;
		
		for (int i = 0; i < numLen; i++) {
			
			for (int j = i+1; j < numLen; j++) {
				
				if(nums[i]==nums[j]) {
					System.out.println("Duplicate value is " +nums[i]);
				}
			}
		}

	}

}


