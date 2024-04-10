package Chap04.Exercises;

import java.util.Scanner;

/*
 * クラス名:Exercise04_15
 * 概要：入力された身長の標準体重を、入力された間隔で表示していく
 * 作成者:S.Hiruta
 * 作成日:2024/04/10
 */
public class Exercise04_15 {

	/*
	 * 関数名：main
	 * 概要：入力された身長の標準体重を、入力された間隔で表示していく
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/10
	*/
	public static void main(String[] args) {

		//Scannerクラスの変数の宣言
		Scanner standardInput = new Scanner(System.in);

		//開始する身長を初期条件0で定義
		double startHeight = 0;
		//終了する身長を初期条件0で定義
		double endHeight = 0;
		//身長を表示する間隔の変数を初期条件0で定義
		double outputInterval = 0;

		//開始する身長の入力を促す
		System.out.print("何cmから：");
		//入力された身長値を読み込む
		startHeight = standardInput.nextDouble();
		//正の整数ではない数値が入力された場合
		while (startHeight <= 0) {
			//正の整数値の入力を促す
			System.out.print("正の整数値で入力してください");
			//入力された身長値を読み込む
			startHeight = standardInput.nextDouble();
		}

		//終了する身長の入力を促す
		System.out.print("何cmから：");
		//入力された身長値を読み込む
		endHeight = standardInput.nextDouble();
		//終了する身長値の入力
		while (endHeight < startHeight) {
			//正の整数値の入力を促す
			System.out.print("初めの身長よりも大きい数値を入力してください");
			//入力された身長値を読み込む
			endHeight = standardInput.nextDouble();
		}

		//表示する身長の間隔の入力を促す
		System.out.print("何cmごと：");
		//入力された間隔値を読み込む
		outputInterval = standardInput.nextDouble();
		//終了する間隔値の入力
		while (outputInterval < 0) {
			//正の整数値の入力を促す
			System.out.print("正の整数値を入力してください");
			//入力された間隔値を読み込む
			outputInterval = standardInput.nextDouble();
		}

		//出力に関する説明
		System.out.println("身長   " + "標準体重");

		//指定された身長の範囲内で、間隔値ごとに身長とその標準体重を出力する処理
		for (; startHeight <= endHeight;) {
			//身長の表示
			System.out.print(startHeight + "  ");
			//標準体重の計算
			double standardweight = (startHeight - 100) * 0.9;
			//標準体重の出力
			System.out.println(standardweight);
			//開始する身長に間隔値を足す
			startHeight += outputInterval;
		}
	}
}