import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class test2309 {


    public static void main(String[] args) throws IOException {
        List<Integer> l = new ArrayList<>(7);
        int[] h = new int[9];
        int[] result = new int[7];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum =0;
        for(int i =0; i<9; i++){
            h[i] = Integer.parseInt(br.readLine());
            sum += h[i];
        }
        label:
       for(int i =0; i<h.length; i++){
           for(int j =0; j<h.length; j++){
               if(i!=j && sum -h[i]-h[j] == 100){
                   for(int k =0; k<9; k++){
                       if( k != i && k != j){
                           l.add(h[k]);
                       }
                   }
                   break label;
               }
           }
       }
        Collections.sort(l);
        for (Integer integer : l) {
            System.out.println(integer);
        }

    }


}
