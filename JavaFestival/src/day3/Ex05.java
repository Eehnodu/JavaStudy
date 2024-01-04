package day3;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 7; i >= 0; i--) {
        	// Math.pow = 제곱을 구하는 함수 --> Math.pow(10,i) = 10의 i승
        	// 10의 i승 만큼 나누고 몫의 1의 자리를 더하기 위해 %(나머지) 연산
            int digit = (num / (int) Math.pow(10, i)) % 10; 
            sum += digit;
        }
        System.out.print("합은 " + sum + "입니다.");
	}
}
