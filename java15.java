import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class test1005 {
   static ArrayList<Integer>[] vertex;
   static ArrayList<Integer> bfs;
   static Queue<Integer> Q;
   static int[] time;
   static int[] rank;
   static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;


        int T = Integer.parseInt(br.readLine());
        for(int i =0; i<T; i++){
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            vertex = new ArrayList[N+1];
            time = new int[N+1];
            rank = new int[N+1];

            for(int j=0; j<N+1;j++){
                vertex[j] = new ArrayList<>();
            }

            int K = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            for(int j=1; j< N+1; j++){
                time[j] = Integer.parseInt(st.nextToken());
            }
            for(int j =0; j<K; j++){
                st = new StringTokenizer(br.readLine());
                int s = Integer.parseInt(st.nextToken());
                int e = Integer.parseInt(st.nextToken());
                vertex[s].add(e);
                rank[e]++;
            }
            for(int j =1; j<=N; j++){
                Collections.sort(vertex[j]);
            }

            int target = Integer.parseInt(br.readLine());
            System.out.println(bfsSol(target));
        }

    }
    private static int bfsSol(int target){
        bfs = new ArrayList<Integer>();
        Q = new LinkedList<>();
        int[] temp = new int[N+1];

        for(int i =1; i<N+1; i++){
            temp[i] = time[i];
            if(rank[i] == 0){
                Q.offer(i);
            }
        }

        while(!Q.isEmpty()){
            int q = Q.poll();
            bfs.add(q);
            for(int i : vertex[q]){
                temp[i] = Math.max(temp[i], temp[q] + time[i]);
                rank[i]--;
                if(rank[i]==0){
                    Q.offer(i);
                }
            }
        }
        return temp[target];
    }


}
