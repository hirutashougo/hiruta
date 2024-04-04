package Chap03.Exercises;

//読み込んだ整数の絶対値を表示する

import java.util.Scanner;

public class Exercise03_01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値:");  //整数値の入力
		int n = stdIn.nextInt();     //整数値の読み込み
		
		if ( n > 0 )  //構文と制御式
			System.out.println("その絶対値は" + n + "です。");  //文字の出力
		else if ( n == 0 )  //構文と制御式
			System.out.println("その絶対値は" + n + "です。");  //文字の出力
		else  //構文
			System.out.println("その絶対値は" + -n + "です。");  //文字の出力

	}

}