package Chap03;

//読み込んだ整数値が5の倍数であるかを判定して表示

import java.util.Scanner;

public class Chap03_5 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値:"); int n = stdIn.nextInt();  //整数値の入力と読み込み
		
		if ( n > 0 )  //構文と制御式
			if ( n % 5 == 0 )  //構文と制御式
				System.out.println("その値は5で割り切れます。");  //文字の出力
			else  //構文と制御式
				System.out.println("その値は5で割り切れません。");  //文字の出力
		
		else  //構文
			System.out.println("正ではない値が入力されました。");  //文字の出力

	}

}
