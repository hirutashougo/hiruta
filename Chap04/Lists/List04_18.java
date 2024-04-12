package Chap04.Lists;

import java.util.Scanner;

/*
 * クラス名:List4_18
 * 概要：読み込んだ整数値を加算(合計値が1,000を超えない範囲で計算する)
 * 作成者:S.Hiruta
 * 作成日:2024/04/12
 */
public class List04_18 {

	/*
	 * 関数名：main
	 * 概要：読み込んだ整数値を加算(合計値が1,000を超えない範囲で計算する)
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
			//0が入力されたら繰り返しを終了
			if (integralSum + integralNumber > 1000) {
				//合計値が1000を超えたことを伝える
				System.out.println("合計値が1,000を超えました。");
				//最後の数値は無視することを伝える
				System.out.println("最後の数値は無視します。");
				//繰り返しを抜ける
				break;
			}
			//入力された整数値は合計される
			integralSum += integralNumber;
		}
		//最終的な合計値を表示する
		System.out.println("合計値は" + integralSum + "です。");
	}
}
