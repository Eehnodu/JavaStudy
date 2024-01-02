package switch문;
import java.util.Scanner;

public class Ex02자판기프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요 : ");
		int money = sc.nextInt();
		
		System.out.println("메뉴를 고르세요.");
		System.out.print("1.아우터(700원) 2.이구동성(1000원) 3.에그몽(500원) >> ");
		int menu = sc.nextInt();
		int change = money;
		
		switch(menu){
		case 1:
			if(money < 700) {
				System.out.println("돈이 부족합니다.");
				System.out.println("잔돈 : " + money);
			}else {
				change = money - 700;
				System.out.println("잔돈 : " + change);
				System.out.println("천원 : " + change/1000 + " 오백원 : " + (change%1000)/500 + " 백원 : " + change%500/100);
			}break;
		case 2:
			if(money < 1000) {
				System.out.println("돈이 부족합니다.");
				System.out.println("잔돈 : " + money);
			}else {
				change = money - 1000;
				System.out.println("잔돈 : " + change);
				System.out.println("천원 : " + change/1000 + " 오백원 : " + (change%1000)/500 + " 백원 : " + change%500/100);
			}break;
		case 3:
			if(money < 500) {
				System.out.println("돈이 부족합니다.");
				System.out.println("잔돈 : " + money);
			}else {
				change = money - 500;
				System.out.println("잔돈 : " + change);
				System.out.println("천원 : " + change/1000 + " 오백원 : " + (change%1000)/500 + " 백원 : " + change%500/100);
			}break;
		default :
			System.out.println("메뉴를 다시 골라주세요.");
			break;
		}
		
		
	}
}
