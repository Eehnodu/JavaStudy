package JavaFestivalQ;

import java.util.Arrays;
import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 알파벳 빈도수 구하기 ====");
		System.out.print("입력 >> ");
		String str = sc.nextLine();
		alpa(str);
	
	}
	
	// 반환값이 void 이므로 결과(return)을 출력하지 않음
	private static void alpa(String str) {
		
		// 입력받은 문자열의 공백 제거 후 문자 배열에 저장
		str = str.replace(" ", "");
		char[] arr = str.toCharArray();
		
		// 알파벳의 문자를 카운트 할 수 있는 배열 생성
		int[] cntarr = new int[26];

		for(int cnt = 0; cnt<arr.length; cnt++) {
			// a보다 크고 z보다 작을 경우 해당되는 배열의 값을 1증가 시킴
			if(arr[cnt] >= 'a' && arr[cnt] <= 'z') {
				cntarr[arr[cnt] - 'a']++;
			}
			// A보다 크고 Z보다 작을 경우 해당되는 배열의 값을 1증가 시킴
			else if(arr[cnt] >= 'A' && arr[cnt] <= 'Z'){
				cntarr[arr[cnt]- 'A']++;
			}
		}
		
		// 배열의 값을 순회하며 출력
		for (int i = 0; i < 26; i++) {
			System.out.println((char) (i + 'a') + " : " + cntarr[i]);
	    }
	}
}
