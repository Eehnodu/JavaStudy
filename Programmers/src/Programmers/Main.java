package Programmers;

import java.util.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    	String my_string = "banana";
    	String[] answer = new String[my_string.length()];
    	
    	for(int i = 0; i<my_string.length(); i++) {
    		answer[i] = my_string.substring(i);
    	}
    	
    	Arrays.sort(answer);
    	System.out.println(Arrays.toString(answer));
    }
}
