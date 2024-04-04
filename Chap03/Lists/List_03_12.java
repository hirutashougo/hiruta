package Chap03.Lists;

//読み込んだ三つの整数のうち、最大値を表示

import java.util.Scanner;

public class List_03_12 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		//整数値の入力と読み込み
		System.out.print("整数a:"); int a = stdIn.nextInt();
		//整数値の入力と読み込み
		System.out.print("整数b:"); int b = stdIn.nextInt();
		//整数値の入力と読み込み
		System.out.print("整数b:"); int c = stdIn.nextInt();
				
		int max = a;             //maxをaの値で初期化
		if ( b > max ) max = b;  //bがmaxより大きい場合、bを代入
		if ( c > max ) max = c;  //cがmaxより大きい場合、cを代入
		
		//最大値を表示
		System.out.println("最大値は" + max + "です。");
		

	}

}
