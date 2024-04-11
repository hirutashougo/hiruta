package Chap04.Exercises;

import java.util.Scanner;

/*
 * クラス名:Exercise04_16
 * 概要：Exercise04_11の変更。*を5個おきに改行して出力する。
 * 作成者:S.Hiruta
 * 作成日:2024/04/10
 */
public class Exercise04_16 {

	/*
	 * 関数名：main
	 * 概要：入力された個数だけ*を表示する。5個おきに改行する。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/10
	*/
	public static void main(String[] args) {
		
		//Scannerクラスの変数の宣言
		Scanner standardInput = new Scanner(System.in);
		
		//個数の入力を促す
		System.out.print("何個*を表示しますか：");
		//入力された個数を読み込む
		int countNumber = standardInput.nextInt();
		
		//個数に、正の整数が入力されるように繰り返す処理
		while (countNumber <= 0) {
			//正の整数を入力するように促す
			System.out.print("正の整数を入力してください：");
			//入力された個数を読み込む
			countNumber = standardInput.nextInt();
		}
		
		//個数が5の倍数であるか確かめる定数
		final int DIVISION_NUMBER = 5;
		
		//記号「*」を表示。個数の数だけ、5個おきに改行して表示する。
		for (int i = 1; i <= countNumber; i++) {
			//*の個数が5の倍数の場合
			if (i % DIVISION_NUMBER == 0) {
				//改行文字を含んで*を表示
				System.out.println("*");
			//*の個数が5の倍数ではない場合
			} else {
			//*を表示する
			System.out.print("*");
			}
		}
		//改行文字を表示
		System.out.println();

	}
}