class RotateArrayByK {
    public void rotate(int[] nums, int k) {
       if(nums==0 || nums.length==0){
           return;
       }
       int n=nums.length;
       k=k%n;
       reverse(nums,0,n-1);
       reverse(nums,0,k-1);
       reverse(nums,k,n-1);
    }
    private void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}

//For Rotation on the right:
reverse(nums,0,k-1);
reverse(nums,k,n-1);

// For Rotation on the Left:
reverse(nums,0,n-k-1);
reverse(nums,n-k,n-1);
