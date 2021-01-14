import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class test18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[][] board = new int[N][M];
        int placedBlocks = 0;
        int min = 0;
        int max = 0;

        for(int i = 0; i<board.length; i++){
            st = new StringTokenizer(br.readLine());
            for(int j =0; j<board[i].length; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
                placedBlocks += board[i][j];
                if(min>board[i][j]){
                    min = board[i][j];
                }else if(max<board[i][j]){
                    max = board[i][j];
                }
            }
        }
        int min_time = 2147483600;
        int floor = 0;

        for(int i = max; i>=min; i--){
            int neededBlock = 0;
            int time = 0;
            if(i*M*N<=placedBlocks+B){
                for(int j = 0; j<N;j++){
                    for(int k =0; k<M; k++){
                        int product = board[j][k]-i;
                        if(product>0){
                            time += product*2;
                        }else if(product<0){
                            time -= product;
                        }
                    }
                }
                if(time<min_time){
                    min_time = time;
                    floor = i;
                }
            }

        }

        System.out.println(min_time+ " "+ floor);



    }
}
