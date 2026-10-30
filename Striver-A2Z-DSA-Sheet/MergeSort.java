class MergeSort {
    public int[] mergeSort(int[] nums) {
        if(nums==null || nums.length==0){
            return nums;
        }
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    private void mergeSort(int[] nums, int low, int high){
        if(low < high){
            int mid = low + (high-low)/2;
            mergeSort(nums,low,mid);
            mergeSort(nums,mid+1,high);

            merge(nums,low,mid,high);
        }
    }
    private void merge(int[] nums,int low,int mid,int high){
        int[] leftArray=Arrays.copyOfRange(nums,low,mid+1);
        int[] rightArray=Arrays.copyOfRange(nums,mid+1,high+1);

        int i=0,j=0,k=low;
        while(i<leftArray.length && j<rightArray.length){
            if(leftArray[i]<=rightArray[j]){
                nums[k]=leftArray[i];
                i++;
            }else{
                nums[k]=rightArray[j];
                j++;
            }
            k++;
        }
        while(i<leftArray.length){
            nums[k]=leftArray[i];
            i++;
            k++;
        }
        while(j<rightArray.length){
            nums[k]=rightArray[j];
            j++;
            k++;
        }
        
    }
}
