package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
    	int n= 10;
    	List<Integer> list = new ArrayList<>();
        
        while (n > 1) {
            list.add(n);
            n = (n % 2 == 0) ? n / 2 : 3 * n + 1;
        }
        list.add(1);
        
        int[] arr = list.stream().mapToInt(i -> i).toArray();
            
        System.out.println(Arrays.toString(arr)); 
    }
}
