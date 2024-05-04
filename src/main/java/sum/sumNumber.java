package sum;

import java.util.Scanner;

public class sumNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int input = 0 ;
        int sum = 0 ;
        int a = 0;
        while(true){
            System.out.print("정수를 입력하세요. (종료:0)>> ");
            input = scan.nextInt();
            if (input == 0){ break; }
            sum += input;
            a++;
        }
        System.out.printf("합계는 %d입니다. 평균은 %d입니다\n", sum, sum / a);
    }
}
