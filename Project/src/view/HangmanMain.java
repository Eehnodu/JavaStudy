package view;

import java.util.Scanner;

public class HangmanMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=======행맨 게임을 시작합니다!!=======");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠒⠒⠒⠒⠒⠒⠒⠒⠒⠒⠚⠒⠓⠚⠲⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡄⠖⠧⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠁⠀⠀⢈⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⡀⠀⢀⡴⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣻⠉⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣪⣀⡠⡤⠤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀ ");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡪⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠠⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⢨⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⢇⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⢐⠅⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠔⠉⠀⠀⠙⢢⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀   ⠰⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀⠓⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀ ");
		System.out.println("⠀⠀⠀      ⠀⢘⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀ ⠀");
		System.out.println("⠀⠀⠐⠒⠒⠒⠒⠒⠒⠒⠚⠒⠒⠖⠖⠔⠤⠢⠔⠔⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀ ⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀ ");
		System.out.println("⠀⠀ ⡀⠀ ⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀    ");
		System.out.println("⠀⠀⠀⢸⡀⣀⠇⠀⠀⠀⢀⠶⡀⠀⠀⢀⡀⠀⡆⠀⠀⠀⠀⠀⠀⠀⠀ ⢠⣆⣰⡄⠀⠀ ⢀⣤⡀⠀⠀⠀ ⢠⣄⠀⢸⠀⠀");
		System.out.println("⠀⠀⠀⣸⠍⠈⡇⠀⠀⢠⠏⠉⢧⠀⠀⢸⠱⣄⡇⠀⠀⠀⠀⠀⠀ ⠀⠀⡕⠈⠁⡇⠀⠀ ⡼⠒⡆⠀ ⠀ ⢸⠈⠣⡼⠀⠀");
		System.out.println("⠀⠀⠀⣀⣀⣀⣀⣀⠀⣀⣀⣀⣀⠀ ⢈⣀⣀⣈⣁⠀⣀⣀⣀⣀⠀ ⣀⣀⣀⣀⠀ ⣘⣀⣀⣀⡀⠀⢀⣀⣀⣀⣀⠀");

		while (true) {
			System.out.print("[1]로그인 [2]회원가입 [3]회원탈퇴 [4]랭킹조회 [5]종료 >> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				// 로그인 처리
				System.out.println("로그인을 수행합니다.");

				// 로그인 성공시
				// 예시) - System.out.println("[nickname" + "(" + "vip" + ") : " + "점수]");

				// 난이도 선택 창
				while (true) {
					System.out.println("난이도를 선택해주세요!!");
					System.out.print("[1]하 [2]중 [3]상 >> ");
					int nan = sc.nextInt();

					if (nan == 1) {
						// 하 게임 실행
						break; // 올바른 입력이면 루프를 빠져나감
					} else if (nan == 2) {
						// 중 게임 실행
						break; // 올바른 입력이면 루프를 빠져나감
					} else if (nan == 3) {
						// 상 게임 실행
						break; // 올바른 입력이면 루프를 빠져나감
					} else {
						System.out.println("숫자를 잘못 입력하였습니다. 다시 선택해주세요.");
					}
				}
				// 행맨 게임 실행

			} else if (choice == 2) {
				// 회원가입 처리
				System.out.println("회원가입을 수행합니다.");

			} else if (choice == 3) {
				// 회원탈퇴 처리
				System.out.println("회원탈퇴를 수행합니다.");

			} else if (choice == 4) {
				// 랭킹조회 처리
				System.out.println("랭킹조회를 수행합니다.");

			} else if (choice == 5) {
				// 종료 처리
				System.out.println("게임이 종료되었습니다.");
				break;
			} else {
				// 숫자를 잘못 입력 했을 시
				System.out.println("숫자를 잘못 입력하였습니다. 다시 선택해주세요.");
			}
		}
		sc.close();
	}
}
