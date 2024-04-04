package Chap03.Exercises;

//読み込んだ二つの整数値が約数関係にあるか

import java.util.Scanner;

public class Exercise03_02 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数A:"); int a = stdIn.nextInt();//整数値の入力及び読み込み
		System.out.print("整数B:"); int b = stdIn.nextInt();//整数値の入力及び読み込み
		
		if ( a % b == 0 )  //構文と制御式
			System.out.println("BはAの約数です。");  //文字の出力
		else  //構文
			System.out.println("BはAの約数ではありません。");  //文字の出力

	}

}