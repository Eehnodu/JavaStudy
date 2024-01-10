package Programmers;

import java.util.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    	String str = "rermgorpasam";
    	int[][] queries = {{2,3}, {0,7}, {5,9}, {6,10}};
    	
    	String[] result = str.split("");
    	System.out.println(Arrays.toString(result));
    	
    	for(int i = 0; i<queries.length; i++) {
    		for(int j = 0; j<2; j++) {
    			int s = queries[i][j];
    			int e = queries[i][j];
    		}
    	}
    }
}
