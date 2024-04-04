package Chap03.Exercises;

//読み込んだ二つの実数のうち、大きいほうの値を表示

import java.util.Scanner;

public class Exercise03_10 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a:"); int a = stdIn.nextInt();//整数値の入力及び読み込み
		System.out.print("整数b:"); int b = stdIn.nextInt();//数値の入力及び読み込み
		
		int distance = a >= b ? a - b : b - a;  //整数値の大小関係に応じた評価
		
		System.out.println("二つの整数の差は" + distance + "です。" );
	}

}
