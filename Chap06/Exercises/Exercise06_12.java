package Chap06.Exercises;

import java.util.Random;
import java.util.Scanner;

//乱数生成パッケージの読み込み
//Scannerの読み込み

/*
 * クラス名:Exercise06_12
 * 概要:配列の要素の並びをシャッフルして表示する
 * 作成者:S.Hiruta
 * 作成日:2024/04/18
 */
public class Exercise06_12 {

	/*
	 * 関数名：main
	 * 概要:配列の要素の並びをシャッフルして表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/18
	*/
	public static void main(String[] arg) {
		//Randomクラスの変数の定義
		Random randomNumber = new Random();
		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);

		//要素数の入力を促す
		System.out.print("要素数：");
		//入力された要素数を読み込む
		int elementCount = standardInput.nextInt();
		//正の整数で入力するように促す
		while (elementCount <= 0) {
			//正の整数で入力するように促す
			System.out.println("正の整数で入力してください。");
			//要素数の入力を促す
			System.out.print("要素数：");
			//入力された要素数を読み込む
			elementCount = standardInput.nextInt();
		}
		//要素数が正の整数で入力されるまで繰り返す処理
		int[] numberArray = new int[elementCount];

		//生成する乱数の範囲を表す定数の定義
		final int RANDOM_RANGE = 90;
		//生成する乱数の範囲を調節する定数の定義
		final int ADJUSTMENT_NUMBER = 10;
		//乱数を一時的に代入しておく変数の定義
		int assigmentVariable = 0;
		//処理の実行回数を後追いで記録する変数の定義
		int executionCount = 0;

		//入力された要素数の配列を宣言
		for (int i = 0; i < elementCount; i++) {
			//10～99の範囲に調整して乱数を生成し、各要素に代入
			numberArray[i] = ADJUSTMENT_NUMBER + randomNumber.nextInt(RANDOM_RANGE);
			//各要素に代入された値を表示
			System.out.println("a[" + i + "] = " + numberArray[i]);
		}

		//配列の要素のラベルの数値を格納する配列を宣言
		int[] randomElement = new int[elementCount];

		//要素の並びをランダムに並び替えたことを伝える
		System.out.println("要素の並びをシャッフルしました。");

		//配列の要素の順序をランダムに並べ替えていく
		for (int i = 0; i < elementCount; i++) {
			//処理が1回目の場合
			if (i == 0) {
				//要素数の範囲内で乱数を生成
				randomElement[i] = randomNumber.nextInt(elementCount);
				//	処理回数が2回以降の場合
			} else {
				//処理通過を判断するboolean型の変数を定義
				boolean judgementCount = false;
				do {
					//生成した乱数を一時的に代入用変数に格納
					assigmentVariable = randomNumber.nextInt(elementCount);
					//前段階までの配列の要素と、今回生成した乱数が被っていないか判断する処理
					for (executionCount = 0; executionCount < i; executionCount++) {
						//前段階までの配列の中に今回生成した乱数が存在する場合
						if (randomElement[executionCount] == assigmentVariable) {
							//この繰り返し処理を抜ける
							break;
						}
					}
					//前段階までの配列の要素の中に、今回生成した乱数が無い場合
					if (executionCount == i) {
						//要素に1つ前の要素と違う値が入るまで繰り返す処理を抜ける
						judgementCount = true;
					}
					//扱う要素とランダムに選んだ要素が被ったらやり直し
				} while (judgementCount == false);
				//配列の要素に、代入用変数に格納しておいた値を代入
				randomElement[i] = assigmentVariable;
			}
		}
		//シャッフルした配列を表示していく
		for (int i = 0; i < elementCount; i++) {
			//各要素の値を表示
			System.out.println("a[" + randomElement[i] + "] = " + numberArray[randomElement[i]]);
		}
	}
}
