package Chap06.Lists;

/*
 * クラス名:List06_06
 * 概要:配列の各要素を1, 2, 3, 4, 5で初期化して表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/16
 */
public class List06_06 {

	/*
	 * 関数名：main
	 * 概要:配列の各要素を1, 2, 3, 4, 5で初期化して表示 
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/16
	*/
	public static void main(String[] arg) {
		//
		int[] a = {1, 2, 3, 4, 5};
		
		//
		for (int i = 0; i < a.length; i++) {
			//
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}