package Chap04.Exercises;

import java.util.Scanner;

/*
 * クラス名:Exercise04_14
 * 概要：Exercise04_13の変更。出力結果を式の形にする。
 * 作成者:S.Hiruta
 * 作成日:2024/04/10
 */
public class Exercise04_17 {

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
		
		//開始する身長を初期条件0で定義
		int startHeight = 0;
		//終了する身長を初期条件0で定義
		int endHeight = 0;
		
		//開始する身長の入力
		do {
			if (startHeight <= 0) {
				//開始する身長の入力を促す
				System.out.println("何cmから：");
				//入力された身長を読み込む
				startHeight = standardInput.nextInt();
			}
			else {
				System.out.println("正の整数値で入力してください");
			}
		} while (startHeight <= 0);
		
		//終了する身長の入力
		do {
			if (endHeight < startHeight) {
				//終了する身長の入力を促す
				System.out.println("何cmから：");
				//入力された身長を読み込む
				endHeight = standardInput.nextInt();
			}
			else {
				System.out.println("初めの身長よりも大きい数値を入力してください");
			}
		} while (endHeight < startHeight);
		
		
		//標準体重を表示する
	}
}