package Chap06.Exercises;

/*
 * クラス名:Exercise06_02
 * 概要:int型で要素数5の配列において、要素の先頭から順に5,4,3,2,1の順に表示する
 * 作成者:S.Hiruta
 * 作成日:2024/04/16
 */
public class Exercise06_02 {

	/*
	 * 関数名：main
	 * 概要:int型で要素数5の配列において、要素の先頭から順に5,4,3,2,1の順に表示する 
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/16
	*/
	public static void main(String[] arg) {

		//要素数を表す定数の定義
		final int ELEMENT_COUNT = 5;
		//要素数5のint型配列を宣言
		int[] numberArray = new int[ELEMENT_COUNT];

		//要素の数だけ各インデックスに数値の代入を繰り返す
		for (int i = 0; i < numberArray.length; i++) {
			//インデックスに、要素数からインクリメントした数値を引いた値を代入
			numberArray[i] = numberArray.length - i;
		}
		//要素の数だけ各インデックスに代入された数値の表示を繰り返す
		for (int i = 0; i < numberArray.length; i++) {
			//各要素に代入された数値を表示
			System.out.println("a[" + i + "] = " + numberArray[i]);
		}
	}
}