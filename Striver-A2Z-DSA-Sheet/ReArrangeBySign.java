class ReArrangeBySign {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] posArr = new int[n/2];
        int[] negArr = new int[n/2];
        int[] resArr = new int[n];
        int a=0,b=0;
        for(int k=0;k<n;k++){
            if(nums[k]>0){
                posArr[a]=nums[k];
                a++;
            }else{
                //System.out.println(nums[k]);
                negArr[b]=nums[k];
                b++;
            }
        }
        a=0;b=0;
        for(int k=0;k<n;k++){
            if(k%2==0){
                resArr[k]=posArr[a];
                a++;
            }else{
                resArr[k]=negArr[b];
                b++;
            }
        }
        return resArr;
    }
}
