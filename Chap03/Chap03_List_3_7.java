package Chap03;

//読み込んだ整数値の行数(ゼロ/1行/2行以上)を判断

import java.util.Scanner;

public class Chap03_List_3_7 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値:");  //整数値の入力
		int n = stdIn.nextInt();      //整数値の読み込み
		
		if ( n == 0 )                           //ゼロ
			System.out.println("ゼロです。");
		else if ( n >= -9 && n <= 9  )          //1行
			System.out.println("1行です。");
		else                                    //2行以上
			System.out.println("2行以上です。");
			
	}

}