package Chap04.Exercises;

import java.util.Scanner;

/*
 * クラス名:Exercise04_14
 * 概要：Exercise04_13の変更。出力結果を式の形にする。
 * 作成者:S.Hiruta
 * 作成日:2024/04/10
 */
public class Exercise04_14 {

	/*
	 * 関数名：main
	 * 概要：1から入力された値までの数値の和を求める
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/10
	*/
	public static void main(String[] args) {

		//Scannerクラスの変数の宣言
		Scanner standardInput = new Scanner(System.in);
		
		//入力する整数値の変数を定義
		int criteriaNumber = 0;////////////////////////////
		
		//整数の入力を促す
		System.out.print("nの値：");
		//整数の読み込む
		criteriaNumber = standardInput.nextInt();
		
		//正の整数値が入力されない場合の処理
		while (criteriaNumber <= 0) {			

			//正の整数値を入力するように促す
			System.out.print("正の整数を入力してください:");
			//正の整数を読み込む
			criteriaNumber = standardInput.nextInt();
		}
		
		//出力する合計値の変数を定義
		int incrementSum = 0;
		
		/*0から入力した整数値に達するまで、
		  1ずつインクリメントした数値を足していき、
		  表示していく処理*/
		for (int i = 1; i <= criteriaNumber ; i++) {
			//合計値にインクリメントした整数を追加していく
			incrementSum += i;
			//合計値が初期の段階
			if (incrementSum == i) {
				////インクリメントした整数のみを表示
				System.out.print(i);
			//2回目以降の処理の場合
			} else {
				//「+」を含んだ変数iを表示
				System.out.print(" + " + i);
			}
		}
		
		//1から入力した整数値までの和を表示
		System.out.println(" = " + incrementSum);

	}
}