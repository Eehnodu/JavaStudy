package Programmers;

import java.util.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    	String str = "rermgorpsam";
    	int[][] queries = {{2,3}, {0,7}, {5,9}, {6,10}};
    	
        char[] result = str.toCharArray();
    	
    	for(int i = 0; i<queries.length; i++) {
    		int s = queries[i][0];
			int e = queries[i][1];
    		for(int j = s; j<=(s+e)/2; j++) {
    			char tmp = result[j];
    			result[j] = result[s+e-j];
    			result[s+e-j] = tmp;
    		}
    		System.out.print(Arrays.toString(result));
    		System.out.println();
    	}
    	System.out.print(Arrays.toString(result));;
    }
}
