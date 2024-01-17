package Programmers;

import java.util.*;

public class Ex10 {

	public static void main(String[] args) {
		int sum =0;
		for(int i = 1; i<=100; i++) {
			int mi = (i%2 ==0? -1: 1);
			sum += mi * i;
			System.out.print(mi*i + " ");
		}
		System.out.print("\n결과 :" + sum);
	}

}
