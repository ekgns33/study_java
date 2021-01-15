import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input;
        while(true){
            String str = br.readLine();
            input = str.split("");
            boolean isTrue = true;
            if(str.length() == 1 && str.equals("0")){
                break;
            }else{
                for(int i =0; i< input.length; i++){
                    if(!input[i].equals(input[input.length-i-1])){
                       isTrue = false;
                    }
                }
                if(isTrue == true){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }


        }

    }
}
