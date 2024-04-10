package Chap04.Exercises;

import java.util.Scanner;

/*
 * クラス名:Exercise04_11
 * 概要：List4-4を変更。for文を用いて記述する。
 * 作成者:S.Hiruta
 * 作成日:2024/04/10
 */
public class Exercise04_11 {

	/*
	 * 関数名：main
	 * 概要：入力した整数値から0までの整数値を表示していく処理
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：hiruta
	 * 作成日：2024/04/10
	*/
	public static void main(String[] args) {

		//Scannerクラスの変数の設定
		Scanner standardInput = new Scanner(System.in);

		//カウントダウン開始の表示
		System.out.println("カウントダウンします。");
		//正の整数の入力を促す
		System.out.print("正の整数値：");
		//入力する整数値の変数を定義
		int criteriaNumber = 0;
		//入力された正の整数を読み込む
		criteriaNumber = standardInput.nextInt();

		//正の整数が入力されるまで繰り返す処理
		while (criteriaNumber <= 0) {
			//正の整数の入力を促す
			System.out.print("正の整数値を入力してください：");
			//入力された正の整数を読み込む
			criteriaNumber = standardInput.nextInt();
		}
		
		/*入力した整数値からに達するまで、
		  1ずつデクリメントした数値を表示していく処理*/
		for (int i = criteriaNumber; i >= 0; i--) {
			//1ずつインクリメントした数値を表示する
			System.out.println(i);
		}
	}
}