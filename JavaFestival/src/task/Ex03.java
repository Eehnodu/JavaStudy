package task;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int rest = 0;
		if(num > 0) {
			rest = 10 - (num % 10);
			if(rest <=5) {
				num = num + rest;
			}else {
				num = num/10*10;
			}
			
		}
		System.out.println("반올림 수 : " + num);
	}

}
