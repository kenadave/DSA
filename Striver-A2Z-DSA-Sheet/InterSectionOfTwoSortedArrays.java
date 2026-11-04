class InterSectionOfTwoSortedArrays {
    public int[] intersectionArray(int[] nums1, int[] nums2) {

        
        if(nums1==null || nums1.length==0){
            return nums1;
        }
        if(nums2==null || nums2.length==0){
            return nums2;
        }
        int i=0,j=0;
        List<Integer> lst = new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                lst.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        int[] res=new int[lst.size()];
        for(int a=0;a<res.length;a++){
            res[a]=lst.get(a);
        }
        return res;
    }
}
