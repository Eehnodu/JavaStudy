package JavaFestivalQ;

import java.util.Arrays;
import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 알파벳 빈도수 구하기 ====");
		System.out.print("입력 >> ");
		String str = sc.next();
		System.out.print(alpa(str));
	
	}
	

	private static String alpa(String str) {
		char[] arr = new char[str.length()];
		
		for(int i = 0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
			
		}
		System.out.println("Input String Array: " + Arrays.toString(arr));
		System.out.println(Arrays.toString(arr));
		
		int[] cntarr = new int[26];

		for(int cnt = 0; cnt<arr.length; cnt++) {
			if(arr[cnt] >= 'a' && arr[cnt] <= 'z') {
				cntarr[arr[cnt] - 'a']++;
			}else if(arr[cnt] >= 'A' && arr[cnt] <= 'Z'){
				cntarr[arr[cnt]- 'A']++;
			}
		}
		for (int i = 0; i < 26; i++) {
			System.out.println((char) (i + 'a') + " : " + cntarr[i]);
	    }
		return "";
	}
}
