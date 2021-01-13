import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class test1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        List<Integer> A = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){
            A.add(Integer.parseInt(st.nextToken()));
        }
        //before starting binarySearch, sort targeted list or array
        Collections.sort(A);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i =0; i<M; i++){
            int result = 0;
            int temp = Integer.parseInt(st.nextToken());
            if(binarySearch(A, temp, 0, A.size()-1)){
                System.out.println(++result);
            }else{
                System.out.println(result);
            }
        }
    }
    public static boolean binarySearch(List<Integer> l, int target, int low, int high){
        if(low>high){
            return false;
        }else{
            int mid = (low+high)/2;
            if(target == l.get(mid)){
                return true;
            }else if (target<l.get(mid)){
                return binarySearch(l, target, low, mid-1);
            }else{
                return binarySearch(l, target, mid+1, high);
            }
        }
    }
}
