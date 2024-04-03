package Chap03;

//読み込んだ整数値の符号を判定して表示

import java.util.Scanner;

public class Chap03_List_3_5 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値:");  //整数値の入力
		int n = stdIn.nextInt();     //整数値の読み込み
		
		if ( n > 0 )  //構文と制御式
			System.out.println("その値は正です。");  //文字の出力
		else if  ( n < 0 )  //構文と制御式
			System.out.println("その値は負です。");  //文字の出力
		else  //構文
			System.out.println("その値は0です。");  //文字の出力

	}

}
