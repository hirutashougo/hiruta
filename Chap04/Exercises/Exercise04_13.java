package Chap04.Exercises;

import java.util.Scanner;

/*
 * クラス名:Exercise04_13
 * 概要：List4_10の変更。for文を用いて記述。
 * 作成者:S.Hiruta
 * 作成日:2024/04/10
 */
public class Exercise04_13 {

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
		
		//処理の説明を行う
		System.out.print("1～nまでの和を求めます。");
		//整数値の入力を促す
		System.out.print("nの値：");
		//*を表示する整数値の変数を定義
		int countNumber = 0;
		//整数値を読み込む
		countNumber = standardInput.nextInt();

		//正の整数が入力されるまで入力を促す
		while (countNumber <= 0) {
			//正の整数を入力するように促す
			System.out.print("正の整数を入力してください：");
			//再度、整数値を読み込む
			countNumber = standardInput.nextInt();
		}
		
		//出力する合計値の変数を定義
		int incrementSum = 0;
		
		/*0から入力した整数値に達するまで、
		  1ずつインクリメントした数値を足していく処理*/
		for (int i = 1; i <= countNumber; i++) {
			//合計値に1ずつインクリメントした数値を追加していく
			incrementSum += i;
		}
		
		//1から入力した整数値までの和を表示
		System.out.println("1から" + countNumber + "までの和は" + incrementSum + "です。");

	}
}