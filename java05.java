import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class test2668 {

    static int[] connection;
    static List<Integer> selected;
    static boolean[] visited;
    static int cnt=0;

    public static boolean Dfs(int start, int present){
        visited[present] = true;
        int next = connection[present];
        if(start == next){
            cnt++;
            return true;
        }else if(!visited[next]){
            Dfs(start, next);
        }
        return false;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        connection = new int[N+1];
        visited = new boolean[N+1];
        selected = new ArrayList<>();

        // 1~N까지 맵에 입력
        for (int i =1; i<N+1; i++){
            int temp = Integer.parseInt(br.readLine());
            connection[i] = temp;
        }

        for(int i = 1; i< N+1; i++){
            if(!Dfs(i,i)){
                for(boolean a : visited){
                    a = false;
                }
            }
        }

        Collections.sort(selected);
        System.out.println(cnt);
        for(int i =0; i<selected.size(); i++){
            System.out.println(selected.get(i));
        }

    }
}
