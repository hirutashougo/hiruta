package Chap03;

//読み込んだ二つの整数値の大小関係を判定して表示

import java.util.Scanner;

public class Chap03_4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値a:"); int a = stdIn.nextInt();  //整数値の入力と読み込み
		System.out.print("整数値b:"); int b = stdIn.nextInt();  //整数値の入力と読み込み
		
		if ( a > b )  //構文と制御式
			System.out.println("aの方が大きいです。");  //文字の出力
		else if  ( a < b )  //構文と制御式
			System.out.println("bの方が大きいです。");  //文字の出力
		else  //構文
			System.out.println("aとbは等しいです。");  //文字の出力

	}

}
