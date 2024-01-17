package Programmers;

import java.util.*;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		num = num%10>=5? num/10*10 +10: num/10*10;
		System.out.print("반올림 수 : "+num);
		
	}

}
