package Chap07.Lists;

/*
* クラス名:List07_04
* 概要:3つの整数値の中から、最大値を求める
* 作成者:S.Hiruta
* 作成日:2024/04/19
*/
public class List07_04 {

	/*
	 * 関数名：max2
	 * 概要:2つの整数値の中から、最大値を求める
	 * 引数：整数値
	 * 戻り値：最大値
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/18
	*/
	static int max2 (int firstIntegral, int secondIntegral) {
		//最初に入力された整数が２番目に入力された整数よりも大きかった場合
		if (firstIntegral > secondIntegral) {
			//最初に入力された整数を返す
			return firstIntegral ;
			//最初に入力された整数が２番目に入力された整数以下の場合
		} else {
			//２番目に入力された整数を返す
			return secondIntegral;
		}
	}

}
