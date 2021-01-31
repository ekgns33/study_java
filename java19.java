import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test10942 {
    static boolean[][] memo = new boolean[2001][2001];
    static int[] input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb;
        int N = Integer.parseInt(br.readLine());
        input = new int[N+1];
        st = new StringTokenizer(br.readLine());

        for(int i =1; i<=N; i++){
            input[i] = Integer.parseInt(st.nextToken());
        }
        
        palindrome(N);
        sb= new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        for(int i =0; i<T; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            if(memo[start][end]){
               sb.append(1);
            }else{
             sb.append(0);   
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
    static void palindrome(int n){
        for(int i = 1; i<=n; i++){
            memo[i][i] = true;
        }
        for(int i =1; i<n; i++){
            if(input[i] == input[i+1]){
                memo[i][i+1] = true;
            }
        }
        for(int i =3; i<=n;i++){
            for(int j =1; j<=n-i+1;j++){
                int k = j+i-1;
                if(input[j] == input[k]){
                    if(memo[j+1][k-1]){
                        memo[j][k] = true;
                    }
                }
            }
        }
    }

}
