package Chap02.Exercises;

import java.util.Scanner;
//クラスの宣言
public class Exercise02_06 {
	//mainメソッドの宣言
	public static void main(String[] args) {
		//標準入力ストリーム
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("底辺:");          //底辺の値の入力を促す
		double x = stdIn.nextDouble();      //底辺の実数値を読み込む
		
		System.out.print("高さ:");          //高さの値の入力を促す
		double y = stdIn.nextDouble();      //高さの実数値を読み込む
		
		// 面積の値を表示
		System.out.println("面積は" + ( x * y ) / 2 + "です。");

	}
}