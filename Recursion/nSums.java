import java.util.Scanner;

class nSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        int ans=sumN(n);
        System.out.println(ans);
    }
    private static int sumN(int n){
        if(n==0){
            return 0;
        }else{
            return sumN(n-1)+n;
        }
    }
}

// can be also done by the formula n*(n+1)/2
