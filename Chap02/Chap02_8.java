package Chap02;

import java.util.Random;
import java.util.Scanner;
//クラスの宣言
public class Chap02_8 {
	//mainメソッドの宣言
	public static void main(String[] args) {
		//標準入力ストリーム
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値:");  //整数値の入力を促す
		int x = stdIn.nextInt();      //xに整数値を読み込む
		
		Random rand = new Random();
		
		int lucky = rand.nextInt(11);   //0～10の乱数
		
		//乱数の表示
		System.out.println("その値の±5の乱数を生成しました。それは" + (( lucky - 5) + x ) +  "です。");

	}

}