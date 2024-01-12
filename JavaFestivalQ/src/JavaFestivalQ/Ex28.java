package JavaFestivalQ;

import java.util.Arrays;

public class Ex28 {

	public static void main(String[] args) {
		String str = "01001111";
		System.out.print(str +"(2) = ");
		System.out.println(to10(str) + "(10)");
	}
	
	public static int to10(String str) {
		
		// 문자열과 문자열에 해당하는 각 문자열을 담을 배열 선언
		String[] strarr = new String[str.length()];
		int[] intarr = new int[str.length()];
		
		// 문자열을 한 글자씩 배열에 저장
		strarr = str.split("");
		
		int result = 0;
		for(int i = 0; i<str.length(); i++) {
			// strarr의 값을 하나씩 intarr 배열에 저장하고
			intarr[i] = Integer.parseInt(strarr[i]);
			// Math.pow --> 제곱을 구하는 함수
			// 를 이용하여 각 배열의 값에 2의 제곱인 값을 곱하고 result에 더함
			result += intarr[i] * (Math.pow(2,intarr.length-i-1));		
		}
		return result;
	}
}
