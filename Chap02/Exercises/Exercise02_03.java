package Chap02.Exercises;

import java.util.Scanner;
//クラスの宣言
public class Exercise02_03 {
	//mainメソッドの宣言
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値:");  //整数値の入力を促す
		int x = stdIn.nextInt();         //xに整数値を読み込む
		
		System.out.println( x + "と入力しましたね");       //整数値を表示
	}

}
