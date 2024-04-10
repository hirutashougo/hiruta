package Chap04.Exercises;

import java.util.Scanner;

/*
 * クラス名:Exercise04_10
 * 概要：List4-11を変更。1未満の入力の場合、改行文字を表示しない
 * 作成者:S.Hiruta
 * 作成日:2024/04/10
 */
public class Exercise04_10 {

	/*
	 * 関数名：main
	 * 概要：入力された個数の*を表示する(1未満の入力の場合、改行文字を表示しない)
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：hiruta
	 * 作成日：2024/04/10
	*/
	public static void main(String[] args) {

		//Scannerクラスの変数の宣言
		Scanner standardInput = new Scanner(System.in);
		
		//個数値の入力を促す
		System.out.print("何個*を表示しますか：");
		//*を表示する個数値の変数を定義
		int countNumber = 0;
		//個数値を読み込む
		countNumber = standardInput.nextInt();
		
		//正の整数が入力されるまで入力を促す
		while (countNumber <= 0) {
			//正の整数を入力するように促す
			System.out.print("正の整数を入力してください：");
			//再度、個数値を読み込む
			countNumber = standardInput.nextInt();
		}
		
		//個数値分の*を表示する
		for (int i = 0; i < countNumber; i++) {
			//*を表示する
			System.out.print("*");
		}
		
		//入力された個数値が1以上であるとき
		if (countNumber >= 1) {
		//改行文字を表示
		System.out.println();
		}

	}
}