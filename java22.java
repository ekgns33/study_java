import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class test1697 {

   static int[] dp = new int[100001];
    static int N;
    static int K;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
       if(N==K){
           System.out.println(0);
       }else{
           bfs(N);
       }
    }
    static void bfs(int n){
        Queue<Integer> Q = new LinkedList<>();
        dp[n] = 1;
        Q.add(n);

        while(!Q.isEmpty()){
            int temp = Q.poll();
            for(int i =0; i<3; i++){
                int next;
                if(i ==0){
                    next = temp+1;
                }else if(i ==1){
                    next= temp-1;
                }else{
                    next = temp*2;
                }
                if(next == K){
                    System.out.println(dp[temp]);
                    return;
                }
                if(next>=0 && next<dp.length && dp[next] ==0){
                    Q.add(next);
                    dp[next] = dp[temp] + 1;
                }
            }
        }
    }
}
