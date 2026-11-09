class PascalTriangle1 {
    public int pascalTriangleI(int r, int c) {
        int a=r-1;
        int b=c-1;
        if(b>(a-b)){
            b=a-b;
        }
        long res=1;
        for(int i=0;i<b;i++){
            res=res*(a-i)/(i+1); // memorize this
        }
        return (int)res;
    }
}
