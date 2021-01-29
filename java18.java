import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class test1082 {
    static int[] cost;
    static String[] result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        cost = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i =0; i<N; i++){
            cost[i] = Integer.parseInt(st.nextToken());
        }
        int money = Integer.parseInt(br.readLine());
        result = new String[money];
        for(int i =0; i<money; i++){
            result[i] ="0";
        }
        dp(N, money);
        System.out.println(result[money]);

    }

    public static void dp(int N, int money){
        long[] temp = new long[51];
        for(int i =1; i<=money; i++){
            int t = i;
            for(int j =1; j<N; j++) {
                if (t >= cost[j]) {
                    result[i] = Long.toString(Math.max(Long.parseLong(result[i]), Long.parseLong(j + result[i])));
                    t -= cost[j];
                }
            }
        }
    }

}
