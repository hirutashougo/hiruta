package Chap03;

//読み込んだ整数値は正の値か？

import java.util.Scanner;

public class Chap03_List_3_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値:");  //整数値の入力を促す
		int n = stdIn.nextInt();      //整数値の読み込み
		
		if ( n > 0 )  //制御式
			System.out.println("その値は正です。");  //文字の出力

	}

}
