class SecondLargest {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=Arrays.stream(arr).max().orElse(0);
            int[] diffArr=new int[arr.length];
            for(int i=0;i<arr.length;i++){
                diffArr[i]=(max-arr[i]);
            }
            int secMax=Integer.MAX_VALUE;
            int secIndex=-1;
            for(int i=0;i<arr.length;i++){
                if(diffArr[i]!=0 && diffArr[i]<secMax){
                    secMax=diffArr[i];
                    secIndex=i;
                }
            }
            return secIndex!=-1?arr[secIndex]:secIndex;
    }
}
