package Programmers;

import java.util.*;

public class Ex04 {

	public static void main(String[] args) {
		for(int i = 5; i>=1; i--) {
			for(int j = 0; j<5; j++) {
				System.out.print(j>i-2? "*": " ");
			}
			System.out.println();
		}
	}

}
