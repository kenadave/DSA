class ArrayLeaders {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> lst = new ArrayList<>();
            int firstElem=arr[arr.length-1];
            lst.add(firstElem);
            for(int i=arr.length-2;i>=0;i--){
                if(arr[i]>=firstElem){
                    firstElem=arr[i];
                    lst.add(firstElem);
                }
            }
        Collections.reverse(lst); 
            
        return lst;
    }
}
