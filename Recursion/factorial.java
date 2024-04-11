import java.util.Scanner;

public class factorial {

    //Sub problem --> f(ne-1)
    //selfwork --> f(n) n*f(n-1)
    //if(n==0) return 1

    static int factorial(int n){
        if(n==0) return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int ans =factorial(n);
       System.out.println(ans);

    }
}
