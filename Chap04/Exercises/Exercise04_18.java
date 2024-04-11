package Chap04.Exercises;

import java.util.Scanner;

/*
 * クラス名:Exercise04_18
 * 概要：1から入力された値までの二乗値を表示する
 * 作成者:S.Hiruta
 * 作成日:2024/04/11
 */
public class Exercise04_18 {

	/*
	 * 関数名：main
	 * 概要：1から入力された値までの二乗値を表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/11
	*/
	public static void main(String[] args) {

		//Scannerクラスの変数の宣言
		Scanner standardInput = new Scanner(System.in);

		//入力される整数値の変数の宣言
		int integralNumber = 0;

		//整数値の入力を促す
		System.out.print("nの値：");
		//入力された整数値の読み込み
		integralNumber = standardInput.nextInt();

		//入力された整数値が正の整数ではない場合
		while (integralNumber <= 0) {
			//正の整数の入力を促す
			System.out.println("正の整数値を入力してください。");
			//再度、整数値の入力を促す
			System.out.print("nの値：");
			//入力された整数値の読み込み
			integralNumber = standardInput.nextInt();
		}
		
		//1から入力された整数値までの整数値の、2乗の値を表示するループ
		for (int i = 1; i <= integralNumber; ++i) {
			//インクリメントした数値の2乗値を算出
			int spuareValue = i * i;
			//インクリメントした数値の2乗値を出力
			System.out.println(i + "の2乗は" + spuareValue);
		}
	}
}