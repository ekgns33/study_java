import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1149 {


    static int[][] rgbHouse = new int[1001][4];
    static int[][] dp = new int [1001][4];
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        for(int i =0; i<N; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < input.length; j++) {
                rgbHouse[i + 1][j + 1] = Integer.parseInt(input[j]);
            }
        }
        dp[1][1] = rgbHouse[1][1];
        dp[1][2] = rgbHouse[1][2];
        dp[1][3] = rgbHouse[1][3];
        System.out.println(Math.min(sol(N,1),Math.min(sol(N, 2), sol(N, 3))));
    }
    public static int sol(int n, int rgb){
        if(dp[n][rgb]==0){
            if(rgb == 1){
                dp[n][rgb] = Math.min(sol(n-1, 2), sol(n-1, 3))+rgbHouse[n][1];
            }else if(rgb == 2){
                dp[n][rgb] = Math.min(sol(n-1, 1), sol(n-1, 3))+rgbHouse[n][2];
            }else{
                dp[n][rgb] = Math.min(sol(n-1, 2), sol(n-1, 1))+rgbHouse[n][3];
            }
        }
        return dp[n][rgb];
    }
}
