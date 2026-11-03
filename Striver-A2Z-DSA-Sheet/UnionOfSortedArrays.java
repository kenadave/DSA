class UnionOfSortedArrays{
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> lst = new ArrayList<>();
        
                int i=0,j=0;
                while(i<a.length && j<b.length){
                    if(a[i]<=b[j] && (lst.isEmpty() || a[i]!=lst.get(lst.size()-1))){
                        lst.add(a[i]);
                        i++;
                    }else if(a[i]>=b[j] && (lst.isEmpty() || b[j]!=lst.get(lst.size()-1))){
                        lst.add(b[j]);
                        j++;
                    }else if(a[i]<=b[j] && (a[i]==lst.get(lst.size()-1))){
                        i++;
                    }else if(a[i]>b[j] && (b[j]==lst.get(lst.size()-1))){
                        j++;
                    }
                }
                while(i<a.length){
                    if(lst.size()==0 || a[i]!=lst.get(lst.size()-1)){
                        lst.add(a[i]);
                        i++;
                    }else{
                        i++;
                    }
                    
                }
                while(j<b.length){
                    if(lst.size()==0 || b[j]!=lst.get(lst.size()-1)){
                        lst.add(b[j]);
                        j++;
                    }else{
                        j++;
                    }
                }
                return lst;
            
        
    }
}
