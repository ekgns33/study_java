import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test15489 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        int[][] pascalTriangle = new int[30][30];
        pascalTriangle[1][1] = 1;
        pascalTriangle[2][1] = pascalTriangle[2][2] = 1;
        for(int i =3; i<R+W; i++){
            for(int j = 1;j<=i; j++){
                if(j ==1 || j == i){
                    pascalTriangle[i][j] = 1;
                }else{
                    pascalTriangle[i][j] = pascalTriangle[i-1][j-1] + pascalTriangle[i-1][j];
                }
            }
        }
        int result = 0;
        for(int i = R; i<R+W;i++){
            for(int j = C; j<=C+i-R; j++){
                result += pascalTriangle[i][j];
            }
        }
        System.out.println(result);
    }
}
