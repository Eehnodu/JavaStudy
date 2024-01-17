package Programmers;

import java.util.*;

public class Ex07 {

	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 15;
		char op = '*';
		System.out.println(cal(num1,num2,op));
	}

	private static int cal(int num1, int num2, char op) {
		int result = 0;
		switch(op){
			case '+':
				return result = num1 + num2;
			case '-':
				return result =  num1>num2? num1-num2: num2-num1;
			case '*':
				return result =  num1*num2;
			case '/':
				return result =   num1/num2;
		}		
		return result;
	}

}
