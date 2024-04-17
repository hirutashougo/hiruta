package Chap06.Exercises;

/*
 * クラス名:Exercise06_03
 * 概要:double型で要素数5の配列において、要素の先頭から順に1.1,2.2,3.3,4.4,5.5の順に表示する
 * 作成者:S.Hiruta
 * 作成日:2024/04/16
 */
public class Exercise06_03 {

	/*
	 * 関数名：main
	 * 概要:double型で要素数5の配列において、要素の先頭から順に1.1,2.2,3.3,4.4,5.5の順に表示する 
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/16
	*/
	public static void main(String[] arg) {

		//要素数を表す定数の定義
		final int ELEMENT_COUNT = 5;
		//小数点以下の算出に用いる定数の定義
		final int DECIMAL_CONSTANT = 10;
		//要素の数値の調節に用いる定数の定義
		final int ADJUSTMENT_CONSTANT = 1;

		//要素数5のint型配列を宣言
		double[] numberArray = new double[ELEMENT_COUNT];

		//要素の数だけ各要素に数値の代入を繰り返す
		for (int i = 0; i < numberArray.length; i++) {
			//要素の数値を調節し、double型の変数に代入する//////////
			double realNumber = i + ADJUSTMENT_CONSTANT;
			//要素に、double型に変換した数値を用いて算出した値を代入する
			numberArray[i] = realNumber + (realNumber / DECIMAL_CONSTANT);
		}
		//要素の数だけ各要素に代入された数値の表示を繰り返す
		for (int i = 0; i < numberArray.length; i++) {
			//各要素に代入された数値の表示
			System.out.println("a[" + i + "] = " + numberArray[i]);
		}
	}
}