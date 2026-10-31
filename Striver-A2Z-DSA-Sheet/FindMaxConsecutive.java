class FindMaxConsecutive {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes=0;
        int retMaxOnes=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                maxOnes++;
            }else{
                retMaxOnes=Math.max(retMaxOnes,maxOnes);
                maxOnes=0;
            }
        }
        retMaxOnes=Math.max(retMaxOnes,maxOnes);
        return retMaxOnes;
    }
}
