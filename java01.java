import java.util.Scanner;

public class java01 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int computer = (int)(Math.random()*100)+1;
        int cnt = 0;
        while(cnt++>=0){
            System.out.println("1과 100사이의 값을 입력하세요 : ");
            int a = scan.nextInt();
            if(a>computer){
                System.out.println("더 작은 수를 입력하세요");
            }else if(a<computer){
                System.out.println("더 큰 수를 입력하세");
            }
            if(computer == a) {
                System.out.println("맞혔습니다.");
                System.out.println("시도횟수는"+cnt+"번입니다.");
                break;
            }
        }
    }
}
