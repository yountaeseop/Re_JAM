package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("== 프로그램 시작");
		Scanner sc = new Scanner(System.in);
		int lastArticleId = 0;
		
		List<Article> articles = new ArrayList<>();
		
		while (true) {
			System.out.print("명령어) ");
			String input = sc.nextLine().trim();

			if (input.equals("article list")) {
				System.out.println("번호  /  제목");
				for(int i = 0; i < articles.size(); i++) {
					System.out.println(articles.get(i));
				}
				
			} else if (input.equals("article write")) {
				
				int id = lastArticleId + 1;
				lastArticleId = id;
				
				System.out.print("제목 : ");
				String title = sc.nextLine();
				System.out.print("내용 : ");
				String body = sc.nextLine();
				
				articles.add(new Article(id, title, body));
				
				id++;
				System.out.printf("%d번 글이 생성되었습니다.\n", id);
			} else if (input.equals("exit")) {
				System.out.println("== 프로그램 종료 ==");
				break;
			} else {
				System.out.println("존재하지 않는 명령어 입니다.");
			}
		}
	}

}

class Article {
	int id;
	String title;
	String body;
	
	public Article(int id, String title, String body) {
		super();
		this.id = id;
		this.title = title;
		this.body = body;
	}
	
	@Override
	public String toString() {
		return title +"  /  "+ body ;
	}
}
