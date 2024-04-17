package Chap06.Lists;

/*
 * クラス名:List06_10
 * 概要:配列の全要素の和を求めて表示(拡張for文)
 * 作成者:S.Hiruta
 * 作成日:2024/04/17
 */
public class List06_10 {

	/*
	 * 関数名：main
	 * 概要:配列の全要素の和を求めて表示(拡張for文 
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/17
	*/
	public static void main(String[] arg) {
		//double型配列の全要素を定義
		double[] numberArray = {1.0, 2.0, 3.0, 4.0, 5.0 };
		
		//定義した配列の全要素を表示する
		for (int i = 0; i < numberArray.length; i++) {
			//各インデックスの要素を表示していく
			System.out.println("a[" + i + "] = " + numberArray[i]);
		}
		
		//全要素の合計を求めるためのdouble型の変数を定義
		double elementSum = 0;
		//拡張for文による走査を用いて、要素の値の加算処理を行う
		for (double i : numberArray) {
			//要素の値を足していく
			elementSum += i;
		}
		
		//全要素の和を表示する
		System.out.println("全要素の和は" + elementSum + "です。");
	}
}
















