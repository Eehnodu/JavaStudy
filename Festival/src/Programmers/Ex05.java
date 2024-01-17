package Programmers;

import java.util.*;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		int sum = 1;
		for(int i = 1; i<= num; i++) {
			sum *= i;
		}
		System.out.print("출력 : " + sum);
	}

}
