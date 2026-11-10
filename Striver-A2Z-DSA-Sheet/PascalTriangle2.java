class PascalTriangle2 {
    public int[] pascalTriangleII(int r) {
        int[] res = new int[r];
        for(int i=0;i<r;i++){
            res[i]=getVal(r-1,i);
        }
        return res;
    }

    private int getVal(int r,int c){
        int n=r;
        int k=c;
        if(k>(n-k)){
            k=(n-k);
        }
        long res=1;
        for(int i=0;i<k;i++){
            res=res*(n-i)/(i+1);
        }
        return (int)res;
    }
}
