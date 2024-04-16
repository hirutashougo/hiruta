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

		//要素数5のint型配列を宣言
		double [] numberArray = new double[5];
		
		//要素の数だけ各インデックスに数値の代入を繰り返す
		for (int i = 0; i < numberArray.length; i++) {
			//インクリメントする値を、double型の変数に代入する
			double realNumber = i;
			//インデックスに、double型に変換した数値を用いて算出した値を代入する
			numberArray[i] = realNumber + (realNumber / 10);
		}
		//要素の数だけ各インデックスに代入された数値の表示を繰り返す
		for (int i = 0; i < numberArray.length; i++) {
			//各インデックスに代入された数値の表示
			System.out.println("a[" + i + "] = " + numberArray[i]);
		}
	}
}