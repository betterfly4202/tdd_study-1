package racing;

import java.util.Scanner;

import static spark.Spark.get;

public class TestCode {
	public static void main(String[] args) {
		get("/hello", (req,res) -> {
			return "<html><body><form action='/start' method='get' name='start'><input type='button' onclick=document.start.submit; value='시작'></form></body></html>";
		});

		Scanner sc = new Scanner(System.in);

		System.out.println("자동차 이름 입력");
		String [] users = Utils.userNameSplit(sc.nextLine(),",");

		System.out.println("라운드 수 입력");
		int roundCnt = sc.nextInt();
		try{
			RacingGame racingGame = new RacingGame();
			racingGame.gameStart(users, roundCnt);
		}catch (Exception e){
			System.out.println(e.getMessage());

		}


	}


}
