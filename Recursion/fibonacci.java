import java.util.*;
public class fibonacci {
    static int fibonacci(int n){
        if(n==0 || n==1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("plz enter the no.  of terms you want to print");
        int n = sc.nextInt();
        int ans = fibonacci(n);
        System.out.println(ans);
    }
}
