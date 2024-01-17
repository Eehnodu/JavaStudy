package Programmers;

import java.util.*;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총금액 입력 : ");
		int n = sc.nextInt();
		System.out.println("잔돈 : " + n + "원");
		
		System.out.println("10000원 : " + n/10000 + "개" );
		System.out.println("5000원 : " + n%10000/5000 + "개" );
		System.out.println("1000원 : " + n%5000/1000 + "개" );
		System.out.println("500원 : " + n%1000/500 + "개" );
		System.out.println("100원 : " + n%500/100 + "개" );
		
	}

}
