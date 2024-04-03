package Chap03;

//読み込んだ点数の成績を表示

import java.util.Scanner;

public class Chap03_8 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("成績を表示します。\n何点ですか:");  //点数の入力
		int score = stdIn.nextInt();     //点数の読み込み
		
		if ( score >= 0 && score <= 59 )                       //不可
			System.out.println("不可");
		else if ( score >= 60 && score <= 69 )                  //可
			System.out.println("可");
		else if ( score >= 70 && score <= 79 )                 //良
			System.out.println("良");
		else if ( score >= 80 && score <= 100 )                 //優
			System.out.println("優");

	}

}
