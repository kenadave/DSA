class one_to_n_Without_Loops {
    public void printTillN(int n) {
        // code here
        printNums(1,n);
    }
    private void printNums(int i,int n){
        if(i>n){
            return;
        }
        System.out.print(i+" ");
        i++;
        printNums(i,n);
    }
}
