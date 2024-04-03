package Chap02;

import java.util.Scanner;
//クラスの宣言
public class Chap02_4 {
	//mainメソッドの宣言
	public static void main(String[] args) {
		//標準入力ストリーム
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値:");  //整数値の入力を促す
		int x = stdIn.nextInt();      //xに整数値を読み込む
		
		// x + 10の値を表示
		System.out.println("10を加えた値は" + ( x + 10 ) + "です。");
		// x - 10の値を表示
		System.out.println("10を減じた値は" + ( x - 10 ) + "です。");
				
	}

}