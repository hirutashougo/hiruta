package Chap04.Lists;

import java.util.Scanner;

/*
 * クラス名:List4_25
 * 概要:整数値と実数値を読み込んで表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/15
 */
public class List04_25 {

	/*
	 * 関数名：main
	 * 概要:整数値と実数値を読み込んで表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：hiruta
	 * 作成日：2024/04/15
	*/
	public static void main(String[] args) {
		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);

		//整数xの入力を促す
		System.out.print("整数x：");
		//入力された整数の読み込み
		int x = standardInput.nextInt();
		//実数yの入力を促す
		System.out.print("実数y：");
		//入力された実数の読み込み
		double y = standardInput.nextDouble();
		
		//整数と実数の出力
		System.out.printf("x = %3d y =%6.2f\n", x, y);
	}
}
