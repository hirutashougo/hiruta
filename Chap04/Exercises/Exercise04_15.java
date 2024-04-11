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
		int startHeight = 0;
		//終了する身長を初期条件0で定義
		int endHeight = 0;
		//身長を表示する間隔の変数を初期条件0で定義
		int outputInterval = 0;

		//開始する身長の入力を促す
		System.out.print("何cmから：");
		//入力された身長値を読み込む
		startHeight = standardInput.nextInt();
		//正の整数ではない数値が入力された場合
		while (startHeight <= 100 ) {
			//正の整数値の入力を促す
			System.out.println("身長が100cm以下の場合は標準体重が出力できません。");
			//開始する身長の入力を促す
			System.out.print("何cmから：");
			//入力された身長値を読み込む
			startHeight = standardInput.nextInt();
		}

		//終了する身長の入力を促す
		System.out.print("何cmまで：");
		//入力された身長値を読み込む
		endHeight = standardInput.nextInt();
		//正の整数値でない数値が入力された場合
		while (endHeight <= startHeight) {
			//正の整数値の入力を促す
			System.out.println("初めの身長よりも大きい数値を入力してください");
			//終了する身長の入力を促す
			System.out.print("何cmまで：");
			//入力された身長値を読み込む
			endHeight = standardInput.nextInt();
		}

		//表示する身長の間隔の入力を促す
		System.out.print("何cmごと：");
		//入力された間隔値を読み込む
		outputInterval = standardInput.nextInt();
		//終了する間隔値の入力
		while (outputInterval <= 0) {
			//正の整数値の入力を促す
			System.out.println("正の整数値を入力してください");
			//表示する身長の間隔の入力を促す
			System.out.print("何cmごと：");
			//入力された間隔値を読み込む
			outputInterval = standardInput.nextInt();
		}
		
		//体重から減じる定数を定義
		final int subtractionNumber = 100;
		//標準体重の計算に用いる係数の分子の定数を定義
		final int numeratorNumber = 9;
		//標準体重の計算に用いる係数の定数を定義
		final int denominatorNumber = 10;
		//標準体重が整数であるか判別するために用いる定数を定義
		final int divisionNumber = 10;

		//出力に関する説明
		System.out.println("身長  " + "標準体重");
		
		//指定された身長の範囲内で、間隔値ごとに身長とその標準体重を出力する処理
		for (; startHeight <= endHeight;) {
			//身長の表示
			System.out.print(startHeight + "   ");
			//まず標準体重の10倍の値を計算
			int standardweight = (startHeight - subtractionNumber) *  numeratorNumber;
			//算出された標準体重の値が整数値でない(標準体重の10倍の値の1の位が0でない)場合
			if (standardweight % divisionNumber != 0) {
				//標準体重の整数値出力
				System.out.print(standardweight / denominatorNumber);
				//標準体重の小数点第一位の数値の出力
				System.out.println("." + (standardweight % divisionNumber));
			//標準体重が整数値の場合
			} else {
				//標準体重の出力
				System.out.println(standardweight / denominatorNumber);
			}
			//開始する身長に間隔値を足す
			startHeight += outputInterval;
		}
	}
}