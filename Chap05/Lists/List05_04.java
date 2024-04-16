package Chap05.Lists;

import java.util.Scanner;

/*
 * クラス名:List05_04
 * 概要:二つの整数値の平均値を実数で求める(間違い)
 * 作成者:S.Hiruta
 * 作成日:2024/04/15
 */
public class List05_04 {

	/*
	 * 関数名：main
	 * 概要:二つの整数値の平均値を実数で求める(間違い) 
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/15
	*/
	public static void main(String[] arg) {
		//Scannerクラスの変数の宣言
		Scanner standardInput = new Scanner(System.in);
		
		System.out.println("整数値xと整数値yの平均値を求めます。");
		System.out.print("xの値");
		int x = standardInput.nextInt();
		System.out.print("yの値");
		int y = standardInput.nextInt();
		
		double ave =(x + y) / 2;
		System.out.println("xとyの平均値は" + ave + "です。");
	}
}