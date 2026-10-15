class Solution {
    public int[] selectionSort(int[] nums) {
        if(nums==null || nums.length==0){
            return nums;
        }
        int n=nums.length;
        for(int i=0;i<n-1;i++){
        int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(nums[minIndex]>nums[j]){
                    minIndex=j;  
                }
            }
            System.out.println(minIndex);
            int temp=nums[i];
            nums[i]=nums[minIndex];
            nums[minIndex]=temp;
        }
        
        return nums;
    }
}
