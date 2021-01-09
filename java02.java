import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java02 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int objectNum = Integer.parseInt(br.readLine());
        int answer;
        if(objectNum>0){
            answer = 2*objectNum-1;
            System.out.println(answer);
        }else if(objectNum<0){
            answer = 2*(Math.abs(objectNum));
            System.out.println(answer);
        }else{
            System.err.println("잘못된 값을 입력하였습니다.");
        }

    }
}
