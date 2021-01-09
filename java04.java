import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class time implements Comparable<time>{
    int start;
    int end;
    public time(int a, int b){
        this.start = a;
        this.end = b;
    }

    @Override
    public int compareTo(time o) {
        return this.start - o.start;
    }
}
public class java04 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        List<time> ls = new ArrayList<>();

        for(int i =0; i<T; i++){
            String[] ar = br.readLine().split(" ");

            ls.add(new time(Integer.parseInt(ar[0]), Integer.parseInt(ar[1])));
        }
        boolean result = solution(ls);
        System.out.println(result);
    }

    public static boolean solution(List<time> l){

        Collections.sort(l);
        for(int i =1; i< l.size(); i++){
            if(l.get(i).start < l.get(i-1).end){
                return false;
            }
        }

        return true;
    }
}
