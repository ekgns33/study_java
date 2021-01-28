import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test12865 {
    static int N;
    static int K;
    static int[][] input;
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        input= new int[N][2];
        dp = new int[N+1][100001];
        for(int i =0; i<N; i++){
            st= new StringTokenizer(br.readLine());
            input[i][0] = Integer.parseInt(st.nextToken());
            input[i][1] = Integer.parseInt(st.nextToken());
        }
        System.out.println(dp(0, K));
    }
    public static int dp(int pos, int k){
        int temp =0;
        if(dp[pos][k]!=0){
            return dp[pos][k];
        }
        if(pos == N){
            return 0;
        }else{
            if(k>=input[pos][0]){
                dp[pos+1][k-input[pos][0]] = dp(pos+1, k-input[pos][0]);
                temp = dp[pos+1][k-input[pos][0]] + input[pos][1];
            }else{
                return dp(pos+1, k);
            }
        }
        return Math.max(temp, dp(pos+1, k));
    }

}
