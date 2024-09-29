package doordie;

public class ArrayList {
	public static boolean find132pattern(int[] nums) {
        int i=0;
        int j=i+1;
        int k=j+1;
        boolean ans=false;
        for(i=0,j=i+1,k=j+1;k<nums.length;i++,j++,k++){
            if ((nums[i] < nums[k]) &&( nums[k] < nums[j])){
                ans=true;
            }

        }
        return ans;

}
	public static void main(String[] args) {
		int nums[]= {1,3,2,4};
		System.out.println(find132pattern(nums));
		
		}
	}

