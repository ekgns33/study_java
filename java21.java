import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test1010 {
    static int[][] c = new int[31][31];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int i =0; i<T; i++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            sb.append((combination(M, N)));
            sb.append("\n");
        }

        System.out.println(sb.toString());


    }
    static int combination(int n, int r){
        if(n==r || r==0){
            c[n][r] = 1;
            return 1;
        }else if(n<0 || r>n){
            return 0;
        }
        if(c[n][r]>0){
            return c[n][r];
        }else{
            c[n][r] = combination(n-1, r-1) + combination(n-1, r);
            return c[n][r];
        }
    }
}
