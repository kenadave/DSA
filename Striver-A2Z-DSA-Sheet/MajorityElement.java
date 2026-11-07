class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        int res=0;
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.containsKey(nums[i])?mp.get(nums[i])+1:0);
            if(mp.get(nums[i])>=nums.length/2){
                res = (int)nums[i];
                break;
            }
        }
        return res;
    }
}
