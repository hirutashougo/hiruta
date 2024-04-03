package Chap03;

//読み込んだ二つの整数の差が10以上かどうか判定

import java.util.Scanner;

public class Chap03_11 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a:"); int a = stdIn.nextInt();//整数値の入力及び読み込み
		System.out.print("整数b:"); int b = stdIn.nextInt();//数値の入力及び読み込み
		
		if ( a - b >= 10 && a - b <= -10 )  //整数の差が10以下の場合
			//文字列の表示
			System.out.println("それらの差は10以下です。");
		
		else  //整数の差が10以上の場合
			//文字列の表示
			System.out.println("それらの差は10以上です。");
		
		
	}

}
