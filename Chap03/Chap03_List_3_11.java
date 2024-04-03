package Chap03;

//読み込んだ二つの整数のうち、小さいほうの値を表示( 条件演算子 )

import java.util.Scanner;

public class Chap03_List_3_11 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		//整数値の入力と読み込み
		System.out.print("整数a:"); int a = stdIn.nextInt();
		//整数値の入力と読み込み
		System.out.print("整数b:"); int b = stdIn.nextInt();
		
		int min = a < b ? a : b;          //小さいほうの値
		System.out.println("小さいほうの値は" + min + "です。");

	}

}
