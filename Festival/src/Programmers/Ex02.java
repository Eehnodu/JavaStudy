package Programmers;

import java.util.*;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 N 입력 : ");
		int num = sc.nextInt();
		
		int[][] arr = new int[num][num];
		int count = 1;
		
		for(int i = 0; i<num; i++) {
			for(int j = 0; j<num; j++) {
				arr[j][i] = count;
				count++;
			}
		}
		for(int i = 0; i<num; i++) {
			for(int j = 0; j<num; j++) {
				System.out.print(arr[i][j] + " ");
			}
		System.out.println();
		}
	}

}
