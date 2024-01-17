package Programmers;

import java.util.*;
import java.util.Arrays;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("행 개수 : ");
    	int num = sc.nextInt();
    	for(int i = num; i>0; i--) {
    		for(int j=0; j<i; j++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
  
    }
}
