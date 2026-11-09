class PascalTriangleLeetCode {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> rows = new ArrayList<>();

        for(int i=1;i<=numRows;i++){
            int row=i;
            List<Integer> cols = new ArrayList<>();
            for(int j=1;j<=row;j++){
                int col=genPos(row,j);
                cols.add(col);
            }
            rows.add(cols);
        }
        return rows;
    }

    private int genPos(int row,int col){
        int n=row-1;
        int k=col-1;
        if(k>n-k){
            k=(n-k);
        }
        long res=1;
        for(int i=0;i<k;i++){
            res=res*(n-i)/(i+1);
        }
        return (int)res;
    }
}
