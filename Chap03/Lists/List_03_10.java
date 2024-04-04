package Chap03.Lists;

//読み込んだ二つの整数のうち、小さいほうの値を表示( if文 )

import java.util.Scanner;

public class List_03_10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		//整数値の入力と読み込み
		System.out.print("整数a:"); int a = stdIn.nextInt();
		//整数値の入力と読み込み
		System.out.print("整数b:"); int b = stdIn.nextInt();
		
		int min;          //小さいほうの値
		if ( a < b )      //構文と制御式
			min = a;
		else
			min = b;
		
		System.out.println("小さいほうの値は" + min + "です。");

	}

}
