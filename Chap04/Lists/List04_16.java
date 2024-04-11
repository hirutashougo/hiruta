package Chap04.Lists;

import java.util.Scanner;
/*
 * クラス名:List4_16
 * 概要：左下が直角の直角三角形を表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/11
 */
public class List04_16 {

	/*
	 * 関数名：main
	 * 概要：左下が直角の直角三角形を表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：hiruta
	 * 作成日：2024/04/11
	*/
	public static void main(String[] args) {
		
		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);
		
		//どのような図形を出力するか説明
		System.out.println("左下直角の三角形を表示します。");
		//段数の入力を促す
		System.out.print("段数は：");
		//入力された段数値を読み込む
		int n = standardInput.nextInt();
		
		//「*」がインクリメントした数値分だけ表示されたら改行文字を表示
		for (int i = 1; i <= n; i++) {
			//「*」を左詰めでインクリメントした数値分だけ表示していく
			for (int j = 1; j <= i; j++) {
				//記号「*」を表示
				System.out.print('*');
			}
			//改行文字を表示
			System.out.println();
		}
	}
}
