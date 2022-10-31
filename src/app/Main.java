package app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("== 프로그램 시작");
		int id = 1;

		while (true) {
			System.out.print("명령어) ");
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();

			if (input.equals("article list")) {
				System.out.println("게시글이 없습니다.");
			} else if (input.equals("article write")) {
				System.out.print("제목 : ");
				String title = sc.nextLine();
				System.out.print("내용 : ");
				String body = sc.nextLine();

				System.out.printf("%d번 글이 생성되었습니다.\n", id);
				id++;
			} else if (input.equals("exit")) {
				System.out.println("== 프로그램 종료 ==");
				break;
			} else {
				System.out.println("존재하지 않는 명령어 입니다.");
			}
		}
	}

}
