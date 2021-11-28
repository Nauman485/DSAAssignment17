package geekster;

public class Find_two_sum {
    int arr[]=new int[2];
    public void twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                   arr[0]=i;
                    arr[1]=j;
                }
            }
    }
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String args[]) {
    	int nums[]= {2,7,11,15};
    	int target=9;
    	Find_two_sum ob=new Find_two_sum();
    	ob.twoSum(nums,target);
    }
    

}
