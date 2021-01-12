import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class test14697 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int[] num = new int[3];
        num[0] = Integer.parseInt(input[0]);
        num[1] = Integer.parseInt(input[1]);
        num[2] = Integer.parseInt(input[2]);
        int N = Integer.parseInt(input[3]);
        boolean result = false;
        for(int i = 0; i<3; i++){
            int mod = N%num[i];
            for(int j =0; j<3; j++){
                if(mod == 0 || mod == num[j]) {
                    result = true;
                    break;
                }
            }
        }
        if(result == true){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
