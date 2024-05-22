package Chap03.Lists;

//読み込んだ整数値は正の値か？

import java.util.Scanner;

public class List_03_01 {

	public static void main(String[] args) {
		// test
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値:");  //整数値の入力を促す
		int n = stdIn.nextInt();      //整数値の読み込み
		
		if ( n > 0 )  //制御式
			System.out.println("その値は正です。");  //文字の出力

	}

}
