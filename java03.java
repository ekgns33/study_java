import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class java03 {
    public static void main(String[] args){
        //여러 숫자를 받아서 그중 조건을 만족시키는 쌍을 구하기 > 브루트포스 or 해쉬맵

        int[] T = {2,7,11,15};
        int target = 9;

        // 값이 존재하는 배열을 넣어서 그냥 출력하려고 이렇게함.
        for(int a : solution(T, target)){
            System.out.println(a);
        }


    }
    public static int[] solution (int[] input, int target){
        Map<Integer, Integer> hm = new HashMap<>();
        int[] answer = new int[2];
        for(int i =0; i<input.length; i++){
            hm.put(input[i], i);
        }
        for(int i =0; i<input.length; i++){
            int temp = target - input[i];
            if(hm.containsKey(temp) && hm.get(temp).intValue()!=i){
                answer[0] = input[i];
                answer[1] = temp;
                return answer;
            }
        }
        throw new NoSuchElementException("해당하는 쌍 없음");
    }
}
