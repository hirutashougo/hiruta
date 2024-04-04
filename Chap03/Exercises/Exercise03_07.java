package Chap03.Exercises;

//読み込んだ整数値を3で割った結果を表示

import java.util.Scanner;

public class Exercise03_07 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値:"); int n = stdIn.nextInt();  //整数値の入力と読み込み
		
		if ( n > 0 )  //構文と制御式
			if ( n % 3 == 0 )  //構文と制御式
				System.out.println("その値は3で割り切れます。");  //文字の出力
			else  if ( n % 3 == 1 )//構文と制御式
				System.out.println("その値を3で割った余りは1です。");  //文字の出力
			else
				System.out.println("その値を3で割った余りは2です。");  //文字の出力
		
		else  //構文
			System.out.println("正ではない値が入力されました。");  //文字の出力

	}

}
