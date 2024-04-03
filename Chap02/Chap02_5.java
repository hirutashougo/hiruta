package Chap02;

import java.util.Scanner;
//クラスの宣言
public class Chap02_5 {
	//mainメソッドの宣言
	public static void main(String[] args) {
		//標準入力ストリーム
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("xの値:");        //xの値の入力を促す
		double x = stdIn.nextDouble();     //xの実数値を読み込む
		
		System.out.print("yの値:");       //yの値の入力を促す
		double y = stdIn.nextDouble();    //yの実数値を読み込む
		
		// x + 10の値を表示
		System.out.println("合計は" + ( x + y ) + "です。");
		// x - 10の値を表示
		System.out.println("平均は" + ( x + y ) / 2 + "です。");
				
	}
}