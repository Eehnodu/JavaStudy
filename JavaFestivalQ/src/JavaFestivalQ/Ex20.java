package JavaFestivalQ;

import java.util.Arrays;
import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 >> ");
		int num = sc.nextInt();
		String result = "";
		
		// 10진수는 2로 나누며 나머지를 저장하면 됨
		while(num>0) {
			// String.valueOf --> 숫자를 문자열로 변경해줌
			result += (num%2);
			num = num/2;
		}
		
		String reverse = "";
		for(int i = result.length()-1; i>=0; i--) {
			reverse += result.charAt(i) + " ";
		}
		
		System.out.println(reverse);
	}

}
