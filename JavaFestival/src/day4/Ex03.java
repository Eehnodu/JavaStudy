package day4;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		for(int i = 5; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <= 5-i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
