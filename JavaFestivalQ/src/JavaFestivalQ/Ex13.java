package JavaFestivalQ;

import java.util.Arrays;

public class Ex13 {

	public static void main(String[] args) {
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		String[] arr = score.split(",");
		int acount =0, bcount = 0, ccount = 0, dcount = 0, fcount = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i].equals("A")) {
				acount++;
			}else if(arr[i].equals("B")) {
				bcount++;
			}else if(arr[i].equals("C")) {
				ccount++;
			}else if(arr[i].equals("D")) {
				dcount++;
			}else {
				fcount++;
			}
		}
		System.out.println("A : " + acount + "명");
		System.out.println("B : " + bcount + "명");
		System.out.println("C : " + ccount + "명");
		System.out.println("D : " + dcount + "명");
		System.out.println("F : " + fcount + "명");
	}
}
