package Programmers;

import java.util.*;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 N 입력 : ");
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		int count = 1;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				if(i%2==1) {
					arr[i][n-1-j] = count ++; 
				}else {
					arr[i][j] = count ++;
				}
			}
		}
		for(int i = 0; i<n; i++) {
			for(int j = 0;j<n; j++) {
				System.out.print(arr[i][j] + "\t");
			}
		System.out.println();
		}
		
	}

}
