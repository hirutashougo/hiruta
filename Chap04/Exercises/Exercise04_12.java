package Chap04.Exercises;

import java.util.Scanner;

/*
 * クラス名:Exercise04_12
 * 概要：0から入力した正の整数値までのカウントアップを表示する
 * 作成者:S.Hiruta
 * 作成日:2024/04/10
 */
public class Exercise04_12 {

	/*
	 * 関数名：main
	 * 概要：0から入力した正の整数値までのカウントアップを表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：hiruta
	 * 作成日：2024/04/10
	 */
	public static void main(String[] args) {

		//Scannerクラスの変数の設定
		Scanner standardInput = new Scanner(System.in);

		//カウントダウン開始の表示
		System.out.println("カウントアップします。");
		//正の整数の入力を促す
		System.out.print("正の整数値：");
		//入力する整数値の変数を定義
		int criteriaNumer = 0;
		//入力された正の整数を読み込む
		criteriaNumer = standardInput.nextInt();

		//正の整数が入力されるまで繰り返す処理
		while (criteriaNumer <= 0) {
			//正の整数の入力を促す
			System.out.print("正の整数値を入力してください：");
			//入力された正の整数を読み込む
			criteriaNumer = standardInput.nextInt();
		}
		
		/*0から入力した整数値に達するまで、
		  1ずつインクリメントした数値を表示していく処理*/
		for (int i = 0; i <= criteriaNumer; i++) {
			//1ずつインクリメントした数値を表示する
			System.out.println(i);
		}
	}
}