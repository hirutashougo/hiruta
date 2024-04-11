package Chap04.Exercises;

import java.util.Scanner;

/*
 * クラス名:Exercise04_14
 * 概要：Exercise04_13の変更。出力結果を式の形にする。
 * 作成者:S.Hiruta
 * 作成日:2024/04/10
 */
public class Exercise04_16 {

	/*
	 * 関数名：main
	 * 概要：Exercise04_13の変更。出力結果を式の形にする。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/10
	*/
	public static void main(String[] args) {
		
		//Scannerクラスの変数の宣言
		Scanner standardInput = new Scanner(System.in);
		
		
		//「*」の個数値の変数の定義
		int countNumber = 0;
		//「*」の個数値の入力を促す
		System.out.print("何個*を表示しますか：");
		//入力された個数値を読み込む
		countNumber = standardInput.nextInt();
		//正の整数ではない数値が入力された場合
		while (countNumber <= 0) {
			//正の整数値の入力を促す
			System.out.print("正の整数値で入力してください:");
			//入力された個数値を読み込む
			countNumber = standardInput.nextInt();
		}
		
		//個数を割る定数の定義
		final int divisionNumber = 5;

		//「*」を5個出力したら改行して出力しなおす
		for (int i = 1; i <= countNumber; i++) {
			//「*」の個数が5の倍数でない場合
			if (i % divisionNumber != 0) {
				//改行せずに「*」を表示
				System.out.print("*");
			//「*」の個数が5の倍数の場合
			} else {
				//改行して「*」を表示
				System.out.println("*");
			}
		}
	}
}