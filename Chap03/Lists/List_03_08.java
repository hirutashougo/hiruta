package Chap03.Lists;

//読み込んだ整数値の桁数(2桁以上かどうか)を判断

import java.util.Scanner;

public class List_03_08 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値:");  //整数値の入力
		int n = stdIn.nextInt();     //整数値の読み込み
		
		if ( n <= -10 || n >= 10 )                  //2桁以上
			System.out.println("2桁以上です。");
		
		else                                       //2桁未満
			System.out.println("2桁未満です。");

	}

}
