package Programmers;

import java.util.Arrays;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i = 0; i<5; i++) {
			System.out.print((i+1) +"번째 수 입력 : ");
			int num = sc.nextInt();
			arr[i] = num;
		}
		
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<4; j++) {
				if(arr[j]> arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		System.out.println("정렬 후");
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
