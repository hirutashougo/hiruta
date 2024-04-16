package Chap05.Lists;

import java.util.Scanner;

/*
 * クラス名:List05_03
 * 概要:関係演算子・透過演算子・理論否定演算子が生成する値の表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/15
 */
public class List05_03 {

	/*
	 * 関数名：main
	 * 概要:関係演算子・透過演算子・理論否定演算子が生成する値の表示 
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/15
	*/
	public static void main(String[] arg) {
		//Scannerクラスの変数の宣言
		Scanner standardInput = new Scanner(System.in);
		
		//
		System.out.print("整数a:");
		//
		int a = standardInput.nextInt();
		//
		System.out.print("整数b");
		//
		int b = standardInput.nextInt();
		
		//
		System.out.println("a < b = " + ( a < b));
		//
		System.out.println("a <= b = " + ( a <= b));
		//
		System.out.println("a > b = " + ( a > b));
		//
		System.out.println("a >= b = " + ( a >= b));
		//
		System.out.println("a == b = " + ( a == b));
		//	
		System.out.println("a != b = " + ( a != b));
		//
		System.out.println("!(a==0) = " + !( a == 0));
		//
		System.out.println("!(b==0) = " + !( b == 0));
	}
}