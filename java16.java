import java.util.Scanner;

public class test14916 {
    static int[] dp = new int[100000];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        if(N%5 == 0){
            System.out.println(N/5);
        }else {
            int result = dp(N);
            if(result == 1000001){
                System.out.println(-1);
            }else{
                System.out.println(result);
            }
        }
    }
    static int dp(int n){
        if(n == 0 ){
            return 0;
        }
        if(n<0){
            return 1000000;
        }
        if(dp[n] > 0){
            return dp[n];
        }else{
            dp[n] = Math.min(dp(n-2), dp(n-5))+1;
        }
        return dp[n];
    }
}
