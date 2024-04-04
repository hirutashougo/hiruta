package Chap03.Exercises;

//読み込んだ三つの整数のうち、中央値を表示

import java.util.Scanner;

public class Exercise03_13 {

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
		
		int max = a;             //maxをaの値で初期化
		if ( b > max ) max = b;  //bがmaxより大きい場合、bを代入
		if ( c > max ) max = c;  //cがmaxより大きい場合、cを代入
		
		//中央値を表示
		System.out.println("中央値は" + ((a + b + c) - min - max) + "です。");
		

	}

}