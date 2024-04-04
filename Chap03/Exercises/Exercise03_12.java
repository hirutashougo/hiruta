package Chap03.Exercises;

//読み込んだ三つの整数のうち、最小値を表示

import java.util.Scanner;

public class Exercise03_12 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		//整数値の入力と読み込み
		System.out.print("整数a:"); int a = stdIn.nextInt();
		//整数値の入力と読み込み
		System.out.print("整数b:"); int b = stdIn.nextInt();
		//整数値の入力と読み込み
		System.out.print("整数b:"); int c = stdIn.nextInt();
				
		int min = a;             //mminをaの値で初期化
		if ( b < min ) min = b;  //bがminより小さい場合、bを代入
		if ( c < min ) min = c;  //cがminより小さい場合、cを代入
		
		//最小値を表示
		System.out.println("最小値は" + min + "です。");
		

	}

}