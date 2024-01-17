package Programmers;

import java.util.*;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단수입력 : ");
		int dan = sc.nextInt();
		System.out.print("어느 수까지 출력 : ");
		int soo = sc.nextInt();
	
		System.out.println(dan + "단");
		for(int i = 1; i<=soo; i++) {
			System.out.println(dan + "*" + i + "=" + dan*i);
		}
		
	}


}
