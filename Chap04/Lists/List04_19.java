package Chap04.Lists;

import java.util.Scanner;

/*
 * クラス名:List4_19
 * 概要：読み込んだ整数値を加算(負の値は加算しない)
 * 作成者:S.Hiruta
 * 作成日:2024/04/12
 */
public class List04_19 {

	/*
	 * 関数名：main
	 * 概要：読み込んだ整数値を加算(負の値は加算しない)
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：hiruta
	 * 作成日：2024/04/12
	*/
	public static void main(String[] args) {

		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);

		//整数値を加算することを伝える
		System.out.println("整数を加算します。");
		//何個加算するか聞く
		System.out.print("何個加算しますか：");
		//入力された個数を読み込む
		int countNumber = standardInput.nextInt();

		//合計値を表す変数を定義
		int integralSum = 0;
		//0が入力されるまで整数値の加算を繰り返す処理
		for (int i = 0; i < countNumber; i++) {
			//整数値の入力を促す
			System.out.print("整数値：");
			//入力された整数値を読み込む
			int integralNumber = standardInput.nextInt();
			//入寮された整数が負の場合
			if (integralNumber  < 0) {
			//負の整数は加算しないと表示
				System.out.println("負の整数は加算しません。");
			//処理の継続
				continue;
			}
			//入力された整数値は合計される
			integralSum += integralNumber;
		}
		//最終的な合計値を表示する
		System.out.println("合計値は" + integralSum + "です。");
	}
}
