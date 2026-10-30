class QuickSort {
    public int[] quickSort(int[] nums) {
        
        quickSort(nums,0,nums.length-1);
        return nums;
    }
    private int partition(int[] nums, int low,int high){
        int pivot=nums[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(nums[j]<pivot){
                i++;
                swap(nums,i,j);
            }
        }
        System.out.println(i);
        //System.out.println(nums[i]);
        swap(nums,i+1,high);
        return i+1;
    }
    private void quickSort(int[] nums,int low,int high){
        if(low>=high){
            return;
        }
        int partIndex=partition(nums,low,high);
        quickSort(nums,low,partIndex-1);
        quickSort(nums,partIndex+1,high);
    }

    private void swap(int[] nums,int a, int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
