package Chap03.Lists;

//スキャナのインポート
import java.util.Scanner;

//クラスの宣言
public class List_03_17 {
	/*
	・関数名：main
	・概要：switch文とbreak文の理解を深めるためのプログラム
	・引数：なし
	・戻り値：なし
	・作成者：hiruta
	・作成日：2024/04/03
	*/
	public static void main(String[] arg) {
		//入力ストリームの指定
		Scanner stdIn = new Scanner(System.in);
		
		//整数の入力を促す
		System.out.print("整数を入力せよ:");
		//入力された整数を読み込む
		int n = stdIn.nextInt();
		
		switch ( n ) {
		 case 0  : System.out.print("A");
		           System.out.print("B");
		           break;
		 case 2  : System.out.print("C");
		 case 5  : System.out.print("D");
		           break;
		 case 6  : 
		 case 7  : System.out.print("E");
		           break;
		 default : System.out.print("F");
                   break;
		}
		System.out.println();
		
	}
	
}