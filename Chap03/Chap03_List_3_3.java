package Chap03;

//読み込んだ二つの整数値は等しいか

import java.util.Scanner;

public class Chap03_List_3_3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a:"); int a = stdIn.nextInt();//整数値の入力及び読み込み
		System.out.print("整数b:"); int b = stdIn.nextInt();//整数値の入力及び読み込み
		
		if ( a == b )  //構文と制御式
			System.out.println("二つの値は等しいです。");  //文字の出力
		
		else  //構文
			System.out.println("二つの値は等しくありません。");  //文字の出力

	}

}
