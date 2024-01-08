package Programmers;

import java.util.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    	int a=6, b=4, c=2, d=5;
    	int[] num = {a,b,c,d};
    	int answer = 0;
    	int min = num[0];
    	for(int i = 0; i< num.length; i++) {
    		min = min > num[i]? num[i]: min;
    	}
    	if(a == b) {
    		if(b == c) {
    			answer = c==d? a * 1111: (10 * a + d) * (10 * a + d);
    			
    		}else {
    			if(c==d && a==d) {
    				answer = (10 * a + b) * (10 * a + b);
    			}else if (c==d && a!=d){
    				answer = (a+c) * Math.abs(a-c);
    			}else if(a==c && c!=d){
    				answer = b*d;
    			}else {
    				answer = c*d;
    			}
    		}
    	}else {
    		if(b==c) {
    			if(c==d && a!=d){
    				answer = (10 * b + a) * (10 * b + a);
    			}else if(c!=d && a==d){
    				answer = (a+b) * Math.abs(a-b);
    			}else {
    				answer = a*d;
    			}
    		}else {
    			if(c==d && a==d) {
    				answer = (10 * a + b) * (10 * a + b);
    			}else if(c==d && a!=d){
    				answer = (a+b) * Math.abs(a-b);
    			}else if(a==c && c!=d && a!=d){
    				answer = (b*d);
    			}else {
    				answer = min;
    			}
    		}
    	}
    	
    	System.out.println(answer);
    }
}
